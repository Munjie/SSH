<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page pageEncoding="utf-8" %>
<html>
<body>
<h2>Hello World!</h2>
<span style="color:red"><s:property value="msg"></s:property></span>
<form action="addBook.action" method="post">

    password  <input type="text" value="321" name="tbBooks.id"><br>
    depname  <input type="text" value="dev" name="tbBooks.name"><br>
    mail  <input type="text" value="qq" name="tbBooks.author"><br>
    hireDate  <input type="text" value="1999-9-9" name="buyTime"><br>

    <input type="submit" value="submit"><br>
</form>
</body>
</html>
