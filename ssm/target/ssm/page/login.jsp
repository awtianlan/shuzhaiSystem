<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/25 0025
  Time: 下午 6:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
                <h4 class="page-head-line">Please Login To Enter </h4>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <h4> Login with facebook <strong> / </strong>Google :</h4>
                <br>
                <a href="index.html" class="btn btn-social btn-facebook">
                    <i class="fa fa-facebook"></i>&nbsp; Facebook Account</a> &nbsp;OR&nbsp; <a href="index.html" class="btn btn-social btn-google">
                <i class="fa fa-google-plus"></i>&nbsp; Google Account</a>
                <hr>
                <h4> Or Login with <strong>Zontal Account :</strong></h4>
                <br>
                <form method="post" action="${pageContext.request.contextPath}/user/login" onsubmit="return toVaild()">
                <label>账号 : </label>
                <input type="text" class="form-control" name="username">
                <label>密码 : </label>
                <input type="password" class="form-control" name="password">
                <label>Enter code : </label>
                <div class="row" style="">
                    <div class="col-md-6 border border-dark" style=""><input type="text" class="form-control w-100 m-2 text-dark rounded" placeholder="code" id="form15" style="opacity: 0.5;"></div>
                    <div class="col-md-5 p-1 m-1" style=""><img class="img-fluid d-block" id="code" src="${pageContext.request.contextPath}/code/getCode" width="150px"></div>
                </div>
                <hr>
                    <div class="row" style="opacity: 0.5;">
                        <div class="col-md-6 border border-dark" style=""></div>
                        <div class="col-md-5 p-1 m-1" style=""><a href="register.jsp">
                            <p  class="text-right"> 还没账号？注册一个 </p>
                        </a></div>
                    </div>
                <button class="btn btn-info" type="submit"><span class="glyphicon glyphicon-user"></span> &nbsp;Log Me In </button>&nbsp;
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
<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.js"></script>
<!-- BOOTSTRAP SCRIPTS  -->

<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
       if(('${msg}')!=null&&('${msg}')!=''){
           alert('${msg}');
        }
    });

    function toVaild(){
        var code;
        $.ajax({url:"${pageContext.request.contextPath}/code/getCodeInfo",
            dataType : "text",
            type: "get",
            async:false,
            success:function(data){
            code=data.toString();
                console.log(data.toString());
            },
            error: function(XMLHttpRequest, textStatus, errorThrown) {
                console.log(XMLHttpRequest.status);
                console.log(XMLHttpRequest.readyState);
                console.log(textStatus);
            }

        });
        //alert(code.toString() +"_"+$("#form15").val());
        if(($("#form15").val())==(code.toString() )){

            return true;
        }
        else{

            return false;
        }

    }
/*
    $(document).ready(function(){
        $("#code").click(function(){

            $("#code").attr("src","/code/getCode");
        });
    });*/


       $("#code").click(function(){
          var imgSrc = $("#code");
          var src = imgSrc.attr("src");
          imgSrc.attr("src", chgUrl(src));
      });

      // 时间戳
      // 为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
      function chgUrl(url) {
          var timestamp = (new Date()).valueOf();
          url = url + "?timestamp=" + timestamp;
          url = url.substring(0, 20);
          if ((url.indexOf("&") >= 0)) {
              url = url + "×tamp=" + timestamp;
          } else {
              url = url + "?timestamp=" + timestamp;
          }
          return url;
      }

</script>


<pingendo onclick="window.open('https://pingendo.com/', '_blank')" style="cursor:pointer;position: fixed;bottom: 20px;right:20px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:220px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white">Made with Pingendo Free&nbsp;&nbsp;<img src="https://pingendo.com/site-assets/Pingendo_logo_big.png" class="d-block" alt="Pingendo logo" height="16"></pingendo>

</body>
</html>