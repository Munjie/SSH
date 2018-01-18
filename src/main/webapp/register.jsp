<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page pageEncoding="utf-8" %>
<html>
<body>
<h2>Hello World!</h2>
<span style="color:red"><s:property value="msg"></s:property></span>
<form action="register.action" method="post">

    myinitial  <input type="text" value="mwj101" name="staff.myinitial"><br>
    staffname    <input type="text" value="mwj" name="staff.staffname"><br>
    password  <input type="text" value="321" name="staff.password"><br>
    depname  <input type="text" value="dev" name="staff.depname"><br>
    mail  <input type="text" value="qq" name="staff.mail"><br>
    hireDate  <input type="text" value="1999-9-9" name="hireDate"><br>
    telephone  <input type="text" value="182" name="staff.telephone"><br>
    gender  <input type="text" value="1" name="staff.gender"><br>
    isadmin  <input type="text" value="1" name="staff.isadmin"><br>
    deleted  <input type="text" value="1" name="staff.deleted"><br>
    <input type="submit" value="submit"><br>
</form>
</body>
</html>
