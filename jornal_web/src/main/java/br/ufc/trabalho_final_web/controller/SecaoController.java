package br.ufc.trabalho_final_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.trabalho_final_web.dao.ISecaoDAO;
import br.ufc.trabalho_final_web.model.Secao;


@Controller
public class SecaoController {
	
	@Autowired
	private ISecaoDAO sDAO;
	
	@RequestMapping("/inserirSecaoFormulario")
	public String inserirSecaoFormulario(){
		return "secao/inserir_secao_formulario";
	}
	
	@RequestMapping("/inserirSecao")
	public String inserirSecao(Secao secao){
		sDAO.save(secao);
		return "telaPrincipalEditor";
	}
	
	@RequestMapping("/alterarSecaoFormulario")
	public String alterarSecaoFormulario(Long id, Model model){
		Secao secao = sDAO.findOne(id);
		model.addAttribute("secao", secao);
		return "secao/alterar_secao_formulario";
	}
	
	@RequestMapping("/alterarSecao")
	public String alterarSecao(Secao secao){
		sDAO.save(secao);
		return "telaPrincipalEditor";
	}
}
