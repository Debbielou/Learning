<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Colleges</title>
</head>
<body>
    <h1>List of Colleges</h1>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Location</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${colleges}" var="college">
            <tr>
                <td><c:out value="${college.id}"/></td>
                <td><c:out value="${college.name}"/></td>
                <td><c:out value="${college.location}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>