package br.ufc.trabalho_final_web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.trabalho_final_web.criptografia.Criptografia;
import br.ufc.trabalho_final_web.dao.IClassificadoDAO;
import br.ufc.trabalho_final_web.dao.INoticiaDAO;
import br.ufc.trabalho_final_web.dao.IPapelDAO;
import br.ufc.trabalho_final_web.dao.IUsuarioDAO;
import br.ufc.trabalho_final_web.model.Classificado;
import br.ufc.trabalho_final_web.model.Noticia;
import br.ufc.trabalho_final_web.model.Papel;
import br.ufc.trabalho_final_web.model.Usuario;

@Controller
public class LoginController {
	@Autowired
	private IUsuarioDAO uDAO;
	
	@Autowired
	private IPapelDAO pDAO;
	
	@Autowired
	private INoticiaDAO nDAO;
	
	@Autowired
	private IClassificadoDAO cDAO;
	@RequestMapping("/realizarLoginFormulario")
	public String realizarLoginFormulario(){
		return "login/realizar_login_formulario";
	}
	
	@RequestMapping("/telaLogin")
	public String telaLogin(Model model){
		List<Papel> papeis = pDAO.findAll();
		model.addAttribute("papeis", papeis);
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(Usuario usuario, Long idPapel, BindingResult result, HttpSession session, Model model){
		
		Usuario u = uDAO.findByLoginAndSenha(usuario.getLogin(), Criptografia.criptografa(usuario.getSenha()));
		
		if(u != null){
			Papel papel = pDAO.findOne(idPapel);
			for(int i = 0; i < u.getPapeis().size(); i++){
				if(papel.getPapel().equals(u.getPapeis().get(i).getPapel())){
					session.setAttribute("usuario_logado", u);
					if(papel.getPapel().equals("jornalista")){
						return "telaPrincipalJornalista";
					}
					if(papel.getPapel().equals("editor")){
						return "telaPrincipalEditor";
					}
					if(papel.getPapel().equals("leitor")){
						List<Noticia> noticias = nDAO.findAll();
						List<Classificado> classificados = cDAO.findAll();
						model.addAttribute("noticias", noticias);
						model.addAttribute("classificados", classificados);
						return "telaPrincipalLeitor";
					}
				}
			}	
		}
		
		return "redirect:telaLogin";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:telaLogin";
	}
}
