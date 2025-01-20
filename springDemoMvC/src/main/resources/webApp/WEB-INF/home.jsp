<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
    </head>
<body>
    <h1>Welcome to Spring Boot MVC</h1>
    <form action="/greet" method="post">
      <label for="name">Enter your name:</label>
        <input type="text" id="name" name="name" required>
        <button type="submit">Submit</button>
            </form>
         </body>
         </html>