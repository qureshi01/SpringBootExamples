<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="aqua">
	<form:form modelAttribute="product" method="get" action="/updateandsave">
		<table>
			<tr>
				<td>P ID</td>
				<td>
					<form:hidden path="p_id" />
				</td>
			</tr>
			
			<tr>
				<td>P NAME</td>
				<td>
					<form:input path="p_name" />
				</td>
			</tr>
			
			<tr>
				<td>P COST</td>
				<td>
					<form:input path="p_cost" />
				</td>
			</tr>
			
			
			<tr>
				<td>P IMAGE</td>
				<td>
					<form:input path="p_image" />
				</td>
			</tr>
			
			
		
			
			
			<tr>
				<td colspan="2">
				   <input type="submit" value="UPDATE">
				</td>
				
			</tr>
			
					
			
		</table>
	</form:form>
</body>