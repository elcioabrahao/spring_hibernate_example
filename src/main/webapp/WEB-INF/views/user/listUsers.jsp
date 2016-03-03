<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Lista de Usuários</title>

<link rel="stylesheet"
	href='<c:url value="/web-resources/css/pure-0.4.2.css"/>'>

<link rel="stylesheet"
	href='<c:url value="/web-resources/css/font-awesome-4.0.3/css/font-awesome.css"/>'>

<link rel="stylesheet"
	href='<c:url value="/web-resources/css/jquery-ui-1.10.4.custom.css"/>'>

<style type="text/css">
th {
	text-align: left
}
</style>


</head>

<body>
	<div style="width: 95%; margin: 0 auto;">

		<div id="userDialog" style="display: none;">
			<%@ include file="userForm.jsp"%>
		</div>

		<h1>List Of Users</h1>

		<button class="pure-button pure-button-primary" onclick="addUser()">
			<i class="fa fa-plus"></i> Novo User
		</button>
		<br>
		<table class="pure-table pure-table-bordered pure-table-striped">
			<thead>
				<tr>
					<th width="4%">Cod</th>
					<th width="24%">Nome</th>
					<th width="24%">Criado por</th>
					<th width="24%">Criado em</th>
					<th width="24%"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userList}" var="user" varStatus="loopCounter">
					<tr>
						<td><c:out value="${loopCounter.count}" /></td>
						<td><c:out value="${user.username}" /></td>
						<td><c:out value="${user.createdBy}" /></td>
						<td><c:out value="${user.createdDate}" /></td>
						<td><nobr>
								<button class="pure-button pure-button-primary"
									onclick="editUser(${user.userId});">

									<i class="fa fa-pencil"></i> Editar
								</button>

								<a class="pure-button pure-button-primary"
									onclick="return confirm('Tem certeza que quer deletar este user?');"
									href="delete/${user.userId}"> <i class="fa fa-times"></i>Deletar
								</a>

							</nobr></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

	<!--  It is advised to put the <script> tags at the end of the document body so they don't block rendering of the page -->
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/lib/jquery-1.10.2.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/lib/jquery-ui-1.10.4.custom.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/lib/jquery.ui.datepicker.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/js-for-listUsers.js"/>'></script>
</body>
</html>