package br.ufc.trabalho_final_web.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.trabalho_final_web.dao.IComentarioDAO;
import br.ufc.trabalho_final_web.dao.INoticiaDAO;
import br.ufc.trabalho_final_web.dao.IUsuarioDAO;
import br.ufc.trabalho_final_web.model.Comentario;
import br.ufc.trabalho_final_web.model.Noticia;
import br.ufc.trabalho_final_web.model.Secao;
import br.ufc.trabalho_final_web.model.Usuario;

@Controller
public class ComentarioController {
	
	@Autowired
	private IComentarioDAO cDAO;
	
	@Autowired
	private IUsuarioDAO uDAO;
	
	@Autowired
	private INoticiaDAO nDAO;
		
	@RequestMapping("/inserirComentario")
	public String inserirComentario(HttpSession session, Comentario com, Long idNoticia, Model model){
		Usuario u = uDAO.findOne(((Usuario)session.getAttribute("usuario_logado")).getId());
		com.setUsuario(u);
		com.setId_autor(u.getId());
			
		Calendar ca = Calendar.getInstance();
		com.setData(ca);
		com.setNoticia(nDAO.findOne(idNoticia));		
		
		this.cDAO.save(com);
				
		return "redirect:listarNoticiasLeitor";
	}
}	
