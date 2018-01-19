<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Java Web</title>

<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/estilo.css">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<!-- modal -->
	<div class="modal fade" id="login-modal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true"
		style="display: none;">
		<div class="modal-dialog">
			<div class="loginmodal-container">
				<h1>Fa�a seu Login</h1>
				<br>
				<form action="login" method="post">
					<input type="text" name="login" placeholder="Username" required>
					<input type="password" name="senha" placeholder="Password" required>
					<input type="submit" name="login" class="login loginmodal-submit"
						value="Login">
				</form>
				<div class="login-help">
					<a href="#">Registro</a> - <a href="#">Esqueci minha senha</a>
				</div>
			</div>
		</div>
	</div>
	<!-- #/modal -->

	<!-- modal-cadastro -->
	<div class="modal fade" id="cadastro-modal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true"
		style="display: none;">
		<div class="modal-dialog">
			<div class="loginmodal-container">
				<h1>Crie seu Login</h1>
				<br>
				<form action="sign_in" method="post">
					<input type="text" name="nome" placeholder="Name" required>					
					<input type="text" name="login" placeholder="Username" required>
					<input type="password" id="pwd" name="senha" placeholder="Password" required>
					<input type="password" id="confirm_pwd" name="confirmar_senha" placeholder="Rewrite Password" required>
					<div id="msg"></div>
					<input type="submit" name="login" class="login loginmodal-submit"
						value="Login">
				</form>
			</div>
		</div>
	</div>
	<!-- #/modal-cadastro -->
	
	<div class="container">
		<!-- barraDeNavegacao -->
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Java Web</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a href="home.jsp">Home <span class="sr-only">(current)</span></a></li>
						<li><a href="#">Vitrine</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Categorias <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Utilitarios</a></li>
								<li><a href="#">Eletronicos</a></li>
								<li><a href="#">Domesticos</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Cama, mesa, banho e jardim</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Pets</a></li>
							</ul></li>
					</ul>
					<form class="navbar-form navbar-left">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">Localizar</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#">Contato</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">
							<c:choose>
								<c:when test="${usuario ne null}">${usuario.nome}
									<span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="perfil.jsp">Gerenciar Perfil</a></li>
										<li role="separator" class="divider"></li>
										<li><a href="logout">Sair</a></li>
									</ul>
								</c:when>
								<c:otherwise>Entrar
									<span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="#" data-toggle="modal" data-target="#login-modal">Login</a></li>
										<li><a href="#" data-toggle="modal" data-target="#cadastro-modal">Cadastro</a></li>
										<li role="separator" class="divider"></li>
										<li><a href="#">Recuperar senha</a></li>
									</ul>
								</c:otherwise>
							</c:choose>
						</li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
		<!-- #/barraDeNavegacao -->