<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2019/5/15
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link href="https://cdn.bootcss.com/twitter-bootstrap/3.4.1/css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css"/>
<script src="https://cdn.bootcss.com/jquery/3.0.0/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/twitter-bootstrap/3.4.1/js/bootstrap.min.js"></script>
<body>

<nav class="nav navbar navbar-inverse" >
    <div class="container-fluid" style="height: 60px;">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button  type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#collapse" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#" style="height: 60px;line-height: 30px">DEMO</a>
        </div>
        <div class="collapse navbar-collapse" id="collapse">
            <ul class="nav navbar-nav" style="margin-top:0">
                <li class="active"><a href="${pageContext.request.contextPath}" style="height: 60px;line-height: 30px">Dubbo 简单练习 </a></li>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
