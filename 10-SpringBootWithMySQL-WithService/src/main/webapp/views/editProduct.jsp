<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="aqua">
	<form:form modelAttribute="product" method="get" action="/updateandsave">
		<table>
			<tr>
				<td>P_ID</td>
				<td>
					<form:hidden path="p_id" />
				</td>
			</tr>
			
			<tr>
				<td>P_Name</td>
				<td>
					<form:input path="p_name" />
				</td>
			</tr>
			
			
			<tr>
				<td>P_Cost</td>
				<td>
					<form:input path="p_cost" />
				</td>
			</tr>
			
			<tr>
				<td>P_Quantityt</td>
				<td>
					<form:input path="p_quantity" />
				</td>
			</tr>
			
			<tr>
				<td>P_Image</td>
				<td>
					<form:input path="p_image" />
				</td>
			</tr>
	
			
		
				<td colspan="2">
				   <input type="submit" value="UPDATE">
				</td>
				
			</tr>
			
					
			
		</table>
	</form:form>
</body>