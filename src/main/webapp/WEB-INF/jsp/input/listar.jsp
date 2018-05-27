<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Subprefeitura CCAE/UFPB</title>
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/styles.css">
<script src="https://code.jquery.com/jquery-3.1.1.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery.quicksearch/2.3.1/jquery.quicksearch.js"></script>
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

	<div id="main" class="container-fluid"
		style="padding-left: 325px; padding-top: 50px">
		<div id="top" class="row">
			<div class="col-sm-3">
				<h2>Entradas</h2>
			</div>
			<div class="col-sm-6">
				<div class="input-group h2">
					<input name="consulta" class="form-control" id="txt_consulta"
						type="text" placeholder="Pesquisar saída">
				</div>
			</div>
			<div class="col-sm-3" id="b-novo-produto">
				<a href="./formulario" class="btn btn-primary pull-right h2">Nova
					Entrada</a>
			</div>
		</div>
		<br>
		<div id="list" class="row">
			<div class="table-responsive col-md-12">
				<table id="tabela" class="table table-striped">
					<thead>
						<tr>
							<th>Código do Produto</th>
							<th>Quantidade</th>
							<th>Nº do Pregão</th>
							<th>Nota de Empenho</th>
							<th>Data</th>
							<th class="actions"></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${inputList}" var="input">
							<tr>
								<td>${input.id_product}</td>
								<td>${input.amount}</td>
								<td>${input.numeroDePregao}</td>
								<td>${input.notaDeEmpenho}</td>
								<td>${input.data}</td>

								<td>
									<form action="<c:url value='/input/remover'/>" method="post">
										<input name="input.id" value="${input.id}" type="hidden" />
										<button type="submit" name="_method" value="DELETE"
											class="btn btn-danger">Excluir</button>
									</form>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<script>
		$('input#txt_consulta').quicksearch('table#tabela tbody tr');
	</script>
</body>
</html>