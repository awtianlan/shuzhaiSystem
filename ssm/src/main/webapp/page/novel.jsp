<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/25 0025
  Time: 下午 2:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String username= (String) request.getSession().getAttribute("username");
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
<link rel="stylesheet" href="${pageContext.request.contextPath}/dist/summernote.css">
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
<div class="content-wrapper" style="" >
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="page-head-line">简介 </h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-2 text-right" style="">
                <img src="${novel.novelpic}" width="120px" height="150px" class="float-right">
            </div>
            <div class="col-md-8" style="">
                <div class="card">
                    <div class="card-body">
                        <h4>${novel.name}</h4>
                        <h6 class="text-muted">${novel.author}</h6>
                        <p class="text">${novel.description}</p>
                        <div class="button"> <button type="button" class="btn btn-primary">开始阅读</button> &nbsp;&nbsp;<button type="button" class="btn btn-primary" >加入书架</button></div>
                    </div>
                </div>
            </div>
        </div>
        <br>
        <div class="row">
            <!--折叠开始-->
            <div class="panel-group" id="accordion">
                <div class="panel panel-default">
                    <div class="panel-heading" >
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne" class="">
                                <h1 class="page-head-line">章节 </h1>
                            </a>
                        </h4>
                    </div>
                    <div id="collapseOne" class="panel-collapse collapse" style="">
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-md-6" >
                                    <ul id="list1"></ul>
                                </div>
                                <div class="col-md-6"id="list2">
                                    <ul iid="list1"></ul>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <!--分页文字信息  -->
                            <div class="col-md-6" id="page_info_area">
                                <!-- 当前页，总页，总条记录 -->
                            </div>
                            <!--分页条信息  -->
                            <div class="col-md-6" id="page_nav_area">

                            </div>
                        </div>

                    </div>
                </div>
                <!--折叠结束-->
            </div>
        <div class="row">
            <div class="col-md-12">
                <h1 class="page-head-line">评论</h1>
            </div>
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
    <div class="row text-center" style="width: 800px">
        <div class="col-md-12">
            <div class="summernote"></div>
        </div>

    </div>
    <div class="row text-center" style="width: 800px">
        <div class="col-md-12">
            <button type="button" class="btn btn-primary" onclick="comment()">评论</button>
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

