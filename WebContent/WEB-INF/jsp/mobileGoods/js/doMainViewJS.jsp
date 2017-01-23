<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- doMainView.jsp javascript代码 -->
<script type="text/javascript">

    var basePath = "/jd2017/mobileGoods/";

    $(function ()
        {
            //显示商品类型下拉框
            showGoodsType();
        }
    );

    //region 显示商品类型下拉框
    function showGoodsType()
    {
        $.ajax
        (
            {
                url: basePath + "showGoodsType.com",
                method: 'POST',
                success: function (msg)
                {
                    $('#MOBILE_TYPE_DIV').append(msg);
                }
            }
        )
    }
    //endregion

    //region 对addJS_expInfo的操作
    /** 清空div */
    function clearDiv()
    {
        $('#addJS_expInfo').empty();
    }

    /** 赋消息 */
    function appendMsg(msg)
    {
        $('#addJS_expInfo').append(msg);
    }

    /** 又清空又赋消息 */
    function clearAndAppend(msg)
    {
        clearDiv();
        appendMsg(msg);
        console.log(msg + "<br>");
        $('#myModal').modal('show');
    }
    //endregion

    //region 新增手机商品
    /** 新增手机商品 */
    function addMobileGoods()
    {
        //region 接收界面控件
        //商品编号
        var MOBILE_GOODSNUMBER = $('#MOBILE_GOODSNUMBER').val();
        //手机名称
        var MOBILE_GOODSNAME = $('#MOBILE_GOODSNAME').val();
        //手机价格
        var MOBILE_GOODSPRICE = $('#MOBILE_GOODSPRICE').val();
        //手机描述
        var MOBILE_GOODSDESCRIPTION = $('#MOBILE_GOODSDESCRIPTION').val();
        //手机系统
        var MOBILE_OS_ = $('#MOBILE_OS_').val();
        //手机内存
        var MOBILE_MEMORY_ = $('#MOBILE_MEMORY_').val();
        //前置摄像头
        var MOBILE_FRONTCAMERA_ = $('#MOBILE_FRONTCAMERA_').val();
        //热点
        var MOBILE_NEWS_ = $('#MOBILE_NEWS_').val();
        //后置摄像头
        var MOBILE_BACKCAMERA_ = $('#MOBILE_BACKCAMERA_').val();
        //电池
        var MOBILE_BATTERY_ = $('#MOBILE_BATTERY_').val();
        //机身内存
        var MOBILE_ROM_ = $('#MOBILE_ROM_').val();
        //机身颜色
        var MOBILE_COLOR_ = $('#MOBILE_COLOR_').val();
        //endregion

        //region 判断哪些不能为空, 如果为空则提示错误
        if (MOBILE_GOODSNUMBER.length == 0)
        {
            clearAndAppend("请填写手机编号!");
            return;
        }
        if (MOBILE_GOODSNAME.length == 0)
        {
            clearAndAppend("请填写手机名称!");
            return;
        }
        if (MOBILE_GOODSPRICE.length == 0)
        {
            clearAndAppend("请填写手机价格!");
            return;
        }
        if (MOBILE_GOODSDESCRIPTION.length == 0)
        {
            clearAndAppend("请填写手机描述!");
            return;
        }
        if (MOBILE_MEMORY_.length == 0)
        {
            clearAndAppend("请填写手机内存!");
            return;
        }
        if (MOBILE_NEWS_.length == 0)
        {
            clearAndAppend("请填写手机热点!");
            return;
        }
        if (MOBILE_BATTERY_.length == 0)
        {
            clearAndAppend("请填写手机电池!");
            return;
        }
        if (MOBILE_ROM_.length == 0)
        {
            clearAndAppend("请填写手机的机身内存!");
            return;
        }
        if (MOBILE_COLOR_.length == 0)
        {
            clearAndAppend("请填写手机的机身颜色!");
            return;
        }
        //endregion

        //region 图片
        var getMobile_ImagesMap1 = $('#getMobile_ImagesMap1').val();
        var getMobile_ImagesMap2 = $('#getMobile_ImagesMap2').val();
        var getMobile_ImagesMap3 = $('#getMobile_ImagesMap3').val();
        var getMobile_ImagesMap4 = $('#getMobile_ImagesMap4').val();
        var getMobile_ImagesMap5 = $('#getMobile_ImagesMap5').val();
        //endregion

        var addURL = basePath + "addMobileGoods.com?MOBILE_GOODSNUMBER=" + MOBILE_GOODSNUMBER +
            "       &&MOBILE_GOODSNAME=" + MOBILE_GOODSNAME +
            "       &&MOBILE_GOODSPRICE=" + MOBILE_GOODSPRICE +
            "       &&MOBILE_GOODSDESCRIPTION=" + MOBILE_GOODSDESCRIPTION +
            "       &&MOBILE_OS_=" + MOBILE_OS_ +
            "       &&MOBILE_MEMORY_=" + MOBILE_MEMORY_ +
            "       &&MOBILE_FRONTCAMERA_=" + MOBILE_FRONTCAMERA_ +
            "       &&MOBILE_NEWS_=" + MOBILE_NEWS_ +
            "       &&MOBILE_BACKCAMERA_=" + MOBILE_BACKCAMERA_ +
            "       &&MOBILE_BATTERY_=" + MOBILE_BATTERY_ +
            "       &&MOBILE_ROM_=" + MOBILE_ROM_ +
            "       &&MOBILE_COLOR_=" + MOBILE_COLOR_ +
            "       &&MOBILE_TYPE=" + $('#MOBILE_TYPE option:selected')[0].innerHTML +
            "       &&getMobile_ImagesMap1=" + getMobile_ImagesMap1 +
            "       &&getMobile_ImagesMap2=" + getMobile_ImagesMap2 +
            "       &&getMobile_ImagesMap3=" + getMobile_ImagesMap3 +
            "       &&getMobile_ImagesMap4=" + getMobile_ImagesMap4 +
            "       &&getMobile_ImagesMap5=" + getMobile_ImagesMap5;

        $.ajax
        (
            {
                url: addURL,
                method: 'POST',
                success: function (msg)
                {
                    //
                }
            }
        )
    }
    //endregion

</script>

<%-- 显示异常信息信息框 --%>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="myModalLabel">
                    <div style="font-family: 微软雅黑; font-size: 36px; font-weight: bold; color: firebrick;">
                        您的异常信息:
                    </div>
                </h4>
            </div>
            <div class="modal-body" id="addJS_expInfo"
                 style="font-family: 微软雅黑; font-size: 16px; color: red;"></div>
            <div class="modal-footer">
                <%--<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>--%>
                <button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>
<%-- 显示异常信息信息框 --%>