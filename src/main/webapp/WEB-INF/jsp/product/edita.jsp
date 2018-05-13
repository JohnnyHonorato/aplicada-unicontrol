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
				<h2>Editar Produto</h2>
			</div>
			<div class="col-md-12">
				<form action="<c:url value='/product/atualiza'/> " method="post">
					<br>
					<div class="row">
						<div class="form-group col-md-6">
							<label for="name">Nome</label> <input type="text"
								class="form-control" name="product.name" value="${product.name}"
								placeholder="Digite o nome" />
						</div>
						<div class="form-group col-md-6">
							<label for="description">Descrição</label> <input type="text"
								class="form-control" name="product.description"
								value="${product.description}" placeholder="Digite a descrição" />
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-6">
							<label for="amount">Quantidade</label> <input type="number"
								class="form-control" name="product.amount"
								value="${product.amount}" placeholder="Digite a quantidade" />
						</div>
						<div class="form-group col-md-6">
							<label for="name">Categoria</label> <input type="text"
								class="form-control" name="product.category"
								value="${product.category}" placeholder="Digite a categoria" />
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<label for="name"></label> <input type="hidden"
									class="form-control" name="product.id" value="${product.id}"
									placeholder="Digite o nome" />
							</div>
						</div>
					</div>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col-md-12" id="botao-salvar">
				<button type="submit" class="btn btn-primary">Salvar</button>
				<a href="<c:url value='/'/>" class="btn btn-danger">Cancelar</a>
			</div>
		</div>
		</form>
	</div>
	</main>
</body>
</html>