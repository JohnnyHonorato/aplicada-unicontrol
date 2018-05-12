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
	<main>
	<div id="main" class="container-fluid"
		style="padding-left: 325px; padding-top: 50px">
		<div class="row">
			<div class="col-sm-12">
				<h2>Nova Entrada</h2>
			</div>
			<div class="col-md-12">
				<form action="<c:url value='/input/insert'/> " method="post">
					<br>
					<div class="row">
						<div class="form-group col-md-6">
							<label for="name">Código</label> <input type="text"
								class="form-control" name="input.id_product"
								placeholder="Digite o código" required>
						</div>
						<div class="form-group col-md-6">
							<label for="amount">Quantidade</label> <input type="number"
								class="form-control" name="input.amount"
								placeholder="Digite a quantidade" required>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-6">
							<label for="name">Número do Pregão</label> <input type="number"
								class="form-control" name="input.NumeroDePregao"
								placeholder="Digite o número" required>
						</div>
						<div class="form-group col-md-6">
							<label for="amount">Nota de Empenho</label> <input type="text"
								class="form-control" name="input.notaDeEmpenho"
								placeholder="Digite o número" required>
						</div>
					</div>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col-md-12" id="botao-salvar">
				<button type="submit" class="btn btn-primary">Cadastrar</button>
				<a href="<c:url value='/'/>" class="btn btn-danger">Cancelar</a>
			</div>
		</div>
	</div>
	</main>
</body>
</html>