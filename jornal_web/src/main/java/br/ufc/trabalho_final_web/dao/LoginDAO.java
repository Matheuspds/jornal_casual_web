package br.ufc.trabalho_final_web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import br.ufc.trabalho_final_web.model.Usuario;



public class LoginDAO implements ILoginDAO{
	
	@PersistenceContext
	private EntityManager manager;
	
	public Usuario getBuscarPorLogin(Usuario usuario){
		String hql = "select u from USUARIO u where u.login='" + usuario.getLogin() + "'";
		List<?> resultado = manager.createQuery(hql).getResultList();
		if(!resultado.isEmpty()){
			return manager.createQuery(hql, Usuario.class).getResultList().get(0);
		}
		return null;
	}
}
