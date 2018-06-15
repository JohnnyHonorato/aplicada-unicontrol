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
	<div class="login-page">
		<img id="profile-img" class="profile-img-card"
			src="http://subprefeituraccae.surge.sh/img/ufpb.png" />

		<div class="form">
			<form class="login-form" action="<c:url value='/login/autentica'/>"
				method="post">
				<input type="text" placeholder="email" name="user.nome" /> <input
					type="password" placeholder="senha" name="user.senha" />
				<button type="submit" value="Login">entrar</button>
				<p class="message">
					Não cadastrado? <a href="#">Criar conta</a>
				</p>
			</form>

			<c:forEach items="${errors}" var="erro">
				${erro.category} - ${erro.message} <br>
			</c:forEach>
		</div>
	</div>
</body>
</html>