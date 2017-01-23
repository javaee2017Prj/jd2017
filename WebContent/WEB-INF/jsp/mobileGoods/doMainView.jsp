<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <script type="text/javascript" src="http://localhost/jsLib/jQuery/jquery-2.2.4/jquery.js"></script>
    <script type="text/javascript" src="http://localhost/jsLib/bootstrap3/js/bootstrap.js"></script>
    <link rel="stylesheet" href="http://localhost/jsLib/bootstrap3/css/bootstrap.css">
    <jsp:include page="js/doMainViewJS.jsp"></jsp:include>
</head>

<style type="text/css">
    #addMobileFrm
    {
        font-family: 微软雅黑;
        font-size: 16px;
    }
</style>

<body style="width: 100%;">

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
            </nav>
        </div>
    </div>
</div>

<br><br><br><br>

<%--
MOBILE_GOODSNUMBER	            NUMBER(10)	        商品编号
MOBILE_GOODSNAME	            VARCHAR2(50)	    手机名称
MOBILE_GOODSPRICE	            BINARY_DOUBLE	    手机价格
MOBILE_GOODSDESCRIPTION	        CLOB	            手机描述
*MOBILE_OS_	                    VARCHAR2(10)	    手机系统	    空
MOBILE_MEMORY_	                VARCHAR2(20)	    手机内存
*MOBILE_FRONTCAMERA_	            VARCHAR2(30)	    前置摄像头	空
MOBILE_NEWS_	                VARCHAR2(3000)	    热点
*MOBILE_BACKCAMERA_	            VARCHAR2(50)	    后置摄像头	空
MOBILE_BATTERY_	                VARCHAR2(50)	    电池
MOBILE_ROM_	                    VARCHAR2(40)	    机身内存
MOBILE_COLOR_	                VARCHAR2(50)	    机身颜色
--%>

<div class="container">
    <div class="row clearfix" style="width: 100%;">
        <div class="col-md-12 column">
            <form class="form-horizontal" role="form" id="addMobileFrm">

                <%-- 新增页面控件 --%>

                <%-- 类型 --%>
                <div class="form-group">
                    <label for="LABEL_MOBILE_TYPE" class="col-sm-2 control-label">商品类型</label>

                    <!-- 下拉框 -->

                    <!-- Single button -->
                    &nbsp;&nbsp;
                    <div class="btn-group" id="MOBILE_TYPE_DIV">
                        <%--<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                            商品类型:
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                        </ul>--%>
                        <select name="MOBILE_TYPE" id="MOBILE_TYPE">
                            <option value="">联想</option>
                            <option value="">华为</option>
                            <option value="">oppo</option>
                            <option value="">小米</option>
                            <option value="">大米</option>
                            <option value="">苹果</option>
                            <option value="">乐视</option>
                        </select>
                    </div>

                    <!-- 下拉框 -->

                </div>

                <div class="form-group">
                    <label for="LABEL_MOBILE_GOODSNUMBER" class="col-sm-2 control-label">商品编号</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="MOBILE_GOODSNUMBER" placeholder="NUMBER(10),商品编号"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="LABEL_MOBILE_GOODSNAME" class="col-sm-2 control-label">手机名称</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="MOBILE_GOODSNAME" placeholder="VARCHAR2(50),手机名称"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="LABEL_MOBILE_GOODSPRICE" class="col-sm-2 control-label">手机价格</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="MOBILE_GOODSPRICE" placeholder="BINARY_DOUBLE,手机价格"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="LABEL_MOBILE_GOODSDESCRIPTION" class="col-sm-2 control-label">手机描述</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="MOBILE_GOODSDESCRIPTION" placeholder="CLOB,手机描述"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="LABEL_MOBILE_OS_" class="col-sm-2 control-label">手机系统</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="MOBILE_OS_" placeholder="VARCHAR2(10),手机系统可为空"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="LABEL_MOBILE_MEMORY_" class="col-sm-2 control-label">手机内存</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="MOBILE_MEMORY_" placeholder="VARCHAR2(20),手机内存"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="LABEL_MOBILE_FRONTCAMERA_" class="col-sm-2 control-label">前置摄像头</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="MOBILE_FRONTCAMERA_" placeholder="VARCHAR2(30),前置摄像头可为空"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="LABEL_MOBILE_NEWS_" class="col-sm-2 control-label">热点 </label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="MOBILE_NEWS_" placeholder="VARCHAR2(3000),热点"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="LABEL_MOBILE_BACKCAMERA_" class="col-sm-2 control-label">后置摄像头</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="MOBILE_BACKCAMERA_" placeholder="VARCHAR2(50),后置摄像头可为空"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="LABEL_MOBILE_BATTERY_" class="col-sm-2 control-label">电池 </label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="MOBILE_BATTERY_" placeholder="VARCHAR2(50),电池"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="LABEL_MOBILE_ROM_" class="col-sm-2 control-label">机身内存</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="MOBILE_ROM_" placeholder="VARCHAR2(40),机身内存"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="LABEL_MOBILE_COLOR_" class="col-sm-2 control-label">机身颜色</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="MOBILE_COLOR_" placeholder="VARCHAR2(50),机身颜色"/>
                    </div>
                </div>

                <%-- 新增页面控件 --%>

                <form class="form-group">
                    <label for="label_mobile_imagesMap" class="col-sm-2 control-label">图片路径</label>
                    <div class="col-sm-10">
                        <!-- 排版 -->
                        <style type="text/css">
                            #getMobile_ImagesMap1, #getMobile_ImagesMap2, #getMobile_ImagesMap3, #getMobile_ImagesMap4, #getMobile_ImagesMap5
                            {
                                margin-bottom: 1%;
                            }
                        </style>
                        <!-- 排版 -->

                        <input type="text" class="form-control" id="getMobile_ImagesMap1" placeholder="图片路径1"/>
                        <input type="text" class="form-control" id="getMobile_ImagesMap2" placeholder="图片路径2"/>
                        <input type="text" class="form-control" id="getMobile_ImagesMap3" placeholder="图片路径3"/>
                        <input type="text" class="form-control" id="getMobile_ImagesMap4" placeholder="图片路径4"/>
                        <input type="text" class="form-control" id="getMobile_ImagesMap5" placeholder="图片路径5"/>
                    </div>

                </form>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="button" class="btn btn-default" onclick="addMobileGoods()">新增商品</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<br><br><br><br>
<br><br><br><br>
<br><br><br><br>
<br><br><br><br>
<br><br><br><br>
<br><br><br><br>
<br><br><br><br>

</body>

</html>