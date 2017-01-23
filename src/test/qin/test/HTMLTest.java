package qin.test;

import org.junit.Test;

public class HTMLTest
{
    @Test
    public void testing()
    {
        print("MOBILE_GOODSNUMBER", "NUMBER(10),商品编号", "商品编号");
        print("MOBILE_GOODSNAME", "VARCHAR2(50),手机名称", "手机名称");
        print("MOBILE_GOODSPRICE", "BINARY_DOUBLE,手机价格", "手机价格");
        print("MOBILE_GOODSDESCRIPTION", "CLOB,手机描述", "手机描述");
        print("MOBILE_OS_", "VARCHAR2(10),手机系统可为空", "手机系统");
        print("MOBILE_MEMORY_", "VARCHAR2(20),手机内存", "手机内存");
        print("MOBILE_FRONTCAMERA_", "VARCHAR2(30),前置摄像头可为空", "前置摄像头");
        print("MOBILE_NEWS_", "VARCHAR2(3000),热点", "热点  ");
        print("MOBILE_BACKCAMERA_", "VARCHAR2(50),后置摄像头可为空", "后置摄像头");
        print("MOBILE_BATTERY_", "VARCHAR2(50),电池", "电池  ");
        print("MOBILE_ROM_", "VARCHAR2(40),机身内存", "机身内存");
        print("MOBILE_COLOR_", "VARCHAR2(50),机身颜色", "机身颜色");
    }

    private void print(String id, String placeHolder, String desc)
    {
        String labelFor = "LABEL_" + id;

        String s = new StringBuilder()
                  .append("<div class=\"form-group\">\n")
                  .append("                    <label for=\"")
                  .append(labelFor)
                  .append("\" class=\"col-sm-2 control-label\">")
                  .append(desc)
                  .append("</label>\n")
                  .append("                    <div class=\"col-sm-10\">\n")
                  .append("                        <input type=\"text\" class=\"form-control\" id=\"")
                  .append(id)
                  .append("\" placeholder=\"")
                  .append(placeHolder)
                  .append("\"/>\n")
                  .append("                    </div>\n")
                  .append("                </div>\n").toString();

        System.out.println(s);
    }
}