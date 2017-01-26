package qin.test;

import org.junit.Test;
import qin.mobilegoods.domain.GoodsType;
import qin.mobilegoods.domain.MobileGoods;

import java.util.Map;
import java.util.TreeMap;

public class SaveGoods extends MakeTable
{
    @Test
    public void save()
    {
        //region 华为
        GoodsType type_hw = (GoodsType) session
                  .createQuery("from GoodsType where goods_typeName='华为'")
                  .list().get(0);
        MobileGoods goodsHW = new MobileGoods();
        //编号
        goodsHW.setGoods_number(1976143248);
        //名称
        goodsHW.setGoods_name("华为 Mate 9 移动联通电信4G手机 双卡双待 陶瓷白 6GB+128GB版全网通");
        //价格
        goodsHW.setGoods_price(5599d);
        //描述
        goodsHW.setGoods_description("商品名称：华为 Mate 9 移动联通电信4G手机 双卡双待 陶瓷白 6GB+128GB版全网通商品编号：1976143248店铺： SOULDIO全球购专营店商品毛重：190.00g系统：安卓（Android）运行内存：6GB前置摄像头像素：1600万及以上购买方式：移动合约后置摄像头像素：后置双摄像头电池容量：1200mAh以下机身内存：128GB热点：以旧换新");
        //系统
        goodsHW.setMobile_os("android");
        //内存
        goodsHW.setMobile_memory("128GB");
        //前置摄像头
        goodsHW.setMobile_frontCamera("1600万及以上");
        //热点
        goodsHW.setMobile_news("以旧换新");
        //后置摄像头
        goodsHW.setMobile_backCamera("后置双摄像头");
        //电池
        goodsHW.setMobile_battery("1200mAh以下");
        //机身内存
        goodsHW.setMobile_rom("6GB");
        //机身颜色
        goodsHW.setMobile_color("白色");
        goodsHW.setMobileGoodsType(type_hw);
        type_hw.getMobileGoodsSet().add(goodsHW);
        Map<Integer, String> imageMap = new TreeMap<>();
        imageMap.put(0, "http://localhost/javaee8_2017/mobileImages/huawei/1.jpg");
        imageMap.put(1, "http://localhost/javaee8_2017/mobileImages/huawei/2.jpg");
        imageMap.put(2, "http://localhost/javaee8_2017/mobileImages/huawei/3.jpg");
        imageMap.put(3, "http://localhost/javaee8_2017/mobileImages/huawei/4.jpg");
        imageMap.put(4, "http://localhost/javaee8_2017/mobileImages/huawei/57a00fb0N9f53e751.jpg");
        imageMap.put(5, "http://localhost/javaee8_2017/mobileImages/huawei/57a41d5bNa173fc82.jpg");
        imageMap.put(6, "http://localhost/javaee8_2017/mobileImages/huawei/57a41d5fNbbf0d904.jpg");
        imageMap.put(7, "http://localhost/javaee8_2017/mobileImages/huawei/57a41d57Ndbe6d21e.jpg");
        imageMap.put(8, "http://localhost/javaee8_2017/mobileImages/huawei/57a41d66N6ba90761.jpg");

        goodsHW.setImagesMap(imageMap);
        session.save(goodsHW);
        session.update(type_hw);

        //endregion

        //region 苹果
        GoodsType type_apple = (GoodsType) session
                  .createQuery("from GoodsType where goods_typeName='苹果'")
                  .list().get(0);
        MobileGoods goodsApple = new MobileGoods();
        //编号
        goodsApple.setGoods_number(1975098661);
        //名称
        goodsApple.setGoods_name("苹果 iPhone6 (A1586) 全网通智能手机 深空灰 16GB");
        //价格
        goodsApple.setGoods_price(3298d);
        //描述
        goodsApple.setGoods_description("商品名称：苹果（Apple）iPhone6商品编号：1975098661店铺： 宜东国际数码专营店商品毛重：420.00g系统：苹果（IOS）运行内存：其他前置摄像头像素：200万-499万购买方式：其他后置摄像头像素：500万-1199万电池容量：1200mAh-1999mAh机身内存：16GB热点：指纹识别");
        //系统
        goodsApple.setMobile_os("ios");
        //内存
        goodsApple.setMobile_memory("128GB");
        //前置摄像头
        goodsApple.setMobile_frontCamera("200万-499万");
        //热点
        goodsApple.setMobile_news("以旧换新");
        //后置摄像头
        goodsApple.setMobile_backCamera("指纹识别");
        //电池
        goodsApple.setMobile_battery("1200mAh-1999mAh");
        //机身内存
        goodsApple.setMobile_rom("16GB");
        //机身颜色
        goodsApple.setMobile_color("玫瑰金");
        goodsApple.setMobileGoodsType(type_apple);
        type_apple.getMobileGoodsSet().add(goodsApple);
        Map<Integer, String> imageMap_apple = new TreeMap<>();
        imageMap.put(0, "http://localhost/javaee8_2017/mobileImages/apple/1.jpg");
        imageMap.put(1, "http://localhost/javaee8_2017/mobileImages/apple/2.jpg");
        imageMap.put(2, "http://localhost/javaee8_2017/mobileImages/apple/3.jpg");
        imageMap.put(3, "http://localhost/javaee8_2017/mobileImages/apple/4.jpg");
        imageMap.put(4, "http://localhost/javaee8_2017/mobileImages/apple/5.jpg");
        imageMap.put(5, "http://localhost/javaee8_2017/mobileImages/apple/6.jpg");
        imageMap.put(6, "http://localhost/javaee8_2017/mobileImages/apple/7.jpg");
        imageMap.put(7, "http://localhost/javaee8_2017/mobileImages/apple/8.jpg");
        imageMap.put(8, "http://localhost/javaee8_2017/mobileImages/apple/9.jpg");
        imageMap.put(9, "http://localhost/javaee8_2017/mobileImages/apple/10.jpg");
        goodsApple.setImagesMap(imageMap);

        session.save(goodsApple);
        session.update(type_apple);
        //endregion

        transaction.commit();
    }


}




















