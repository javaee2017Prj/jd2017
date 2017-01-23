package qin.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
comment on column TB_MOBILEGOODS8.mobilegoods_id
  is '主键';
comment on column TB_MOBILEGOODS8.mobile_goodsnumber
  is '商品编号';
comment on column TB_MOBILEGOODS8.mobile_goodsname
  is '商品名称';
comment on column TB_MOBILEGOODS8.mobile_goodsprice
  is '商品价格';
comment on column TB_MOBILEGOODS8.mobile_goodsdescription
  is '商品描述';
comment on column TB_MOBILEGOODS8.mobile_os
  is '手机系统';
comment on column TB_MOBILEGOODS8.mobile_memory
  is '手机内存';
comment on column TB_MOBILEGOODS8.mobile_frontcamera
  is '前置摄像头';
comment on column TB_MOBILEGOODS8.mobile_news
  is '热点';
comment on column TB_MOBILEGOODS8.mobile_backcamera
  is '后置摄像头';
comment on column TB_MOBILEGOODS8.mobile_battery
  is '电池';
comment on column TB_MOBILEGOODS8.mobile_rom
  is '机身内存';
comment on column TB_MOBILEGOODS8.mobile_color
  is '机身颜色';
 */
public class MakeTable
{
    public
    Session session =
              (
                        (SessionFactory) new
                                  ClassPathXmlApplicationContext("applicationContext.xml")
                                  .getBean("sessionFactory")
              ).openSession();

    /**
     * 开启事务
     */
    public Transaction transaction = session.beginTransaction();

    @Test
    public void make()
    {

    }
}
/*

MOBILE_GOODSNUMBER	            NUMBER(10)	        商品编号
MOBILE_GOODSNAME	            VARCHAR2(50)	    手机名称
MOBILE_GOODSPRICE	            BINARY_DOUBLE	    手机价格
MOBILE_GOODSDESCRIPTION	        CLOB	            手机描述
MOBILE_OS_	                    VARCHAR2(10)	    手机系统	    空
MOBILE_MEMORY_	                VARCHAR2(20)	    手机内存
MOBILE_FRONTCAMERA_	            VARCHAR2(30)	    前置摄像头	空
MOBILE_NEWS_	                VARCHAR2(3000)	    热点
MOBILE_BACKCAMERA_	            VARCHAR2(50)	    后置摄像头	空
MOBILE_BATTERY_	                VARCHAR2(50)	    电池
MOBILE_ROM_	                    VARCHAR2(40)	    机身内存
MOBILE_COLOR_	                VARCHAR2(50)	    机身颜色


 */