package qin.mobilegoods.utils;

import qin.javaee8.core.JavaEE8BaseSupport;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public interface MobileUtils extends JavaEE8BaseSupport
{
    @Override
    default String getLog4jLocation()
    {
        return "D:\\idea2016WK\\jd2017\\jd2017\\src\\resources\\log4j.properties";
    }

    default void returnJson(Object baseStr, HttpServletResponse response) throws Exception
    {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = null;
        out = response.getWriter();
        out.print(baseStr);
        out.flush();
    }
}