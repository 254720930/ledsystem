<%--
  Created by IntelliJ IDEA.
  User: shanchun95
  Date: 2019/08/01
  Time: 下午 2:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录页</title>

    <link href="${pageContext.request.contextPath}/plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/plugins/material-design-iconic-font-2.2.0/css/material-design-iconic-font.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/plugins/waves-0.7.5/waves.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/plugins/checkbix/css/checkbix.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet"/>
</head>
<body>
<div id="login-window">
    <div class="input-group m-b-20">
        <span class="input-group-addon"><i class="zmdi zmdi-account"></i></span>
        <div class="fg-line">
            <input id="username" type="text" class="form-control" name="username" placeholder="帐号" required autofocus value="admin">
        </div>
    </div>
    <div class="input-group m-b-20">
        <span class="input-group-addon"><i class="zmdi zmdi-male"></i></span>
        <div class="fg-line">
            <input id="password" type="password" class="form-control" name="password" placeholder="密码" required value="admin">
        </div>
    </div>
    <div class="clearfix">
    </div>
    <div class="checkbox">
        <input id="rememberMe" type="checkbox" class="checkbix" data-text="自动登录" name="rememberMe">
    </div>
    <a id="login-bt" href="javascript:;" class="waves-effect waves-button waves-float"><i class="zmdi zmdi-arrow-forward"></i></a>
</div>
<script src="${pageContext.request.contextPath}/plugins/jquery.1.12.4.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/waves-0.7.5/waves.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/checkbix/js/checkbix.min.js"></script>

<script src="${pageContext.request.contextPath}/js/login.js"></script>
<script type="text/javascript">
    Checkbix.init();
</script>
</body>
</html>
