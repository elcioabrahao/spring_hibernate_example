<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:url var="actionUrl" value="save" />

<form:form id="userForm" commandName="user" method="post"
	action="${actionUrl }" class="pure-form pure-form-aligned">

	<fieldset>
		<legend></legend>

		<div class="pure-control-group">
			<label for="username">Nome</label>
			<form:input name = "username" path="username" placeholder="Nome" />
		</div>
		<div class="pure-control-group">
			<label for="createdBy">Criado por</label>
			<form:input name="createdBy" id = "merocode" path="createdBy" placeholder="Criado por" maxlength="15" />
		</div>
		<div class="pure-control-group">
			<label for="createdDate">Criado em</label>
			<form:input path="createdDate"
				placeholder="YYYY-MM-DD" class="datepicker" />
		</div>

		<form:input path="userId" type="hidden" />

	</fieldset>
</form:form>