<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Locadoura - Editar</title>
<link rel="icon" href="imagens/icone.png"/>
</head>
<body>
	<h1>Editar filme</h1>
	<form name="frmFilme" action="update">
		<table>
			<tr>
				<td><input type="text" name="id" readonly
					value="<%out.print(request.getAttribute("id"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="nome"
					value="<%out.print(request.getAttribute("nome"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="autor"
					value="<%out.print(request.getAttribute("autor"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="descricao"
					value="<%out.print(request.getAttribute("descricao"));%>"></td>
			</tr>
		</table>
		<input type="button" value="Salvar" onclick="verificar()">
	</form>
	<script src="scripts/verificar.js"></script>
</body>
</html>