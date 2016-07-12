<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<a class="btn" href="/gerenciarNoticias"><button>Gerenciar Noticias</button></a>
	<ul class="dropdown-content" id="editor">
		<li><a href="/cadastrosEditor">butto<button>Gerenciar Cadastros</button></a></li>
	</ul>
	<ul id="papel" class="dropdown-content">
		<c:forEach var="papel" items="${usuario_logado.papeis}" >
			<li value="${papel.papel }" id="${papel.id }" ><a href="#" onclick="mudarPapel(${papel.id })">${papel.papel }</a></li>
		</c:forEach>
	</ul>
	</center>
</body>
</html>