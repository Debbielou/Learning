<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>College Registration</title>
</head>
<body>
    <h1 align="center">College Registration</h1>
    <form action="register" method="post">
        <label for="collegeId">College ID:</label>
        <input type="text" id="collegeId" name="collegeId" required><br><br>
        
        <label for="collegeName">College Name:</label>
        <input type="text" id="collegeName" name="collegeName" required><br><br>
        
        <label for="location">Location:</label>
        <input type="text" id="location" name="location" required><br><br>
        
        <input type="submit" value="Register">
    </form>
</body>
</html>
