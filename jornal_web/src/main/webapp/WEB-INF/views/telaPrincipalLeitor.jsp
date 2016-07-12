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
                        <a href="listarClassificado">Classificados</a>
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
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <h2>Notícias</h2>
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">
                    <a href="listarNoticiasLeitor"></a>
                    <c:forEach var="noticia" items="${noticias}">
						<c:if test="${noticia.ativa}">
                    	<h2>${noticia.secao.titulo}
                    	<br>
                    	<small>${noticia.titulo}</small>
                        <br>
                        <small>Data: ${noticia.data_noticia}</small>
                    </h2>
                    <p>Subtítulo: ${noticia.subtitulo}</p>
                    <br>
                   <p>Texto: ${noticia.texto}</p>
                    <hr>
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    	<p>Comentários</p>
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    
                    <c:forEach var="comentario" items="${noticia.comentarios}">
						<p>${comentario.usuario.nome} : ${comentario.texto}
						
					</c:forEach>
					<form action="inserirComentario" method="post">
	
						<div>
							<textarea name="texto" id="texto" cols="30"></textarea>
						</div>
						<input type="hidden" name="idNoticia" value="${noticia.id}">
						<input type="submit" name="Comentar">
					</form>
                    	</c:if>
                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">  
                                      
                    
					</c:forEach>
                </div>
             
             <div class="col-lg-12 text-center">
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <h2>Classificados</h2>
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">
                    	
                    
                    
                    
                    <a href="listarClassificadoLeitor"></a>
                    <c:forEach var="classificado" items="${classificados}">
                    	<h2>Titulo: ${classificado.titulo}
                    	<br>
                    </h2>
                    <p>Texto: ${classificado.texto}</p>
                    <br>
                   <p>Preço: ${classificado.preco}</p>
                    <hr>
                    <small>Telefone: ${classificado.telefone}</small>
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    	<p>Melhor Oferta</p>
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                   	    <p>Preço: ${classificado.melhor_oferta}</p>
                   	
                   <form action="inserirOfertaLeitor" method="post">
	
						<div>
						<label>Nova oferta:</label> <input type="text" name="texto"/>	
						</div>
						<input type="hidden" name="idClass" value="${classificado.id}">
						<input type="submit" name="Comentar">
					</form>
      
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    <img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">                    
                    
					</c:forEach>
                </div>
                
             
            </div>
        </div>

    </div>

<!--  
	h2<h2>Aqui fica a tela de leitor</h2>
	<h2>LISTAR NOTICIAS</h2>
	<a href="listarNoticiasLeitor">Listar Noticias </a>
	<table border="1">
	<c:forEach var="noticia" items="${noticias}">
			<c:if test="${noticia.ativa}">
				<tr>
					<td>${noticia.secao.titulo}</td>
					<td>${noticia.titulo}</td>
					<td>${noticia.subtitulo}</td>
					<td>${noticia.texto}</td>
					<td>${noticia.data_noticia}</td>
					<c:forEach var="comentario" items="${noticia.comentarios}">
						<td>${comentario.usuario.nome}</td>
						<td>${comentario.texto}</td>
					</c:forEach>
				</tr>
		<form action="inserirComentario" method="post">
	
		<div>
			<textarea name="texto" id="texto" cols="30"></textarea>
		</div>
		<input type="hidden" name="idNoticia" value="${noticia.id}">
		<input type="submit" name="Comentar">
	</form>
			</c:if>
	</c:forEach>
	</table>	
-->
</body>
</html>