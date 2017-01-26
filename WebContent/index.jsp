<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>

<html>

<head>
    <title>欢迎来到手机商城!</title>
    <!-- jquery2.2.4 -->
    <script type="text/javascript" src="http://localhost/jsLib/jQuery/jquery-2.2.4/jquery.js"></script>
    <!-- jquery2.2.4 -->
    <!-- bootstrap3 -->
    <script type="text/javascript" src="http://localhost/jsLib/bootstrap3/js/bootstrap.js"></script>
    <link rel="stylesheet" href="http://localhost/jsLib/bootstrap3/css/bootstrap.css">
    <!-- bootstrap3 -->
</head>

<body style="width: 100%;">

<%-- 头部导航栏 --%>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                    <a class="navbar-brand" href="#">Brand</a>
                </div>
            </nav>
        </div>
    </div>
</div>
<%-- 头部导航栏 --%>

<br><br><br><br>

<%-- 搜索框和logo --%>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-4 column">
            logo
        </div>

        <div class="col-md-8 column">

            <%-- 搜索框样式 --%>
            <style type="text/css">
                .text
                {
                    left: 0;
                    padding: 4px;
                    width: 490px;
                    height: 30px;
                    border: 1px solid #f10215;
                    line-height: 25px;
                    font-size: 14px;
                    color: #989898;
                }
            </style>
            <%-- 搜索框样式 --%>

            <input type="text" class="text" style="color: rgb(153, 153, 153);">
            <br>
            <div style="font-family: 微软雅黑;">
                <font style="color: #f10215;">返5%现金</font>
                &nbsp;
                <font style="color: darkgray;">抢购便宜手机</font>
            </div>

        </div>
    </div>
</div>
<%-- 搜索框和logo --%>

<%-- 导航菜单 --%>
<div class="container" style="width: 100%; margin-top: 2%;">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="btn-group">
                <button class="btn btn-default">首页</button>
                <button data-toggle="dropdown" class="btn btn-default dropdown-toggle">
                    <span class="caret"></span>
                </button>
               <%-- <ul class="dropdown-menu">
                    <li>
                        <a href="#">操作</a>
                    </li>
                    <li class="disabled">
                        <a href="#">另一操作</a>
                    </li>
                    <li class="divider">
                    </li>
                    <li>
                        <a href="#">其它</a>
                    </li>
                </ul>--%>
            </div>
            <div class="btn-group">
                <button class="btn btn-default">手机</button>
                <button data-toggle="dropdown" class="btn btn-default dropdown-toggle">
                    <span class="caret"></span>
                </button>
                <%-- <ul class="dropdown-menu">
                     <li>
                         <a href="#">操作</a>
                     </li>
                     <li class="disabled">
                         <a href="#">另一操作</a>
                     </li>
                     <li class="divider">
                     </li>
                     <li>
                         <a href="#">其它</a>
                     </li>
                 </ul>--%>
            </div>
        </div>
    </div>
</div>
</div>
<%-- 导航菜单 --%>

<br><br><br>

<%-- 底部 --%>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <ul class="breadcrumb">
                <li><a>关于我们</a></li>
                <li><a>联系我们</a></li>
                <li><a>联系客服</a></li>
                <li><a>商家入驻</a></li>
                <li><a>营销中心</a></li>
                <li><a>手机京东</a></li>
                <li><a>友情链接</a></li>
                <li><a>销售联盟</a></li>
                <li><a>京东社区</a></li>
                <li><a>风险监测</a></li>
                <li><a>隐私政策</a></li>
                <li><a>京东公益</a></li>
                <li><a>Contact us</a></li>
            </ul>
        </div>
    </div>
</div>
<%-- 底部 --%>

<br><br><br><br><br>
<br><br><br><br><br>

</body>

</html>





















