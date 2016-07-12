<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Secao</title>
</head>
<body>

	<form action="alterarSecao" method="POST">
	
	<div class="title">
       	<h1 align="center">ALTERAR SEÇÃO</h1>
    </div>
	 
	<input type="hidden" name="idSecao" value="${secao.idSecao}" />
	Titulo: <input type="text" name="titulo" value="${secao.titulo}" /><br />
	Descrição: <input type="text" name="descricao" value="${secao.descricao}" /><br />
	
	<input type="submit" value="ALTERAR" />
	
	</form> 
	
	
</body>
</html>