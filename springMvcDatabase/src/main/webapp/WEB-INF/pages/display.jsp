<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%-- For JSTL --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> <%-- For Formatting --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
</head>
<body>
    <h1>Employee List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
            <th>Salary</th>
            <th>Education</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="employee" items="${employeeList}">
            <tr>
                <td>${employee.employeeId}</td>
                <td>${employee.firstName}</td>
                <td>${employee.lastName}</td>
                <td>${employee.age}</td>
                <td><fmt:formatNumber value="${employee.salary}" type="number" maxFractionDigits="0"/></td>
                <td>${employee.education}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/update/${employee.employeeId}">Update</a>
                    <a href="${pageContext.request.contextPath}/delete/${employee.employeeId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