<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.js"></script>
<!-- BOOTSTRAP SCRIPTS  -->
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/dist/summernote.js"></script>
<pingendo onclick="window.open('https://pingendo.com/', '_blank')" style="cursor:pointer;position: fixed;bottom: 20px;right:20px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:220px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white">Made with Pingendo Free&nbsp;&nbsp;<img src="https://pingendo.com/site-assets/Pingendo_logo_big.png" class="d-block" alt="Pingendo logo" height="16"></pingendo>
<script type="text/javascript">
    var totalRecord,currentPage;
    //页面加载完成以后，直接去发送ajax请求，要到分页数据
    $(function(){
        //页面加载完默认进首页
        to_page(1);
        more();
        $('.summernote').summernote({
            height: 300,
            tabsize: 2
        });
    });
    //点击页面时，实现页码跳转
    function to_page(pn){
        $.ajax({
            url:"${pageContext.request.contextPath}/chapter/getpage",
            data:{
                "nid":${novel.id},
                "page":pn
            },//pn是用户指定跳转的页码数
            type:"post",
            //请求成功的回调函数，result是服务器响应给浏览器的数据
            success:function(result){
                console.log(typeof result);//需要在浏览器的控制台中查看
                //1.解析并显示员工数据
                result=eval('(' + result + ')');
                console.log(typeof result);
                build_detail(result);
                //2.解析并显示分页信息
                build_page_info(result);
                //3.解析显示分页条
                build_page_nav(result);
            }
        });
    }

    function build_detail(result){
        //清空table表格
        $("#list1").empty();
        $("#list2").empty();
        //获取json串中返回的结果集（库表中的数据）
        var data=result;
        //循环遍历结果集==>循环遍历所有员工数据
        //参数1：要遍历的emps集合，参数2:每次遍历的回调函数
        //回调函数：参数1：索引，参数2：当前对象
        var i=0;
        while (i<data.list.length){
            var item=data.list[i];
            if(i<5){
                console.log(typeof item);
                console.log( item);
                <%--var Li=$("<li></li>").append($("<a></a>").append(item["name"]).attr("href","${path}"+item["chapterLink"]));--%>
                $("#list1").append("<a href='${path}"+item["chapterLink"]+"'  class='list-group-item '>"+item["name"]+"</a>")
            }
            else{
               // var Li=$("<li></li>").append($("<a></a>").append(item["name"]).attr("href","${path}"+item["chapterLink"]));
                $("#list2").append("<a href='${path}"+item["chapterLink"]+"' class='list-group-item '>"+item["name"]+"</a>")
            }
            i++;
        }

    }
    //解析显示分页信息
    function build_page_info(result){
        //清空分页信息
        $("#page_info_area").empty();
        $("#page_info_area").append("当前"+result.pageNum+"页，总"+
            result.pages+"页，总"+
            result.total+"条记录");
        totalRecord=result.total;
        currentPage=result.pageNum;
    }

    //解析显示分页条
    function build_page_nav(result){
        //清空分页导航
        $("#page_nav_area").empty();
        //page_nav_area
        //创建ul
        var ul=$("<ul></ul>").addClass("pagination");
        //首页
        var firstPageLi=$("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
        //前一页
        var prePageLi=$("<li></li>").append($("<a></a>").append($("<span></span>").append("&laquo;")));
        //如果没有了前一页，首页和前一页按钮不可用
        if(result.hasPreviousPage==false){
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");

        }
        //为元素添加点击翻页事件
        //首页单击事件
        firstPageLi.click(function(){
            to_page(1);
        });
        //上一页单击事件:当前页-1
        prePageLi.click(function(){
            to_page(result.pageNum-1);
        });

        //后一页
        var nextPageLi=$("<li></li>").append($("<a></a>").append($("<span></span>").append("&raquo;")));
        //末页
        var lastPageLi=$("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
        //如果没有了下一页，末页和下一页按钮不可用
        if(result.hasNextPage==false){
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");

        }
        //下一页的单击事件：当前页+1
        nextPageLi.click(function(){
            to_page(result.pageNum+1);
        });
        lastPageLi.click(function(){
            to_page(result.pages);
        });


        //添加首页和前一页的提示
        ul.append(firstPageLi).append(prePageLi);
        //循环遍历给ul中添加页码提示，取出页码号 1,2,3,4,5，
        $.each(result.navigatepageNums,function(index,item){
            var numLi=$("<li></li>").append($("<a></a>").append(item));
            //如果当前页码等于正在循环遍历的页码，则页码变色
            if(result.pageNum==item){
                numLi.addClass("active");
            }
            //给页码添加单击事件
            numLi.click(function(){
                to_page(item);
            });
            ul.append(numLi);
        });
        //添加下一页和末页的提示
        ul.append(nextPageLi).append(lastPageLi);
        //创建nav,将ul标签添加到nav标签中
        var nav=$("<nav></nav>").append(ul);
        //将分页条添加到上面id中
        nav.appendTo("#page_nav_area");
    }
    var pn=1;
    var cn=0;
    var ct;
function more(){

    $.ajax({
        url:"${pageContext.request.contextPath}/NR/getpage",
        data:{
            "nid":${novel.id},
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
                html+="<td class='text-right'><span class='glyphicon glyphicon-list-alt' onclick='linkto("+item.id+")'>"+item.novelReviewReplies.length+"</span>&nbsp;&nbsp;<span onclick='up(this,"+item.id+")' class='glyphicon glyphicon-thumbs-up' >"+item.likeNum+"</span></td></tr></tbody></table>"
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
function linkto(id){
    window.location.href="${pageContext.request.contextPath}/NR/getNRRById?id="+id;
}
function comment(){
    var username='${username}';
    if(username==''){
        alert("请登录后评论！");
        return;
    }

    var comment= $($(".summernote").summernote("code")).text();
    $.ajax({
        url:"${pageContext.request.contextPath}/NR/comment",
        data:{
           "nid":${novel.id},
            "comment":comment
        },

        //请求成功的回调函数，result是服务器响应给浏览器的数据
        success:function(result){


        }
    });
}
</script>
</body>
</html>