<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page pageEncoding="utf-8" %>
<html>
<body>
<h2>Hello World!</h2>
<span style="color:red"><s:property value="msg"></s:property></span>
<form action="addbook.action" method="post">

    password  <input type="text" value="269" name="tbBooks.id"><br>
    depname  <input type="text" value="时间简史" name="tbBooks.name"><br>
    mail  <input type="text" value="mwj" name="tbBooks.author"><br>
    buyTime  <input type="text" value="1999-9-9" name="buyTime"><br>
    sortId  <input type="text" value="10" name="tbSort.id"><br>

    <input type="submit" value="submit"><br>
</form>
</body>
</html>
