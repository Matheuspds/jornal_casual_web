<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
			<h5>Tela para Cadastro</h5>
			   <input name="nome" type="text" class="validate">
			   	<label for="nome">Nome</label>
			   
				<input name="email" type= "text" class="validate">
			    <label for="email">Email</label>
			     
				<input id="login" name="login" type="text" class="validate" onblur="verificar()">
			    <label for="nome">Login para acesso</label>
			    
			   	<input name="senha" type="password" class="validate">
			    <label for="password">Senha</label>
			       
			    <span>Imagem</span>
			    <input name="imagem" type="file">
			    <input class="file-path validate" type="text">
			      
				<input id="btnSalvar" class="btn" type="submit" value="Cadastrar" />
				<a class="btn" href="/" type="submit"> <button>Voltar</button></a>
				
		</center>
</body>
</html>