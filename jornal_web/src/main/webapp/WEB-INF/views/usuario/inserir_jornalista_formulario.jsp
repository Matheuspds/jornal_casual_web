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
                        <li class="previous"><a href="listarNoticiasEditor" type="submit" class="btn btn-default btn-lg">Voltar</a>
                        </li>
                    </ul>
        </div>
        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">Cadastre um Novo
                        <strong>Jornalista</strong>
                    </h2>
                    <hr>
                </div>
               
               <div class="col-lg-12 text-left">
               	<img class="img-responsive img-border img-full" src="img/slide-1.jpg" alt="">
                
                <form action="inserirJornalista" method="POST">
                
                <p>
		      		<input name="papeis" value="1" type="checkbox" class="filled-in" id="filled-in-box"/>
		      		<label for="filled-in-box">Editor</label>
		    	</p>
		    	<p>
		      		<input name="papeis" value="2" type="checkbox" class="filled-in" id="filled-in-box-2"/>
		      		<label for="filled-in-box-2">Jornalista</label>
		    	</p>
		    	<p>
		      		<input name="papeis" value="3" type="checkbox" class="filled-in" id="filled-in-box-3"/>
		      		<label for="filled-in-box-3">Leitor</label>
		    	</p>
                
                
                <label>Nome do Jornalista</label> <input type="text" name="nome" /> <br />
			    <br>
			   	
			   	<label>Email do Jornalista</label> <input type="text" name="email" /> <br />
			     <br>
			     
			     <label>Login do Jornalista</label> <input type="text" name="login" /> <br />
			     <br>
			     
			     <label>Senha do Jornalista</label> <input type="password" name="senha" /> <br />
			     <br>
				<input id="btnSalvar" class="btn btn-default btn-lg" type="submit" value="Cadastrar" />
                </form>
                </div>
                
            </div>
        </div>

    </div>



<!-- 
<form action="inserirJornalista" method="post" enctype="multipart/form-data">
			<h3>Jornalista</h3>
			<input type="text" name="nome"/>
			<label>Nome do Jornalista</label>
			<input type="text" name="email"/>
			<label>Email do Jornalista</label>
			<input type="text" id="login" name="login"/>
			<label>Login do Jornalista</label>
			<input type="password" name="senha"/>
			<label>Senha do Jornalista</label>
			<div class="file-field input-field" align="left">
		    </div>
		    <p>
		      <input name="papeis" value="1" type="checkbox" class="filled-in" id="filled-in-box"/>
		      <label for="filled-in-box">Editor</label>
		    </p>
		    <p>
		      <input name="papeis" value="2" type="checkbox" class="filled-in" id="filled-in-box-2"/>
		      <label for="filled-in-box-2">Jornalista</label>
		    </p>
		    <p>
		      <input name="papeis" value="3" type="checkbox" class="filled-in" id="filled-in-box-3"/>
		      <label for="filled-in-box-3">Leitor</label>
		    </p>
			<input id="btnSalvar" type="submit" class="btn" value="CADASTRAR JORNALISTA"/>
		</form>
 -->
</body>
</html>