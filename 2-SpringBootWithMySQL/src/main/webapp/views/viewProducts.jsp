<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<center>
	<h1 style="color:green">LIST OF PRODUCTS</h1>
</center>

<table border="1"
	   align="center"
	   cellspacing="10px"
	   cellpadding="10px">
	<tr>
		<th>id</th>
		<th>name</th>
		<th>cost</th>
		<th>image</th>
		<th>edit</th>
		<th>delete</th>
	</tr>
	
	<c:forEach var="product" items="${products}">
		<tr>
			<td>${product.p_id}</td>
			<td>${product.p_name}</td>
			<td>${product.p_cost}</td>
			<td>
				<img src=${product.p_image} width="50px">
			</td>
			<td>
				<a href="/edit/${product.p_id}">Edit</a>
			</td>
			<td>
				<a href="/delete/${product.p_id}">Delete</a>
			</td>
		</tr>
	</c:forEach>
	
</table>