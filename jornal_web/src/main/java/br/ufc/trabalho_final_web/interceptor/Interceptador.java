package br.ufc.trabalho_final_web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.ufc.trabalho_final_web.model.Usuario;

@Component
public class Interceptador extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		String uri = request.getRequestURI();
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario_logado");
		int papel = 0;
		
		if(request.getSession().getAttribute("papel") != null){
			papel = (int) request.getSession().getAttribute("papel");
		}
		
		
		if(uri.endsWith("/") ||  uri.endsWith("inserirUsuario") || uri.endsWith("inserirJornalista") || uri.endsWith("telaLogin") || 
			uri.endsWith("login") || uri.endsWith("listarNoticiasEditor") || 
			uri.contains("listarNoticiasJornalista") || uri.endsWith("listarNoticiasLeitor")){
			return true;
		}
		
		if(usuario != null){
			
			if(uri.endsWith("/") ||  uri.endsWith("cadastrarUsuario") || uri.endsWith("login") || 
				uri.endsWith("logout")){
				return true;
			}
			
			if(papel == 3){
				if(uri.endsWith("telaPrincipalLeitor")){
					return true;
				}
			}else if(papel == 1){
				if(uri.endsWith("inserirSecao") || uri.endsWith("inserirJornalista")  || uri.endsWith("inserirClassificado") ||  uri.endsWith("listarNoticia")  || uri.endsWith("desabilitarNoticiaEditor")){
					return true;
				}
				
				if(uri.endsWith("telaPrincipalEditor")){
					return true;
				}
			}else{
				if(uri.endsWith("telaPrincipalJornalista") || uri.endsWith("desabilitarNoticiaJornalista") || uri.endsWith("inserirNoticia")){
					return true;
				}
			}
			response.sendRedirect("/login");
			return false;
		}
		response.sendRedirect("/");
		return false;
	}
}
