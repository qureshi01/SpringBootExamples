<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table align="center" border="1" cell-spacing="10px" cell-padding="10px">
	<tr>
		<th>p_id</th>
		<th>p_name</th>
		<th>p_cost</th>
		<th>p_quantity</th>
		<th>p_image</th>
		<th>total bill</th>
		<th>discount</th>
		<th>gst</th>
		<th>invoice</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	
	<c:forEach var="p" items="${products}">
	<tr>
		<td>${p.p_id}</td>
		<td>${p.p_name}</td>
		<td>${p.p_cost}</td>
		<td>${p.p_quantity}</td>
		<td>
			<img src=${p.p_image} alt="error" width="50px">
		</td>
		<td>${p.total_bill}</td>
		<td>${p.discount}</td>
		<td>${p.gst}</td>
		<td>${p.invoice}</td>
		<td>
			<a href="/edit/${p.p_id}">Edit</a>
		</td>
		<td>
			<a href="/delete/${p.p_id}">Delete</a>
		</td>
	</tr>
	</c:forEach>


</table>