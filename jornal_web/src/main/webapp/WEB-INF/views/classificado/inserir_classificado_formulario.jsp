<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="inserirClassificado?id=${usuario_logado.id}" method="post">
		
		<div class="title">
        	<h1 align="center">CADASTRAR CLASSIFICADO</h1>
    	</div>
		
		Titulo: <input type="text" name="titulo" /> <br />
		Texto: <textarea rows="10" cols="45" name="texto"></textarea> <br /> 
		Preço: <input type="text" name="preco" /> <br />
		Telefone: <input type="text" name="telefone" /> <br />
		<input type="submit" value="ENVIAR" />
		<br/>
	</form>
</body>
</html>