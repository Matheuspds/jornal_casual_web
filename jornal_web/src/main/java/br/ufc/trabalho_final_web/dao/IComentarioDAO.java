package br.ufc.trabalho_final_web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.trabalho_final_web.model.Comentario;

public interface IComentarioDAO extends JpaRepository<Comentario, Long>{

}
