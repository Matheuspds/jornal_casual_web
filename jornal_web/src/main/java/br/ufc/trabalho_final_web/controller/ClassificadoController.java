package br.ufc.trabalho_final_web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.trabalho_final_web.dao.IClassificadoDAO;
import br.ufc.trabalho_final_web.dao.IUsuarioDAO;
import br.ufc.trabalho_final_web.model.Classificado;
import br.ufc.trabalho_final_web.model.Usuario;

@Controller
public class ClassificadoController {
	
	@Autowired
	private IClassificadoDAO cDAO;
	
	@Autowired
	private IUsuarioDAO uDAO;
	
	@RequestMapping("/inserirClassificadoFormulario")
	public String inserirClassificadoFormulario(HttpSession session){
		session.getAttribute("usuario_logado");
		return "classificado/inserir_classificado_formulario";
	}
	
	@RequestMapping("/inserirClassificado")
	public String inserirClassificado(Long id, Classificado classificado){
		Usuario usuario = uDAO.findOne(id);
		System.out.println(id);
		classificado.setUsuario(usuario);
		
		List<Classificado> classificados = new ArrayList<>();
		usuario.setClassificados(classificados);
		cDAO.save(classificado);
		
		return "home";
	}
		
	
	
	@RequestMapping("/listarClassificado")
	public String listarClassificado(Model model){
		List<Classificado> classificados = cDAO.findAll();
		model.addAttribute("classificados", classificados);
		return "classificado/listar_classificado";
	}
	
	
	@RequestMapping("/apagarClassificado")
	public String apagarClassificado(Long id, HttpSession session){
		cDAO.delete(id);
		return "home";
	}
	
	@RequestMapping("/alterarClassificadoFormulario")
	public String alterarClassificadoFormulario(Long id, Model model){
		Classificado classificado = cDAO.findOne(id);
		model.addAttribute("classificado", classificado);
		return "classificado/alterar_classificado_formulario";
	}
	
	@RequestMapping("/alterarClassificado")
	public String alterarClassificado(Classificado c, HttpSession session){
		c.setUsuario(uDAO.findOne(c.getId_autor()));
		c.setData_oferta(new Date());
		cDAO.save(c);
		return "home";
	}
	
	@RequestMapping("/inserirOfertaFormulario")
	public String inserirOfertaFormulario(Long id, Model model){
		Classificado c = cDAO.findOne(id);
		model.addAttribute("classificado",c);
	
		return "classificado/inserir_oferta_formulario";
	}
	
	@RequestMapping("/inserirOferta")
	public String inserirOferta(Long idClass, String texto, HttpSession session){
		Classificado ac = cDAO.findOne(idClass);
		float valor = Float.parseFloat(texto);
		
		if (ac.getMelhor_oferta() == null) {
			if(valor > ac.getPreco()){			
				Date data = new Date();
				ac.setData_oferta(data);
				ac.setMelhor_oferta(valor);
				this.cDAO.save(ac);
				List<Classificado> classificados = this.cDAO.findAll();
				session.setAttribute("classificados", classificados); 
			}
		}else{
			if(ac.getMelhor_oferta() < valor || valor > ac.getPreco()){			
				Date data = new Date();
				ac.setData_oferta(data);
				ac.setMelhor_oferta(valor);
				this.cDAO.save(ac);
				List<Classificado> classificados = this.cDAO.findAll();
				session.setAttribute("classificados", classificados); 
			}
		}
		return "classificado/listar_classificado";
	}

	@RequestMapping("/inserirOfertaLeitor")
	public String inserirOfertaLeitor(Long idClass, String texto, HttpSession session){
		Classificado ac = cDAO.findOne(idClass);
		float valor = Float.parseFloat(texto);
		
		if (ac.getMelhor_oferta() == null) {
			if(valor > ac.getPreco()){			
				Date data = new Date();
				ac.setData_oferta(data);
				ac.setMelhor_oferta(valor);
				this.cDAO.save(ac);
				List<Classificado> classificados = this.cDAO.findAll();
				session.setAttribute("classificados", classificados); 
			}
		}else{
			if(ac.getMelhor_oferta() < valor || valor > ac.getPreco()){			
				Date data = new Date();
				ac.setData_oferta(data);
				ac.setMelhor_oferta(valor);
				this.cDAO.save(ac);
				List<Classificado> classificados = this.cDAO.findAll();
				session.setAttribute("classificados", classificados); 
			}
		}
		return "telaPrincipalLeitor";
	}
	
	@RequestMapping("/listarClassificadoLeitor")
	public String listarClassificadoLeitor(Model model){
		List<Classificado> classificados = cDAO.findAll();
		model.addAttribute("classificados", classificados);
		return "telaPrincipalLeitor";
	}
	
	
}
