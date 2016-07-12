package br.ufc.trabalho_final_web.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.ufc.trabalho_final_web.criptografia.Criptografia;
import br.ufc.trabalho_final_web.dao.IClassificadoDAO;
import br.ufc.trabalho_final_web.dao.INoticiaDAO;
import br.ufc.trabalho_final_web.dao.ISecaoDAO;
import br.ufc.trabalho_final_web.dao.IUsuarioDAO;
import br.ufc.trabalho_final_web.model.Classificado;
import br.ufc.trabalho_final_web.model.Noticia;
import br.ufc.trabalho_final_web.model.Secao;
import br.ufc.trabalho_final_web.model.Usuario;
import br.ufc.trabalho_final_web.util.FileUtil;

@Controller
public class NoticiaController {
	
	@Autowired
	private INoticiaDAO nDAO;
	
	@Autowired
	private IUsuarioDAO uDAO;
	
	@Autowired
	private ISecaoDAO sDAO;
	
	@Autowired
	private IClassificadoDAO cDAO;
	
		
	@RequestMapping("/inserirNoticiaFormulario")
	public String gerenciarNoticias(Model model, HttpSession session){
		List<Secao> secoes = sDAO.findAll();
		model.addAttribute("secoes", secoes);
		
		model.addAttribute("usuario",session.getAttribute("usuario_logado"));
		return "noticia/inserir_noticia_formulario";
	}
		
	@RequestMapping("/inserirNoticia")
	public String inserirNoticia(Noticia noticia, HttpSession session, Long id){
			
		Usuario u = uDAO.findOne(((Usuario)session.getAttribute("usuario_logado")).getId());
		noticia.setUsuario(u);
		noticia.setId_autor(Integer.parseInt(u.getId().toString()));
			
		Date dat = new Date(System.currentTimeMillis());
		noticia.setData_noticia(dat);			
		noticia.setSecao(sDAO.findOne(id));
		
		noticia.setAtiva(true);
			
		this.nDAO.save(noticia);
		return "telaPrincipalJornalista";
	}
	
	//Desabilita uma noticia de um determinado jornalista, na tela de editor
	@RequestMapping("/desabilitarNoticiaEditor")
	public String desabilitarNoticiaEditor(Long id){
		Noticia n = this.nDAO.findOne(id);
		n.setAtiva(false);
		this.nDAO.save(n);
		return "telaPrincipalEditor";
	}
	
	//desabilita uma noticia de um determinado jornalista que precisa está logado
	@RequestMapping("/desabilitarNoticiaJornalista")
	public String desabilitarNoticia(Long id){
		Noticia n = this.nDAO.findOne(id);
		n.setAtiva(false);
		this.nDAO.save(n);
		return "telaPrincipalJornalista";
	}
	
	//para lista na tela principal
	@RequestMapping("/listarNoticia")
	public String listarPorSecao(Long id_secao, Model model){
		List<Secao> secoes = sDAO.findAll();
		model.addAttribute("secoes", secoes);
			
		List<Noticia> noticias = null;
		if(id_secao == -1){
			noticias = nDAO.findByAtivaTrue();
		}else{
			Secao s = sDAO.findOne(id_secao);
			noticias = nDAO.findBySecaoAndAtivaTrue(s);
		}
		model.addAttribute("noticias", noticias);
		return "telaPrincipalEditor";
	}
	
	//lista noticias de um respectivo jornalista, a condição está implementada na jsp
	@RequestMapping("/listarNoticias")
	public String listarNoticias(Model model){
		List<Noticia> noticias = nDAO.findAll();
		model.addAttribute("noticias", noticias);
		return "telaPrincipalJornalista";
	}
	
	//lista todas as noticias para um determinado editor, a condição esta implementada na jsp
	@RequestMapping("/listarNoticiasEditor")
	public String listarNoticiasEditor(Model model){
		List<Noticia> noticias = nDAO.findAll();
		model.addAttribute("noticias", noticias);
		return "telaPrincipalEditor";
	}
	
	@RequestMapping("/listarNoticiasLeitor")
	public String listarNoticiasLeitor(Model model){
		List<Noticia> noticias = nDAO.findAll();
		model.addAttribute("noticias", noticias);
		return "telaPrincipalLeitor";
	}
}
