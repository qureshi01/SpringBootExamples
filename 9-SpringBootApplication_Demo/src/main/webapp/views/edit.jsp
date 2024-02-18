<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="aqua">
	<form:form modelAttribute="employee" method="get" action="/updateandsave">
		<table>
			<tr>
				<td>E ID</td>
				<td>
					<form:hidden path="e_id" />
				</td>
			</tr>
			
			<tr>
				<td>E NAME</td>
				<td>
					<form:input path="e_name" />
				</td>
			</tr>
			
			<tr>
				<td>E EMAIL</td>
				<td>
					<form:input path="e_email" />
				</td>
			</tr>
			
			
			<tr>
				<td>E ID</td>
				<td>
					<form:input path="e_id" />
				</td>
			</tr>
			
			
			<tr>
				<td>E DEPT</td>
				<td>
					<form:input path="e_dept" />
				</td>
			</tr>
			
			
			<tr>
				<td>E SALARY</td>
				<td>
					<form:input path="e_sal" />
				</td>
			</tr>
			
			<tr>
				<td>E ADDRESS</td>
				<td>
					<form:input path="e_address" />
				</td>
			</tr>


			<tr>
				<td>E IMAGE</td>
				<td>
					<form:input path="e_image" />
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