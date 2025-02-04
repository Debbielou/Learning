<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%-- For JSTL --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
</head>
<body>
    <h1>Update Employee</h1>
    <form action="${pageContext.request.contextPath}/update" method="post">
        <input type="hidden" name="employeeId" value="${employee.employeeId}" />
        
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" value="${employee.firstName}" required><br><br>
        
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" value="${employee.lastName}" required><br><br>
        
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" value="${employee.age}" required><br><br>
        
        <label for="salary">Salary:</label>
        <input type="text" id="salary" name="salary" value="${employee.salary}" required><br><br>
        
        <label for="education">Education:</label>
        <input type="text" id="education" name="education" value="${employee.education}" required><br><br>
        
        <input type="submit" value="Update">
    </form>
</body>
</html>
