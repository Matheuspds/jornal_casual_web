package br.ufc.trabalho_final_web.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.ufc.trabalho_final_web.criptografia.Criptografia;
import br.ufc.trabalho_final_web.dao.IPapelDAO;
import br.ufc.trabalho_final_web.dao.IUsuarioDAO;
import br.ufc.trabalho_final_web.model.Papel;
import br.ufc.trabalho_final_web.model.Usuario;

@Controller
public class UsuarioController {
	
	@Autowired
	private IUsuarioDAO uDAO;
	
	@Autowired
	private IPapelDAO pDAO;
	
	
	@RequestMapping("/inserirUsuarioFormulario")
	public String cadastrarUsuarioFormulario(Model model){
		/*
		Usuario aux = new Usuario();
		aux.setNome("");
		model.addAttribute("usuario_login", aux);
		*/
		return "usuario/inserir_usuario_formulario";
	}

	@RequestMapping("/inserirUsuario")
	public String cadastrarUsuario(Usuario usuario,Model model){
		List<Papel> papeis = pDAO.findAll();
		Papel papel = new Papel();
		for (Papel p : papeis) {
			if(p.getPapel().equals("leitor"))
			{
				papel = p;
			}
		}
		List<Papel> papeisLeitor = new ArrayList<Papel>();
		papeisLeitor.add(papel);
		usuario.setPapeis(papeisLeitor);
		usuario.setSenha(Criptografia.criptografa(usuario.getSenha()));
		usuario.setAtivo(true);
		uDAO.save(usuario);
		model.addAttribute("usuario_login", usuario);
		
		return "redirect:telaLogin";
	}
	
	@RequestMapping("inserirJornalistaFormulario")
	public String formularioJornalista() {
		return "usuario/inserir_jornalista_formulario";
	}
	
	@RequestMapping("/inserirJornalista")
	public String inserirJornalista(Usuario usuario){
		usuario.setSenha(Criptografia.criptografa(usuario.getSenha()));
		
		List<Papel> papeis = new ArrayList<Papel>();
		for (Papel papel : usuario.getPapeis()) {
			papeis.add(pDAO.findOne(papel.getId()));
		}
		usuario.setPapeis(papeis);
		usuario.setAtivo(true);
		
		this.uDAO.save(usuario);
		
		return "telaPrincipalEditor";
	}
	
	@RequestMapping("/removerJornalista")
	public String removerJornalista(Long id){
		Usuario usuario = this.uDAO.findOne(id);
		usuario.setAtivo(false);
		this.uDAO.save(usuario);
		return "home";
	}
}
