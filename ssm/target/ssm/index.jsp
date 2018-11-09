<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/theme.css" type="text/css">

    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
</head>

<body class="text-center" style="		background-position: top left;	background-size: 100%;	background-repeat: repeat;" >
<div class="p-5 text-dark text-left" style="opacity: 0.5;">
    <div class="container w-50 text-dark">
        <form class="" action="${pageContext.request.contextPath}/mail/send">
        <div class="row text-primary">
            <div class="col-md-12">
                <div class="form-group"> <label>Email address</label> <input type="email" class="form-control" placeholder="Enter email" name="email"> <small class="form-text text-muted">We'll never share your email with anyone else.</small> </div>
            </div>
        </div>
        <div class="row text-primary">
            <div class="col-md-12">
                <div class="form-group" style="opacity: 0.5;"> <label>Password</label> <input type="password" class="form-control" placeholder="Password"> </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="form-group m-2" style="opacity: 0.5;"> <label></label> <input type="password" class="form-control" placeholder="code"> </div>
            </div>
            <div class="col-md-6"><img id="code" class="img-fluid d-block float-left m-3  " src="${pageContext.request.contextPath}/code/getCode" width="200px" ></div>
        </div>
        <div class="row">
            <div class="col-md-12 text-center"><button class="btn btn-primary" type="submit">Button </button></div>
        </div>
        </form>
    </div>
</div>
<script type="text/javascript">
    $(document).ready(function(){
    $("#code").click(function(){
        htmlobj=$.ajax({url:"${pageContext.request.contextPath}/code/getCode",async:false});
        $("#code").attr("src","${pageContext.request.contextPath}/code/getCode");
    });
    });
  /*  $(function() {

    });

    function changeImg() {
        var imgSrc = $("#imgObj");
        var src = imgSrc.attr("src");
        imgSrc.attr("src", chgUrl(src));
    }

    // 时间戳
    // 为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
    function chgUrl(url) {
        var timestamp = (new Date()).valueOf();
        url = url + "?timestamp=" + timestamp;
        // url = url.substring(0, 20);
        // if ((url.indexOf("&") >= 0)) {
        //     url = url + "×tamp=" + timestamp;
        // } else {
        //     url = url + "?timestamp=" + timestamp;
        // }
        return url;
    }
*/
</script>

  <script src="${pageContext.request.contextPath}/js/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="${pageContext.request.contextPath}/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>

</html>