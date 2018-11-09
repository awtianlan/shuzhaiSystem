<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String username=(String)request.getSession().getAttribute("username");
%>
<html>

<head></head>

<body>
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
<style type="text/css">


    .zh{
        font-family: 楷体;
        font-size: xx-large;
        font-style: normal;
    }
    .en{
        font-family: 楷体;
        font-size: medium;
        font-style: normal;
    }
</style>
<header>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <strong>Email: </strong>info@yourdomain.com &nbsp;&nbsp; <strong>Support: </strong>+90-897-678-44 </div>
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
            <a class="navbar-brand" href="index.html">

                <div class="zh">摘文网</div><br>
                <div class="en">zhaiwenwang</div>
            </a>
        </div>
        <div class="left-div">
            <div class="user-settings-wrapper">
                <ul class="nav">
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false" >
                            <span class="glyphicon glyphicon-user" style="font-size: 25px;"></span>
                        </a>
                        <div class="dropdown-menu dropdown-settings">
                            <div class="media">
                                <a class="media-left" href="#">
                                    <img src="img/64-64.jpg" alt="" class="img-rounded" id="headpic">
                                </a>
                                <div class="media-body">
                                    <h4 class="media-heading" id="user">

                                    </h4>
                                    <h5 id="role"></h5>
                                </div>
                            </div>
                            <hr>
                            <h5><strong>Personal Bio : </strong></h5> Anim pariatur cliche reprehen derit.
                            <hr>
                            <a href="#" class="btn btn-info btn-sm">Full Profile</a>&nbsp; <a href="login.html" class="btn btn-danger btn-sm">Logout</a>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- LOGO HEADER END-->
<section class="menu-section">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="navbar-collapse collapse ">
                    <ul id="menu-top" class="nav navbar-nav navbar-right">
                        <li><a class="menu-top-active" href="index.html">首页</a></li>
                        <li><a href="ui.html">UI Elements</a></li>
                        <li><a href="table.html">Data Tables</a></li>
                        <li><a href="forms.html">Forms</a></li>
                        <li><a href="login.html">Login Page</a></li>
                        <li><a href="blank.html">Blank Page</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- MENU SECTION END-->
