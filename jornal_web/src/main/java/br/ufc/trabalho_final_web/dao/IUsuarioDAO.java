package br.ufc.trabalho_final_web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.trabalho_final_web.model.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long>{
	
	public Usuario findByLoginAndSenha(String login, String senha);
}
