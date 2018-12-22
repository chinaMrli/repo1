<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2018/12/14
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>

    <script>
        // 页面加载，绑定单击事件
        $(function(){
            $("#btn").click(function(){
                // alert("hello btn");
                // 发送ajax请求
                $.ajax({
                    // 编写json格式，设置属性和值
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"美滋滋","password":"123","age":30}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        // data服务器端响应的json的数据，进行解析
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);
                    }
                });

            });
        });

    </script>


</head>
<body>

<a href="user/test1">string</a><br/>
<a href="user/test2">void转发</a><br/>
<a href="user/test3">返回ModelAndView</a>
<a href="user/test4">关键字重定向</a><br/>

<button id="btn">发送Ajax请求</button>
</body>
</html>
