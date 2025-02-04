<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%-- For JSTL --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee Registration</title>
</head>
<body>
    <h1>Employee Registration</h1>
    <form action="${pageContext.request.contextPath}/save" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required><br><br>
        
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required><br><br>
        
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required><br><br>
        
        <label for="salary">Salary:</label>
        <input type="text" id="salary" name="salary" required><br><br>
                
        <label for="education">Education:</label>
        <input type="text" id="education" name="education" required><br><br>
        
        <input type="submit" value="Register">
    </form>
</body>
</html>
