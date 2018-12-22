<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2018/12/13
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="param/test1">入门程序</a>
<form action="param/test2" method="post">
    姓名：   <input type="text" name="username"/><br/>
    密码：   <input type="text" name="password"/><br/>
    金额：   <input type="text" name="money"/><br/>
    <input type="submit" value="提交"/>
</form>

<%--Account中封装user的--%>
<%--<form action="param/test3" method="post">--%>
    <%--姓名：   <input type="text" name="username"/><br/>--%>
    <%--密码：   <input type="text" name="password"/><br/>--%>
    <%--金额：   <input type="text" name="money"/><br/>--%>
    <%--用户姓名：<input type="text" name="user.uname"/><br/>--%>
    <%--用户年龄：<input type="text" name="user.age"/><br/>--%>
    <%--<input type="submit" value="提交"/>--%>
<%--</form>--%>
<form action="param/test4" method="post">
    姓名：   <input type="text" name="username"/><br/>
    密码：   <input type="text" name="password"/><br/>
    金额：   <input type="text" name="money"/><br/>

    用户姓名：<input type="text" name="users[0].uname"/><br/>
    用户年龄：<input type="text" name="users[0].age"/><br/>

    用户姓名：<input type="text" name="map['one'].uname"/><br/>
    用户年龄：<input type="text" name="map['one'].age"/><br/>


    <input type="submit" value="提交"/>
</form>
<%-- 自定义用户转换器--%>
<form action="param/test5" method="post">
    用户姓名：<input type="text" name="uname"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    日期：<input type="text" name="date"/><br/>
    <input type="submit" value="提交"/>
</form>
<%--获取API--%>

<<a href="param/test6">获取API </a>






</body>
</html>
