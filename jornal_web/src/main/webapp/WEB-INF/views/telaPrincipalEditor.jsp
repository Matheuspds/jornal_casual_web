<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <link href="../resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../resources/css/business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
</head>
<body>

	<!-- Cabeçalho da página -->	
	<div class="brand">Jornal Casual</div>
    <div class="address-bar">Universidade Federal do Ceará | Campus Quixadá | Raimundo Matheus</div>


	<nav class="navbar navbar-default" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!-- navbar-brand is hidden on larger screens, but visible when the menu is collapsed -->
                <a class="navbar-brand" href="index.html">Business Casual</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="inserirClassificadoFormulario">Inserir Classificado</a>
                    </li>
                    <li>
                        <a href="inserirSecaoFormulario">Inserir Seção</a>
                    </li>
                    <li>
                        <a href="inserirJornalistaFormulario">Inserir Jornalista</a>
                    </li>
                    <li>
                    	<a href="logout">Logout</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>


   <div class="container">
        <div class="row">
            <div class="box">
                
                <div class="col-lg-12 text-center">
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">
                    
                    <a href="listarNoticiasEditor"> <h3>Listar Noticias</h3> </a>
                    <c:forEach var="noticia" items="${noticias}">
						<c:if test="${noticia.ativa}">
                    	<h2>${noticia.titulo}
                        <br>
                        <small>Data: ${noticia.data_noticia}</small>
                    </h2>
                    <p>Subtítulo: ${noticia.subtitulo}</p>
                    <a href="desabilitarNoticiaEditor?id=${noticia.id}" class="btn btn-default btn-lg">APAGAR</a>
                    <hr>
                    	</c:if>
					</c:forEach>
                </div>
            </div>
        </div>

    </div>





<!-- 

	<h4>Oi eu sou um editor</h4>
	<a href="inserirClassificadoFormulario"> <b>Inserir Classificado</b></a>
	<a href="inserirSecaoFormulario"> <b>Inserir Secao</b></a>
	<a href="inserirJornalistaFormulario"> <b>Inserir Jornalista</b></a>
	
	<h2>LISTAR NOTICIAS</h2>
	<a href="listarNoticiasEditor">Listar Noticias </a>
	<table border="1">
	<c:forEach var="noticia" items="${noticias}">
		<c:if test="${noticia.ativa}">
			<tr>
				<td>${noticia.titulo}</td>
				<td>${noticia.subtitulo}</td>
				<td>${noticia.data_noticia}</td>
				<td><a href="desabilitarNoticiaEditor?id=${noticia.id}">APAGAR</a></td>
			</tr>
		</c:if>
	</c:forEach>
	</table>	
 -->
</body>
</html>