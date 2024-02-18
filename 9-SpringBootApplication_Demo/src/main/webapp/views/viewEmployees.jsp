<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table align="center" border="1" cell-spacing="10px" cell-padding="10px">
	<tr>
		<th>e_id</th>
		<th>e_name</th>
		<th>e_email</th>
		<th>e_dept</th>
		<th>e_sal</th>
		<th>e_address</th>
		<th>e_image</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	
	<c:forEach var="employee" items="${employees}">
	<tr>
		<td>${employee.e_id}</td>
		<td>${employee.e_name}</td>
		<td>${employee.e_email}</td>
		<td>${employee.e_dept}</td>
		<td>${employee.e_sal}</td>
		<td>${employee.e_address}</td>
		<td>
			<img src=${employee.e_image} alt="error" width="50px">
		</td>
		<td>
			<a href="/edit/${employee.e_id}">Edit</a>
		</td>
		<td>
			<a href="/delete/${employee.e_id}">Delete</a>
		</td>
	</tr>
	</c:forEach>


</table>