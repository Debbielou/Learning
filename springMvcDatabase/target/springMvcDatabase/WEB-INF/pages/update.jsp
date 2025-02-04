<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%-- For JSTL --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
    <meta http-equiv="refresh" content="2;url=${pageContext.request.contextPath}/display">
</head>
<body>
    <h1>Employee Updated Successfully!</h1>
    <p>${updateMessage}</p>
    <p>Redirecting to the employee list...</p>
</body>
</html>


