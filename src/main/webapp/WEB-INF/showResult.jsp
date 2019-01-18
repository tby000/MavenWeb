<%@ page import="java.util.List" %>
<%@ page import="com.isoft.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/1/4
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<% List<User> list= (List<User>)session.getAttribute("userList");%>
<table>
    <tr>
        <td>id</td>
        <td>uname</td>
        <td>upwd</td>
        <td>lastLoginTime</td>
        <td>Role</td>
    </tr>
    <%
        for (int i=0; i<List.size();i++)
    %>
</table>


</body>
</html>