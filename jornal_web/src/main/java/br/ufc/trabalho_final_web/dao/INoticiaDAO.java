package br.ufc.trabalho_final_web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.trabalho_final_web.model.Noticia;
import br.ufc.trabalho_final_web.model.Secao;
import br.ufc.trabalho_final_web.model.Usuario;

public interface INoticiaDAO extends JpaRepository<Noticia, Long>{
	
	public List<Noticia> findByAtivaTrue();
	public List<Noticia> findBySecaoAndAtivaTrue(Secao s);
	public List<Noticia> findByUsuario(Usuario u);
/*
	
	public Noticia findByTitulo(String titulo);
	public List<Noticia> findByIdSecao (Long id);
	public List<Noticia> findAllOrderByDataNoticia();
*/
}