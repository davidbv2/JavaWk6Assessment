<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<h1> Welcome! </h1>
<p>
${start} <br><br>
What order number do you want to check on? <br />
</p>
<form action="receipt" method="post">
        <input type="text" name="ordernum" value="">
        <input type="submit" value="Check Order">
</form>
</body>
</html>