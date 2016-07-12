<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Blog - Business Casual - Start Bootstrap Theme</title>

    <!-- Bootstrap Core CSS -->
    <link href="../../resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../../resources/css/business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
</head>
<body>

	<div class="brand">Jornal Casual</div>
    <div class="address-bar">Universidade Federal do Ceará | Quixadá, CE 99 | Raimundo Matheus</div>
    
    <div class="container">
		<div class="col-lg-12 text-center">
                    <ul class="pager">
                        <li class="previous"><a href="listarNoticias" type="submit" class="btn btn-default btn-lg">Voltar</a>
                        </li>
                    </ul>
        </div>
        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">Cadastre uma Nova
                        <strong>Noticia</strong>
                    </h2>
                    <hr>
                </div>
               
               <div class="col-lg-12 text-left">
               	<img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">
                
                <form action="inserirNoticia" method="POST">
                
                	<select name="id" >
						<c:forEach var="sec" items = "${secoes}">
					 <option value="${sec.id}">${sec.titulo}</option>
						</c:forEach>
					</select>
                
                <label>Nome do Jornalista:</label> <input type="text" value="${usuario.nome}" /> <br />
			    <br>
			   	
			   	<label>Título:</label> <input type="text" name="titulo" /> <br />
			     <br>
			     <label>Subtítulo:</label> <input type="text" name="subtitulo" /> <br />
			     <br>
			     <label>Texto:</label> <textarea rows="10" cols="45" name="texto"></textarea>
			     
			     <input  type="hidden" name="id" value="${usuario_logado.id}"><br/>
			     
				<input id="btnSalvar" class="btn btn-default btn-lg" type="submit" value="Cadastrar" />
                </form>
                </div>
                
            </div>
        </div>

    </div>





<!--  
<form action="inserirNoticia" method="POST">
		
		<div class="title">
        	<h1 align="center">CADASTRAR NOTÍCIA</h1>
    	</div>
		
		<select name="id" >
			<c:forEach var="sec" items = "${secoes}">
				<option value="${sec.id}">${sec.titulo}</option>
			</c:forEach>
		</select>
		<input type="text" value="${usuario.nome}" />
		<br/>
		Titulo: <input type="text" name="titulo" />
		<br/>
		Sub-Titulo: <input type="text" name="subtitulo" />
		<br/>
		Texto: <textarea rows="10" cols="45" name="texto"></textarea>
		<br/>
		<input  type="hidden" name="id" value="${usuario_logado.id}">
		<br/>		
		<input type="submit" value="ENVIAR"/>
		<br/>
	</form>
	-->
</body>
</html>