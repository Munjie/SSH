<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page pageEncoding="UTF-8" %>

<html>
<body>
<h2>Hello World!</h2>


<form action="login.action" method="post">
    userid  <input type="text" value="88" name="staff.myinitial"><br>
    userpwd  <input type="text" value="1" name="staff.password"><br>

    <input type="submit" value="submit"><br>
</form>
<a href="register.jsp">注册</a>
<a href="addbook.jsp">添加书</a>
</body>
</html>
