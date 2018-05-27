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
				<form action="<c:url value='/output/insert'/> " method="post">
					<br>
					<div class="row">
						<div class="form-group col-md-6">
							<label for="name">Código</label> <input type="text"
								class="form-control" name="output.id_product"
								placeholder="Digite o código" required>
						</div>
						<div class="form-group col-md-6">
							<label for="amount">Quantidade</label> <input type="number"
								class="form-control" name="output.amount"
								placeholder="Digite a quantidade" required>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-6">
							<label for="name">Requisitante</label> <input type="text"
								class="form-control" name="output.requisitante"
								placeholder="Digite o nome" required>
						</div>
						<div class="form-group col-md-6">
							<label for="amount">Setor Requisitante</label> <input type="text"
								class="form-control" name="output.setorRequisitante"
								placeholder="Digite o nome" required>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-6">
							<label for="name">Finalidade</label> <input type="text"
								class="form-control" name="output.finalidade"
								placeholder="Digite a finalidade" required>
						</div>
					</div>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col-md-12" id="botao-salvar">
				<button type="submit" class="btn btn-primary">Cadastrar</button>
				<a href="<c:url value='/output/listar'/>" class="btn btn-danger">Cancelar</a>
			</div>
		</div>
	</div>
	</main>
</body>
</html>