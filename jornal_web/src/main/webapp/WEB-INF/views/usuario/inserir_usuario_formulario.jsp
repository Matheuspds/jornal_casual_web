<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                        <li class="previous"><a href="/" type="submit" class="btn btn-default btn-lg">Voltar</a>
                        </li>
                    </ul>
        </div>
        
        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">Realize o seu
                        <strong>Cadastro</strong>
                    </h2>
                    <hr>
                </div>
               
               <div class="col-lg-12 text-left">
               	<img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">
                
                <form action="inserirUsuario" method="POST">
                
                <p for="nome">Nome
                <input name="nome" type="text" class="validate">
			    <br>
			   	
			   	<p for="email">E-mail
				<input name="email" type= "text" class="validate">
			     <br>
			     
			    <p for="login">Login
				<input name="login" type="text" class="validate">
				<br>
				
				<p for="password">Senha			    
			   	<input name="senha" type="password" class="validate">
			    <br>
			    <br>
			    <input type="checkbox" hidden checked="checked" name="papeis" value="3" ></input><br/>
				<input id="btnSalvar" class="btn btn-default btn-lg" type="submit" value="Cadastrar" />
                </form>
                </div>
                
            </div>
        </div>

    </div>
     
     
     
 <!--  


	<form action="inserirUsuario" method="POST">
	<center>
			<h5>Tela para Cadastro</h5>
			   <input name="nome" type="text" class="validate">
			   	<label for="nome">Nome</label>
			   
				<input name="email" type= "text" class="validate">
			    <label for="email">Email</label>
			     
				<input name="login" type="text" class="validate">
			    <label>Login para acesso</label>
			    
			   	<input name="senha" type="password" class="validate">
			    <label for="password">Senha</label>
			      
				<input id="btnSalvar" class="btn" type="submit" value="Cadastrar" />
				<a class="btn" href="/" type="submit"> <button>Voltar</button></a>
				
	</center>
	</form>
-->
</body>
</html>