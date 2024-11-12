<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>
<%
	@ SuppressWarnings ("unchecked")
	ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("filmes");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Locadora</title>
<link rel="icon" href="imagens/icone.png"/>
<link rel="stylesheet" href="estilo.css" />
</head>
<body>
	<h2>Filmes</h2>
	
    <a href="novo.html">
	    <button class="submit">
	        Novo Filme
	       </button>
	</a>
	
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Autor</th>
				<th>Descrição</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				<td><%=lista.get(i).getId()%></td>
				<td><%=lista.get(i).getNome()%></td>
				<td><%=lista.get(i).getAutor()%></td>
				<td><%=lista.get(i).getDescricao()%></td>
				<td>
					<a href="select?id=<%=lista.get(i).getId()%>">Editar</a>
					<a href="javascript: confirmar(<%=lista.get(i).getId()%>)"
					class="Botao2">Excluir</a>
				</td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	<script src="scripts/confirmador.js"></script>
</body>
</html>