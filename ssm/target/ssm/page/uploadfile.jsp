<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/10 0010
  Time: 上午 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!--[if IE]>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<![endif]-->
<title>Free Responsive Admin Theme - ZONTAL</title>
<!-- BOOTSTRAP CORE STYLE  -->
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
<!-- FONT AWESOME ICONS  -->
<link href="${pageContext.request.contextPath}/css/font-awesome.css" rel="stylesheet">
<!-- CUSTOM STYLE  -->
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
<!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
<header>
    <div class="container">
        <div class="row">
        </div>
    </div>
</header>
<head></head>

<body>
<form method="post" action="${pageContext.request.contextPath}/file/uploadnovel" style=""  enctype="multipart/form-data">
    <div class="form-group mb-1">
        <input type="text" name="name" class="form-control" placeholder="Enter name"> </div> <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
    <input type="text" name="author" class="form-control" placeholder="Enter author">
    <div class="form-group my-3">
        <input type="file" class="form-control-file" id="exampleFormControlFile1" name="file"> </div>
    <button type="submit" class="btn btn-primary my-2">Submit button</button>
</form>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.js"></script>
<!-- BOOTSTRAP SCRIPTS  -->
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</body>

</html>