<div class="content-wrapper">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h4 class="page-head-line">Dashboard</h4>
            </div>
        </div>
        <div class="row">
            <div class="col-md-3 col-sm-3 col-xs-6" style="">
              <a href="login.jsp">  <div class="dashboard-div-wrapper bk-clr-one">
                    <i class="glyphicon glyphicon-user dashboard-div-icon"></i>
                    <h5>用户登录</h5>
                </div></a>
            </div>
            <div class="col-md-3 col-sm-3 col-xs-6" style="">
                <div class="dashboard-div-wrapper bk-clr-two">
                    <i class="fa fa-edit dashboard-div-icon"></i>
                    <h5>作者登录</h5>
                </div>
            </div>
            <div class="col-md-3 col-sm-3 col-xs-6" style="">
                <div class="dashboard-div-wrapper bk-clr-three">
                    <i class="fa fa-cogs dashboard-div-icon"></i>
                    <h5>管理员登录</h5>
                </div>
            </div>
            <div class="col-md-3 col-sm-3 col-xs-6" style="">
                <div class="dashboard-div-wrapper bk-clr-four">
                    <i class="fa fa-bell-o dashboard-div-icon"></i>
                    <h5>消息提醒</h5>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="notice-board">
                    <div class="panel panel-default">
                        <div class="panel-heading"> Active Notice Panel <div class="pull-right">
                            <div class="dropdown">
                                <button class="btn btn-success dropdown-toggle btn-xs" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-expanded="true">
                                    <span class="glyphicon glyphicon-cog"></span>
                                    <span class="caret"></span>
                                </button>
                                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                                    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Refresh</a></li>
                                    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Logout</a></li>
                                </ul>
                            </div>
                        </div>
                        </div>
                        <div class="panel-body">
                            <ul>
                                <c:forEach items="${novels}" var="tb">
                                <li>
                                    <a href="${pageContext.request.contextPath}/novel/novelinfo?id=${tb.id}">
                                        <span class="glyphicon glyphicon-align-left text-success"></span> ${tb.name} <span class="label label-warning"> Just now </span>
                                    </a>
                                </li>
                                </c:forEach>
                            </ul>
                        </div>
                        <div class="panel-footer">
                            <a href="#" class="btn btn-default btn-block"> <i class="glyphicon glyphicon-repeat"></i> Just A Small Footer Button</a>
                        </div>
                    </div>
                </div>
                <hr>
                <div class="text-center alert alert-warning">
                    <a href="#" class="btn btn-social btn-facebook">
                        <i class="fa fa-facebook"></i>&nbsp; Facebook</a>
                    <a href="#" class="btn btn-social btn-google">
                        <i class="fa fa-google-plus"></i>&nbsp; Google</a>
                    <a href="#" class="btn btn-social btn-twitter">
                        <i class="fa fa-twitter"></i>&nbsp; Twitter </a>
                    <a href="#" class="btn btn-social btn-linkedin">
                        <i class="fa fa-linkedin"></i>&nbsp; Linkedin </a>
                </div>
                <hr>
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover">
                        <thead>
                        <tr>
                            <th>Ref. No.</th>
                            <th>Date</th>
                            <th>Amount</th>
                            <th>Status</th>
                            <th>Delivery On </th>
                            <th># #</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td># 2501</td>
                            <td>01/22/2015 </td>
                            <td>
                                <label class="label label-info">300 USD </label>
                            </td>
                            <td>
                                <label class="label label-success">Delivered</label></td>
                            <td>01/25/2015</td>
                            <td> <a href="#" class="btn btn-xs btn-danger">View</a> </td>
                        </tr>
                        <tr>
                            <td># 15091</td>
                            <td>12/12/2014 </td>
                            <td>
                                <label class="label label-danger">7000 USD </label>
                            </td>
                            <td>
                                <label class="label label-warning">Shipped</label></td>
                            <td>N/A</td>
                            <td> <a href="#" class="btn btn-xs btn-success">View</a> </td>
                        </tr>
                        <tr>
                            <td># 11291</td>
                            <td>12/03/2014 </td>
                            <td>
                                <label class="label label-warning">7000 USD </label>
                            </td>
                            <td>
                                <label class="label label-success">Delivered</label></td>
                            <td>01/23/2015</td>
                            <td> <a href="#" class="btn btn-xs btn-primary">View</a> </td>
                        </tr>
                        <tr>
                            <td># 1808</td>
                            <td>11/10/2014 </td>
                            <td>
                                <label class="label label-success">2000 USD </label>
                            </td>
                            <td>
                                <label class="label label-info">Returned</label></td>
                            <td>N/A</td>
                            <td> <a href="#" class="btn btn-xs btn-danger">View</a> </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="col-md-6">
                <div id="myCarousel" class="carousel slide" >
                    <!-- 轮播（Carousel）指标 -->
                    <ol class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="1"></li>
                        <li data-target="#myCarousel" data-slide-to="2"></li>
                    </ol>
                    <!-- 轮播（Carousel）项目 -->
                    <div class="carousel-inner">
                        <div class="item active">
                            <img src="${path}/2.jpg" alt="First slide">
                        </div>
                        <div class="item">
                            <img src="${path}/2.jpg" alt="Second slide">
                        </div>
                        <div class="item">
                            <img src="${path}/2.jpg" alt="Third slide">
                        </div>
                    </div>
                    <!-- 轮播（Carousel）导航 -->
                    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
                <hr>
                <div class="Compose-Message">
                    <div class="panel panel-success">
                        <div class="panel-heading"> Compose New Message </div>
                        <div class="panel-body">
                            <label>Enter Recipient Name : </label>
                            <input type="text" class="form-control">
                            <label>Enter Subject : </label>
                            <input type="text" class="form-control">
                            <label>Enter Message : </label>
                            <textarea rows="9" class="form-control"></textarea>
                            <hr>
                            <a href="#" class="btn btn-warning"><span class="glyphicon glyphicon-envelope"></span> Send Message </a>&nbsp; <a href="#" class="btn btn-success"><span class="glyphicon glyphicon-tags"></span> Save To Drafts </a>
                        </div>
                        <div class="panel-footer text-muted">
                            <strong>Note : </strong>Please note that we track all messages so don't send any spams. </div>
                    </div>
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

<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.js"></script>
<!-- BOOTSTRAP SCRIPTS  -->
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>

<script type="text/javascript">
    $(function(){
        $.ajax({url:"${pageContext.request.contextPath}/user/getUserInfob",
            dataType : "json",
            type: "get",
            async:false,
            success:function(data){
               //var data=eval('(' + result + ')');
                // alert(data.user.toString());
                console.log(data);
                if(data!=null){
                    // alert(data.user.toString());
                    $("#headpic").attr('src','${img}'+data.headpic);
                    console.log(data.role);
                    $("#user").text(data.username);
                    if(data.role==0)
                        $("#role").text("普通用户");
                    if(data.role==1)
                        $("#role").text("作者");
                    //$(".media-heading").text(data.username);
                    //$(".media-heading").text(data.username);
                }
                else
                    $("#user").text("未登录");
            },
            error: function(XMLHttpRequest, textStatus, errorThrown) {
                console.log(XMLHttpRequest.status);
                console.log(XMLHttpRequest.readyState);
                console.log(textStatus);
            }

        });
    })

    function getUser(){
        var user;

    }
</script>
<pingendo onclick="window.open('https://pingendo.com/', '_blank')" style="cursor:pointer;position: fixed;bottom: 20px;right:20px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:220px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white">Made with Pingendo Free&nbsp;&nbsp;<img src="https://pingendo.com/site-assets/Pingendo_logo_big.png" class="d-block" alt="Pingendo logo" height="16"></pingendo>

</body>
</html>