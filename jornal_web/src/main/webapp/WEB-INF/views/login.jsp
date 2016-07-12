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
    <link href="../resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../resources/css/business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
</head>
<body>
	
	<div class="brand">Jornal Casual</div>
    <div class="address-bar">Universidade Federal do Ceará | Campus Quixadá | Raimundo Matheus</div>
	
	<div class="container">
		<div class="col-lg-12 text-center">
                    <ul class="pager">
                        <li class="previous"><a href="/" type="submit" class="btn btn-default btn-lg">Voltar</a>
                        </li>
                    </ul>
        </div>
        
          
        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">Realize
                        <strong>Login para acesso</strong>
                    </h2>
                    <hr>
                </div>
               
               <div class="col-lg-12 text-left">
               	<img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">
                
               	<form action="login" method="post">
               	
					<select name="idPapel" >
						<c:forEach var="papel" items = "${papeis}">
							<option value="${papel.id}">${papel.papel}</option>
						</c:forEach>
					</select>
					<br>
					<br>
					<label>Login:</label> <input type="text" name="login" /> <br />
					<label>Senha:</label> <input type="password" name="senha" /><br />
					<br>
					<button class="btn btn-default btn-lg" type="submit"> Entrar </button>		
				</form>
                </div>
            </div>
        </div>
    </div>

<!--
	<h2>Efetuar Login</h2>
	<center>
	<form action="login" method="post">
	<select name="idPapel" >
			<c:forEach var="papel" items = "${papeis}">
				<option value="${papel.id}">${papel.papel}</option>
			</c:forEach>
		</select>
		Login: <input type="text" name="login" /> <br />
		Senha: <input type="password" name="senha" />
		<button class="btn" type="submit"> Entrar </button>
		<a class="btn" href="/" type="submit"> Voltar </a>	
		
	</form>
	</center>
	 -->
</body>
</html>