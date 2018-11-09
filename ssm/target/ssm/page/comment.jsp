<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/25 0025
  Time: 下午 2:59
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
                <img src="assets/img/logo.png">
            </a>
        </div>
        <div class="left-div">
            <div class="user-settings-wrapper">
                <ul class="nav">
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                            <span class="glyphicon glyphicon-user" style="font-size: 25px;"></span>
                        </a>
                        <div class="dropdown-menu dropdown-settings">
                            <div class="media">
                                <a class="media-left" href="#">
                                    <img src="assets/img/64-64.jpg" alt="" class="img-rounded">
                                </a>
                                <div class="media-body">
                                    <h4 class="media-heading">Jhon Deo Alex </h4>
                                    <h5>Developer &amp; Designer</h5>
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
                        <li><a href="index.html">Dashboard</a></li>
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
<div class="content-wrapper" style="">
    <div class="container">
        <br>
        <div class="row">

            <div class="panel-group" id="accordion"></div>
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-head-line">评论</h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <table class="table">
                        <tbody>
                        <tr class="active">
                            <td><img class="p-3 img-fluid img-thumbnail" src="${img.concat(nrr.user.headpic)}" alt="Card image" width="50">${nrr.user.username}</td>
                            <td></td>
                            <td class=" text-right"><span class="glyphicon glyphicon-time">${nrr.createTime}</span></td>
                        </tr>
                        <tr class="success">
                            <td colspan="3">
                                <p calss="text"> ${nrr.content}</p>
                            </td>
                        </tr>
                        <tr class="warning">
                            <td></td>
                            <td></td>
                            <td class="text-right">&nbsp;&nbsp;<span class="glyphicon glyphicon-thumbs-up">${nrr.likeNum}</span></td>
                        </tr>
                        </tbody>
                    </table>
                    <div class="col-md-12">
                        <h1 class="page-head-line bg-warning"></h1>
                    </div>
                    <div class="row">
                        <div class="col-md-12" id="comment">

                        </div>
                    </div>
                </div>
            </div>
            <div class="row text-center">
                <p id="dis">
                    <a id="more" onclick="more()">查看更多</a>
                </p>
            </div>
        </div>
    </div>
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-12"> © 2015 YourCompany | By : <a href="http://www.designbootstrap.com/" target="_blank">DesignBootstrap</a>
                </div>
            </div>
        </div>
    </footer>
    <!-- FOOTER SECTION END-->

<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.js"></script>
<!-- BOOTSTRAP SCRIPTS  -->
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>

    <script type="text/javascript" >
        $(function(){
more();
        })
        var pn=1;
        var cn=0;
        var ct;
        function more(){

            $.ajax({
                url:"${pageContext.request.contextPath}/NRR/getpage",
                data:{
                    "nrid":${nrr.id},
                    "page":pn
                },//pn是用户指定跳转的页码数
                type:"post",
                //请求成功的回调函数，result是服务器响应给浏览器的数据
                success:function(result){
                    console.log(typeof result);//需要在浏览器的控制台中查看
                    //1.解析并显示员工数据
                    result=eval('(' + result + ')');
                    ct=result.total;
                    if((cn+10)>=ct){
                        $("#dis").html("没有更多了");
                        //  $("#more").off("click");
                    }
                    console.log( result);
                    var data=result.list;
                    $.each(data,function(index,item){
                        var html="  <table class='table'><tbody><tr ><td><img class='p-3 img-fluid img-thumbnail' width='50' src='${img}"+item.user.headpic+"' >"+item.user.username+"</td>";
                        html+=" <td></td><td class=' text-right'><span class='glyphicon glyphicon-time'>"+item.createTime+"</span></td></tr>"
                        html+=" <tr class='success'><td colspan='3'><p calss='text'>"+item.content+" </p></td></tr><tr class='warning'><td></td><td></td>"
                        html+="<td class='text-right'><span class='glyphicon glyphicon-list-alt' onclick=''>"+item.novelReviewReplies.length+"</span>&nbsp;&nbsp;<span onclick='up(this,"+item.id+")' class='glyphicon glyphicon-thumbs-up' >"+item.likeNum+"</span></td></tr></tbody></table>"
                        cn++;
                        $("#comment").append(html);
                    });

                }
            });
            pn++;
        }
        function up(t,nrid){
            // alert(nrid);
            $.ajax({
                url:"${pageContext.request.contextPath}/NR/up",
                data:{
                    "nrid":nrid
                },

                //请求成功的回调函数，result是服务器响应给浏览器的数据
                success:function(result){
                    t.innerHTML=(result);

                }
            });
        }
    </script>
<pingendo onclick="window.open('https://pingendo.com/', '_blank')" style="cursor:pointer;position: fixed;bottom: 20px;right:20px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:220px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white">Made with Pingendo Free&nbsp;&nbsp;<img src="https://pingendo.com/site-assets/Pingendo_logo_big.png" class="d-block" alt="Pingendo logo" height="16"></pingendo>
</div>
</body>
</html>