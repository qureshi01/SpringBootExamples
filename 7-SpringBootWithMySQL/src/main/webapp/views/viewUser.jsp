<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Users List</h1>
<br><br>

<table border="1" align="center" cell-spacing="10px" cell-padding="10px">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Password</th>
        <th>Email</th>
        <th>Sex</th>
        <th>Country</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    
    <c:forEach var="u" items="${users}">
        <tr>
            <td>${u.Id}</td>
            <td>${u.Name}</td>
            <td>${u.Password}</td>
            <td>${u.Email}</td>
            <td>${u.Sex}</td>
            <td>${u.Country}</td>
            <td>
                <a href="/edit/${u.Id}">Edit</a>
            </td>
            <td>
                <a href="/delete/${u.Id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<br><br>
<a href="/addUser">Add New User</a>
