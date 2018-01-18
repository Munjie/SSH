<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/18
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello</h1>


        <s:iterator value="display">

        <s:property value="author"></s:property>-- <s:property value="sort.name"></s:property>

        </s:iterator>




</body>
</html>
