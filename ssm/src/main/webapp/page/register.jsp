<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/10 0010
  Time: 上午 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head></head>

<body>﻿
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
<!-- HEADER END-->
<div class="navbar navbar-inverse set-radius-zero">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand text-dark" href="index.html">
                <strong>user: </strong>info@yourdomain.com &nbsp;&nbsp; <strong>role: </strong>+90-897-678-44 </a>
        </div>
        <div class="left-div">
            <i class="fa fa-user-plus login-icon"></i>
        </div>
        <div class="row">
            <div class="col-md-12">
                <strong>Email: </strong>info@yourdomain.com &nbsp;&nbsp; <strong>Support: </strong>+90-897-678-44 </div>
        </div>
    </div>
</div>
<!-- LOGO HEADER END-->
<!-- MENU SECTION END-->
<div class="content-wrapper">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h4 class="page-head-line">Please REGISTER To Enter </h4>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <br>
                <hr>
                <h4>REGISTER A&nbsp;&nbsp;<strong>Zontal Account :</strong></h4>
                <br>
                <form role="form" action="${pageContext.request.contextPath}/user/add" method="post">

                    <div class="form-group">
                        <label>Enter Name&nbsp; : </label>
                        <input type="text" class="form-control" name="username">
                <label>Enter Email&nbsp; : </label>
                <input type="text" class="form-control" name="email">
                <label>Enter Password : </label>
                <input type="password" class="form-control" name="password">
                <label>Enter Password : </label>
                <input type="password" class="form-control">
                <hr>
                        <button type="submit" class="btn btn-primary">Submit</button>&nbsp;
                    </div>
                </form>
            </div>
            <div class="col-md-6">
                <div class="alert alert-info"> This is a free bootstrap admin template with basic pages you need to craft your project. Use this template for free to use for personal and commercial use. <br>
                    <strong> Some of its features are given below :</strong>
                    <ul>
                        <li> Responsive Design Framework Used </li>
                        <li> Easy to use and customize </li>
                        <li> Font awesome icons included </li>
                        <li> Clean and light code used. </li>
                    </ul>
                </div>
                <div class="alert alert-success">
                    <strong> Instructions To Use:</strong>
                    <ul>
                        <li> Lorem ipsum dolor sit amet ipsum dolor sit ame </li>
                        <li> Aamet ipsum dolor sit ame </li>
                        <li> Lorem ipsum dolor sit amet ipsum dolor </li>
                        <li> Cpsum dolor sit ame </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- CONTENT-WRAPPER SECTION END-->
<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-12"> © 2015 YourCompany | By : <a href="http://www.designbootstrap.com/" target="_blank">DesignBootstrap</a>
            </div>
        </div>
    </div>
</footer>
<!-- FOOTER SECTION END-->
<!-- JAVASCRIPT AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
<!-- CORE JQUERY SCRIPTS -->
<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.js"></script>
<!-- BOOTSTRAP SCRIPTS  -->
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<pingendo onclick="window.open('https://pingendo.com/', '_blank')" style="cursor:pointer;position: fixed;bottom: 20px;right:20px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:220px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white">Made with Pingendo Free&nbsp;&nbsp;<img src="https://pingendo.com/site-assets/Pingendo_logo_big.png" class="d-block" alt="Pingendo logo" height="16"></pingendo>
</body>

</html>
