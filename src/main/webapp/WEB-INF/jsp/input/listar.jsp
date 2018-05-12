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
				<li><a href="#">Produtos</a></li>
				<li><a href="#">Entradas</a></li>
				<li><a href="#">Saídas</a></li>
				<li><a href="#">Resumo</a></li>
				<li><a href="#">Sair</a></li>
			</ul>
		</div>
	</div>
</body>
<main>
<div id="main" class="container-fluid"
	style="padding-left: 325px; padding-top: 50px">
	<div id="top" class="row">
		<div class="col-sm-3">
			<h2>Entradas</h2>
		</div>
		<div class="col-sm-3" id="b-novo-produto">
			<a href="./formulario" class="btn btn-primary pull-right h2">Nova
				Entrada</a>
		</div>
	</div>
	<br>
	<div id="list" class="row">
		<div class="table-responsive col-md-12">
			<table class="table table-striped" cellspacing="0" cellpadding="0">
				<thead>
					<tr>
						<th>Código</th>
						<th>Nome</th>
						<th>Quantidade</th>
						<th>Categoria</th>
						<th>Nº do Pregão</th>
						<th>Nota de Empenho</th>
						<th>Data</th>
						<th class="actions"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${productList}" var="product">
						<tr>
							<td>${product.id}</td>
							<td>${product.name}</td>
							<td>${product.amount}</td>
							<td>${product.description}</td>
							<td>${product.category}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
</main>
</html>