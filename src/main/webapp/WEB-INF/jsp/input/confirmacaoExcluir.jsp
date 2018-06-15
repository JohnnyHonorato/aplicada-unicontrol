<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Subprefeitura CCAE/UFPB</title>
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/styles.css">
</head>
<body>
	<div class="container">
		<div id="sidebar-wrapper" class="sidebar-toggle">
			<ul class="sidebar-nav">
				<div class="row" id="ufpb-logo">
					<a href="#"><img width="111px" height="160"
						src="../assets/img/ufpb2.png" /></a>
				</div>
				<li><a href="../product/listar">Produtos</a></li>
				<li><a href="../input/listar">Entradas</a></li>
				<li><a href="../output/listar">Saídas</a></li>
				<li><a href="#">Resumo</a></li>
				<li><a href="../login/formulario">Sair</a></li>
			</ul>
		</div>
	</div>
	<main>
	<div id="main" class="container-fluid" style="padding-left: 325px; padding-top: 50px">
		<div class="row">
			<div class="col-sm-12">
				<h2>Entradas</h2>
				<br>
				<h4>Entrada excluida com sucesso!</h4>
				<br> <a href="<c:url value='/product/formulario'/>"
					class="btn btn-primary">Nova Entrada</a> <a
					href="<c:url value='/input/listar'/>" class="btn btn-danger">Voltar</a>
			</div>
		</div>
	</main>
</body>
</html>