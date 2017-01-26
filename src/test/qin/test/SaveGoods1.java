package qin.test;

import org.junit.Test;
import qin.mobilegoods.domain.GoodsType;
import qin.mobilegoods.domain.MobileGoods;

import java.util.Map;
import java.util.TreeMap;

public class SaveGoods1 extends MakeTable
{
    @Test
    public void save()
    {
        //region oppo
        GoodsType type_oppo = getGoodsType("oppo");

        saveOppo1(type_oppo);
        saveOppo2(type_oppo);
        saveOppo3(type_oppo);
        //endregion

        //region vivo
        //endregion

        //region 乐视
        //endregion

        //region 华为
        //endregion

        //region 大米
        //endregion

        //region 小米
        //endregion

        //region 微软
        //endregion

        //region 手机
        //endregion

        //region 联想
        //endregion

        //region 苹果
        GoodsType type_apple = getGoodsType("苹果 ");
        saveApple1(type_apple);
        saveApple2(type_apple);
        //endregion

        //region 魅族
        //endregion

        transaction.commit();
    }

    private GoodsType getGoodsType(String goods_typeName)
    {
        return (GoodsType) session
                  .createQuery("from GoodsType where goods_typeName='" + goods_typeName + "'")
                  .list().get(0);
    }

    //region saveApple
    private void saveApple1(GoodsType type)
    {
        MobileGoods apple = new MobileGoods();
        final String appleName = "【eBay精选】Apple/苹果 iPhone 7 Plus 港版 黑色 128G";
        apple.setGoods_name(appleName);
        apple.setGoods_price(9665d);
        //region appleDesc
        final String appleDesc = new StringBuilder()
                  .append("<table cellpadding=\"0\" cellspacing=\"1\" width=\"100%\" border=\"0\" class=\"Ptable\">\n")
                  .append("                        <tbody><tr><th class=\"tdTitle\" colspan=\"2\">主体</th></tr><tr>\n")
                  .append("                              </tr><tr><td class=\"tdTitle\">型号</td><td>7Plus</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">上市年份</td><td>2016年</td></tr>\n")
                  .append("                                                    <tr><th class=\"tdTitle\" colspan=\"2\">基本信息</th></tr><tr>\n")
                  .append("                              </tr><tr><td class=\"tdTitle\">机身颜色</td><td>其他</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">机身材质分类</td><td>其他</td></tr>\n")
                  .append("                                                   <tr><th class=\"tdTitle\" colspan=\"2\">操作系统</th></tr><tr>\n")
                  .append("                              </tr><tr><td class=\"tdTitle\">操作系统</td><td>IOS</td></tr>\n")
                  .append("                                                    <tr><th class=\"tdTitle\" colspan=\"2\">主芯片</th></tr><tr>\n")
                  .append("                              </tr><tr><td class=\"tdTitle\">CPU品牌</td><td>以官网信息为准</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">CPU核数</td><td>其他</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">CPU型号</td><td>其他</td></tr>\n")
                  .append("                                                    <tr><th class=\"tdTitle\" colspan=\"2\">网络支持</th></tr><tr>\n")
                  .append("                              </tr><tr><td class=\"tdTitle\">双卡机类型</td><td>单卡</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">最大支持SIM卡数量</td><td>1个</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">SIM卡类型</td><td>Nano SIM</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">4G网络</td><td>4G：移动（TD-LTE)；4G：联通(TD-LTE)；4G：联通(FDD-LTE)</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">网络频率（2G/3G）</td><td>2G：GSM 850/900/1800/1900</td></tr>\n")
                  .append(
                            "                                                    <tr><th class=\"tdTitle\" colspan=\"2\">存储</th></tr><tr>\n")
                  .append("                              </tr><tr><td class=\"tdTitle\">ROM</td><td>其他</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">RAM</td><td>3GB</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">存储卡</td><td>不支持</td></tr>\n")
                  .append(
                            "                                                    <tr><th class=\"tdTitle\" colspan=\"2\">屏幕</th></tr><tr>\n")
                  .append("                              </tr><tr><td class=\"tdTitle\">主屏幕尺寸（英寸）</td><td>5.5英寸</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">分辨率</td><td>1920*1080(FHD)</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">屏幕材质类型</td><td>其他</td></tr>\n")
                  .append(
                            "                                                    <tr><th class=\"tdTitle\" colspan=\"2\">前置摄像头</th></tr><tr>\n")
                  .append("                              </tr><tr><td class=\"tdTitle\">前置摄像头</td><td>700万像素</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">前摄光圈大小</td><td>其他</td></tr>\n")
                  .append("                                                    <tr><th class=\"tdTitle\" colspan=\"2\">后置摄像头</th></tr><tr>\n")
                  .append(
                            "                              </tr><tr><td class=\"tdTitle\">摄像头数量</td><td>2个</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">后置摄像头</td><td>1200万像素</td></tr>\n")
                  .append("                                                    <tr><th class=\"tdTitle\" colspan=\"2\">电池信息</th></tr><tr>\n")
                  .append("                              </tr><tr><td class=\"tdTitle\">电池是否可拆卸</td><td>否</td></tr>\n")
                  .append(
                            "                                        <tr><td class=\"tdTitle\">充电器</td><td>其他</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">闪充</td><td>支持</td></tr>\n")
                  .append("                                                    <tr><th class=\"tdTitle\" colspan=\"2\">数据接口</th></tr><tr>\n")
                  .append("                              </tr><tr><td class=\"tdTitle\">数据传输接口</td><td>WIFI；WiFi热点；蓝牙</td></tr>\n")
                  .append(
                            "                                        <tr><td class=\"tdTitle\">NFC/NFC模式</td><td>其他</td></tr>\n")
                  .append("                                        <tr><td class=\"tdTitle\">充电接口类型</td><td>Lightning(iphone)</td></tr>\n")
                  .append("                                                    <tr><th class=\"tdTitle\" colspan=\"2\">手机特性</th></tr><tr>\n")
                  .append("                              </tr><tr><td class=\"tdTitle\">指纹识别</td><td>支持</td></tr>\n")
                  .append(
                            "                                        <tr><td class=\"tdTitle\">GPS</td><td>支持</td></tr>\n")
                  .append("                                                    <tr><th class=\"tdTitle\" colspan=\"2\">辅助功能</th></tr><tr>\n")
                  .append("                              </tr><tr><td class=\"tdTitle\">常用功能</td><td>其他</td></tr>\n")
                  .append("                                       </tbody></table>").toString();
        //endregion
        apple.setGoods_description(appleDesc);
        apple.setGoods_number(1099705017);
        apple.setMobile_memory("6GB");
        apple.setMobile_backCamera("700万像素");
        apple.setMobile_battery("2000mAh-2999mAh");
        apple.setMobile_color("黑色");
        apple.setMobile_frontCamera("500万-799万");
        apple.setMobile_news("蓝牙 wifi");
        apple.setMobile_os("苹果ios");
        apple.setMobile_rom("128GB");

        final String rootPath = "http://localhost/javaee8_2017/mobileImages/apple/";
        Map<Integer, String> imagesMap = new TreeMap<>();
        String[] imagesPath = new String[]
                  {
                            "1.jpg", "10.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "55f2e29dN63bde36b.jpg", "55f2e29eN90111630.jpg", "55f2e29eNadef6ddc.jpg", "55f2e29fN27e47bef.jpg", "55f2e29fNb020d30c.jpg", "55f2e29fNdc525061.jpg", "55f2e2a0N53ba7879.jpg", "55f2e2a1N23a66445.jpg", "55f2e2a1N646787fc.jpg", "55f2e2a1Naa83f287.jpg", "55f2e2a2N37395210.jpg", "55f2e2a4Na1b90f46.jpg", "55f2e2a6N66238639.jpg", "57a001e1N60a81ec4.jpg", "5848f458Nbe17b5ff.jpg", "5848f459N4ac37501.jpg", "5848f459N4f11d31b.jpg", "5848f45aN480ef65e.jpg", "5848f45aN91e7cb53.jpg", "5848f45bN3a3c2634.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg"
                  };
        for (int i = 0; i < imagesPath.length; i++)
        {
            imagesMap.put(i, rootPath + imagesPath[i]);
        }
        apple.setImagesMap(imagesMap);

        session.save(apple);
        type.getMobileGoodsSet().add(apple);
    }

    private void saveApple2(GoodsType type)
    {
        MobileGoods apple = new MobileGoods();
        final String appleName = "苹果(Apple) iPhone 7 Plus 4G手机 银色 全网通(256G)";
        apple.setGoods_name(appleName);
        apple.setGoods_price(8299d);
        //region appleDesc
        String appleDesc = new StringBuilder()
                  .append("主体\n")
                  .append("品牌\n")
                  .append("苹果（Apple）\n")
                  .append("型号\n")
                  .append("iPhone7plus\n")
                  .append("上市年份\n")
                  .append("2016年\n")
                  .append("上市月份\n")
                  .append("9月\n")
                  .append("基本信息\n")
                  .append("机身颜色\n")
                  .append("其他\n")
                  .append("机身材质分类\n")
                  .append("其他\n")
                  .append("操作系统\n")
                  .append("操作系统\n")
                  .append("IOS\n")
                  .append("主芯片\n")
                  .append("CPU品牌\n")
                  .append("以官网信息为准\n")
                  .append("CPU核数\n")
                  .append("其他\n")
                  .append("CPU型号\n")
                  .append("其他\n")
                  .append("网络支持\n")
                  .append("双卡机类型\n")
                  .append(
                            "单卡\n")
                  .append("最大支持SIM卡数量\n")
                  .append("1个\n")
                  .append("SIM卡类型\n")
                  .append("Nano SIM\n")
                  .append("4G网络\n")
                  .append("（不含漫游支持网络）\n")
                  .append("3G/2G网络\n")
                  .append("（不含漫游支持网络）\n")
                  .append("网络频率（2G/3G）\n")
                  .append("2G：GSM 850/900/1800/1900\n")
                  .append("存储\n")
                  .append("ROM\n")
                  .append("其他\n")
                  .append("RAM\n")
                  .append("其他\n")
                  .append("存储卡\n")
                  .append("不支持\n")
                  .append("屏幕\n")
                  .append("主屏幕尺寸（英寸）\n")
                  .append("5.5英寸\n")
                  .append("分辨率\n")
                  .append("其他\n")
                  .append("屏幕材质类型\n")
                  .append("其他\n")
                  .append(
                            "前置摄像头\n")
                  .append("前置摄像头\n")
                  .append("700万像素\n")
                  .append("前摄光圈大小\n")
                  .append("其他\n")
                  .append("后置摄像头\n")
                  .append("摄像头数量\n")
                  .append("2个\n")
                  .append("后置摄像头\n")
                  .append("1200万像素\n")
                  .append("电池信息\n")
                  .append("电池是否可拆卸\n")
                  .append("否").toString();
        //endregion
        apple.setGoods_description(appleDesc);
        apple.setGoods_number(1099705018);
        apple.setMobile_memory("6GB");
        apple.setMobile_backCamera("1200万像素");
        apple.setMobile_battery("2000mAh-2999mAh");
        apple.setMobile_color("银色");
        apple.setMobile_frontCamera("700万");
        apple.setMobile_news("蓝牙 wifi");
        apple.setMobile_os("苹果ios");
        apple.setMobile_rom("256GB");

        final String rootPath = "http://localhost/javaee8_2017/mobileImages/apple/";
        Map<Integer, String> imagesMap = new TreeMap<>();
        String[] imagesPath = new String[]
                  {
                            "1.jpg", "10.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "55f2e29dN63bde36b.jpg", "55f2e29eN90111630.jpg", "55f2e29eNadef6ddc.jpg", "55f2e29fN27e47bef.jpg", "55f2e29fNb020d30c.jpg", "55f2e29fNdc525061.jpg", "55f2e2a0N53ba7879.jpg", "55f2e2a1N23a66445.jpg", "55f2e2a1N646787fc.jpg", "55f2e2a1Naa83f287.jpg", "55f2e2a2N37395210.jpg", "55f2e2a4Na1b90f46.jpg", "55f2e2a6N66238639.jpg", "57a001e1N60a81ec4.jpg", "5848f458Nbe17b5ff.jpg", "5848f459N4ac37501.jpg", "5848f459N4f11d31b.jpg", "5848f45aN480ef65e.jpg", "5848f45aN91e7cb53.jpg", "5848f45bN3a3c2634.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg"
                  };
        for (int i = 0; i < imagesPath.length; i++)
        {
            imagesMap.put(i, rootPath + imagesPath[i]);
        }
        apple.setImagesMap(imagesMap);

        session.save(apple);
        type.getMobileGoodsSet().add(apple);
    }
    //endregion

    //region saveOppo
    private void saveOppo1(GoodsType type_oppo)
    {
        MobileGoods oppo = new MobileGoods();
        oppo.setGoods_name("【电信赠费版】OPPO R9s Plus 6GB+64GB内存版 全网通4G手机 双卡双待 玫瑰金");
        //region oppo_des
        final String oppo_desc = new StringBuilder()
                  .append("主体\n")
                  .append("品牌\n")
                  .append("OPPO\n")
                  .append("型号\n")
                  .append("R9s Plus\n")
                  .append("入网型号\n")
                  .append("R9s Plus\n")
                  .append("上市年份\n")
                  .append("2016年\n")
                  .append("上市月份\n")
                  .append("12月\n")
                  .append("基本信息\n")
                  .append("机身颜色\n")
                  .append("玫瑰金\n")
                  .append("机身长度（mm）\n")
                  .append("163.63\n")
                  .append("机身宽度（mm）\n")
                  .append("80.8\n")
                  .append("机身厚度（mm）\n")
                  .append("7.35\n")
                  .append("机身重量（g）\n")
                  .append("约185g\n")
                  .append("运营商标志或内容\n")
                  .append("无\n")
                  .append("机身材质分类\n")
                  .append("金属后盖\n")
                  .append("操作系统\n")
                  .append("操作系统\n")
                  .append("Android\n")
                  .append("操作系统版本\n")
                  .append("基于Android 6.0开发的ColorOS 3.0\n")
                  .append("主芯片\n")
                  .append("CPU品牌\n")
                  .append("骁龙（Snapdragon)\n")
                  .append("CPU频率\n")
                  .append("1.95GHz\n")
                  .append("CPU核数\n")
                  .append("八核\n")
                  .append("CPU型号\n")
                  .append("骁龙653（MSM8976 Pro）\n")
                  .append("网络支持\n")
                  .append("双卡机类型\n")
                  .append("双卡双待单通\n")
                  .append("最大支持SIM卡数量\n")
                  .append("2个\n")
                  .append("SIM卡类型\n")
                  .append("Nano SIM\n")
                  .append("4G网络\n")
                  .append("4G：移动（TD-LTE)；4G：电信(FDD-LTE)；4G：联通(TD-LTE)\n")
                  .append("3G/2G网络\n")
                  .append("3G：电信(CDMA2000)；2G：移动（GSM） 联通(GSM)；2G：电信(CDMA)\n")
                  .append("副SIM卡类型\n")
                  .append("Nano SIM；副SIM卡与存储卡二选一\n")
                  .append("副SIM卡3G/2G网络\n")
                  .append("2G：移动（GSM） 联通(GSM)；2G：电信(CDMA)\n")
                  .append("网络频率（2G/3G）\n")
                  .append("2G：GSM 850/900/1800/1900；2G：CDMA 800；3G：WCDMA：850/900/1700/1900/2100MHz\n")
                  .append("存储\n")
                  .append("ROM\n")
                  .append("64GB\n")
                  .append("RAM\n")
                  .append("6GB\n")
                  .append("存储卡\n")
                  .append(
                            "支持MicroSD（TF）\n")
                  .append("屏幕\n")
                  .append("主屏幕尺寸（英寸）\n")
                  .append("6.0英寸\n")
                  .append("分辨率\n")
                  .append("1920*1080(FHD)\n")
                  .append("屏幕材质类型\n")
                  .append("IPS\n")
                  .append("前置摄像头\n")
                  .append("前置摄像头\n")
                  .append("1600万像素\n")
                  .append("前摄光圈大小\n")
                  .append("其他\n")
                  .append("后置摄像头\n")
                  .append("摄像头数量\n")
                  .append("1个\n")
                  .append("后置摄像头\n")
                  .append("1600万像素\n")
                  .append("电池信息\n")
                  .append("电池容量（mAh）\n")
                  .append("4000mAh（典型值）\n")
                  .append("电池是否可拆卸\n")
                  .append("否\n")
                  .append("充电器\n")
                  .append("5V/4A\n")
                  .append(
                            "数据接口\n")
                  .append("数据传输接口\n")
                  .append("WIFI；OTG接口\n")
                  .append("NFC/NFC模式\n")
                  .append("不支持\n")
                  .append("耳机接口类型\n")
                  .append("3.5mm\n")
                  .append("充电接口类型\n")
                  .append("Micro USB\n")
                  .append("手机特性\n")
                  .append("指纹识别\n")
                  .append("支持\n")
                  .append("GPS\n")
                  .append("支持\n")
                  .append("陀螺仪\n")
                  .append("支持\n")
                  .append("辅助功能\n")
                  .append("常用功能\n")
                  .append("录音；手势识别；便签").toString();
        //endregion
        oppo.setGoods_description(oppo_desc);
        oppo.setGoods_number(3754203);
        oppo.setGoods_price(3499d);
        oppo.setMobile_backCamera("1600万像素");
        oppo.setMobile_battery("4000mAh");
        oppo.setMobile_color("玫瑰金");
        oppo.setMobile_frontCamera("1600万像素");
        oppo.setMobile_memory("64GB");
        oppo.setMobile_news("双卡双待，指纹识别，金属");
        oppo.setMobile_os("android");
        oppo.setMobile_rom("6GB");
        oppo.setMobileGoodsType(type_oppo);

        //images
        Map<Integer, String> imagesMap = new TreeMap<>();
        final String rootPath = "http://localhost/javaee8_2017/mobileImages/oppo/";
        String[] imagesPath = new String[]
                  {
                            rootPath + "1.jpg",
                            rootPath + "2.jpg",
                            rootPath + "3.jpg",
                            rootPath + "4.jpg",
                            rootPath + "579b2896Nc754985d.jpg",
                            rootPath + "583d6cc2Ne61f243d.jpg",
                            rootPath + "583d6cc8Na1944807.jpg",
                            rootPath + "583d6cceN9462b26a.jpg",
                            rootPath + "583d6cdaN9f68fd01.jpg",
                            rootPath + "583d6ce1N3e708778.jpg",
                            rootPath + "583d6ce9N367e0c2e.jpg",
                            rootPath + "583d6cedN139b2d51.jpg",
                            rootPath + "583d6cf3N6373381a.jpg",
                            rootPath + "583d6cfbN38528dfa.jpg",
                            rootPath + "5840041fNe3ad7d0f.jpg",
                            rootPath + "584aab22N0b61191b.jpg",
                            rootPath + "584aab23Nc7bd2067.jpg"
                  };
        for (int i = 0; i < imagesPath.length; i++)
        {
            imagesMap.put(i, imagesPath[i]);
        }
        oppo.setImagesMap(imagesMap);

        type_oppo.getMobileGoodsSet().add(oppo);

        session.save(oppo);
        session.update(type_oppo);
    }

    private void saveOppo2(GoodsType type_oppo)
    {
        MobileGoods oppo = new MobileGoods();
        final String goodsName = "【联通赠费版】OPPO R9s Plus 6GB+64GB内存版 全网通4G手机 双卡双待 玫瑰金";
        oppo.setGoods_name(goodsName);
        //region oppo_des
        final String oppo_desc = new StringBuilder()
                  .append("主体\n")
                  .append("品牌\n")
                  .append("OPPO\n")
                  .append("型号\n")
                  .append("R9s Plus\n")
                  .append("入网型号\n")
                  .append("R9s Plus\n")
                  .append("上市年份\n")
                  .append("2016年\n")
                  .append("上市月份\n")
                  .append("12月\n")
                  .append("基本信息\n")
                  .append("机身颜色\n")
                  .append("玫瑰金\n")
                  .append("机身长度（mm）\n")
                  .append("163.63\n")
                  .append("机身宽度（mm）\n")
                  .append("80.8\n")
                  .append("机身厚度（mm）\n")
                  .append("7.35\n")
                  .append("机身重量（g）\n")
                  .append("约185g\n")
                  .append("运营商标志或内容\n")
                  .append("无\n")
                  .append("机身材质分类\n")
                  .append("金属后盖\n")
                  .append("操作系统\n")
                  .append("操作系统\n")
                  .append("Android\n")
                  .append("操作系统版本\n")
                  .append("基于Android 6.0开发的ColorOS 3.0\n")
                  .append("主芯片\n")
                  .append("CPU品牌\n")
                  .append("骁龙（Snapdragon)\n")
                  .append("CPU频率\n")
                  .append("1.95GHz\n")
                  .append("CPU核数\n")
                  .append("八核\n")
                  .append("CPU型号\n")
                  .append("骁龙653（MSM8976 Pro）\n")
                  .append("网络支持\n")
                  .append("双卡机类型\n")
                  .append("双卡双待单通\n")
                  .append("最大支持SIM卡数量\n")
                  .append("2个\n")
                  .append("SIM卡类型\n")
                  .append("Nano SIM\n")
                  .append("4G网络\n")
                  .append("4G：移动（TD-LTE)；4G：电信(FDD-LTE)；4G：联通(TD-LTE)\n")
                  .append("3G/2G网络\n")
                  .append("3G：电信(CDMA2000)；2G：移动（GSM） 联通(GSM)；2G：电信(CDMA)\n")
                  .append("副SIM卡类型\n")
                  .append("Nano SIM；副SIM卡与存储卡二选一\n")
                  .append("副SIM卡3G/2G网络\n")
                  .append("2G：移动（GSM） 联通(GSM)；2G：电信(CDMA)\n")
                  .append("网络频率（2G/3G）\n")
                  .append("2G：GSM 850/900/1800/1900；2G：CDMA 800；3G：WCDMA：850/900/1700/1900/2100MHz\n")
                  .append("存储\n")
                  .append("ROM\n")
                  .append("64GB\n")
                  .append("RAM\n")
                  .append("6GB\n")
                  .append("存储卡\n")
                  .append(
                            "支持MicroSD（TF）\n")
                  .append("屏幕\n")
                  .append("主屏幕尺寸（英寸）\n")
                  .append("6.0英寸\n")
                  .append("分辨率\n")
                  .append("1920*1080(FHD)\n")
                  .append("屏幕材质类型\n")
                  .append("IPS\n")
                  .append("前置摄像头\n")
                  .append("前置摄像头\n")
                  .append("1600万像素\n")
                  .append("前摄光圈大小\n")
                  .append("其他\n")
                  .append("后置摄像头\n")
                  .append("摄像头数量\n")
                  .append("1个\n")
                  .append("后置摄像头\n")
                  .append("1600万像素\n")
                  .append("电池信息\n")
                  .append("电池容量（mAh）\n")
                  .append("4000mAh（典型值）\n")
                  .append("电池是否可拆卸\n")
                  .append("否\n")
                  .append("充电器\n")
                  .append("5V/4A\n")
                  .append(
                            "数据接口\n")
                  .append("数据传输接口\n")
                  .append("WIFI；OTG接口\n")
                  .append("NFC/NFC模式\n")
                  .append("不支持\n")
                  .append("耳机接口类型\n")
                  .append("3.5mm\n")
                  .append("充电接口类型\n")
                  .append("Micro USB\n")
                  .append("手机特性\n")
                  .append("指纹识别\n")
                  .append("支持\n")
                  .append("GPS\n")
                  .append("支持\n")
                  .append("陀螺仪\n")
                  .append("支持\n")
                  .append("辅助功能\n")
                  .append("常用功能\n")
                  .append("录音；手势识别；便签").toString();
        //endregion
        oppo.setGoods_description(oppo_desc);
        oppo.setGoods_number(3754203);
        oppo.setGoods_price(3499d);
        oppo.setMobile_backCamera("1600万像素");
        oppo.setMobile_battery("4000mAh");
        oppo.setMobile_color("黑色");
        oppo.setMobile_frontCamera("1600万像素");
        oppo.setMobile_memory("64GB");
        oppo.setMobile_news("双卡双待，指纹识别，金属");
        oppo.setMobile_os("android");
        oppo.setMobile_rom("6GB");
        oppo.setMobileGoodsType(type_oppo);

        //images
        Map<Integer, String> imagesMap = new TreeMap<>();
        final String rootPath = "http://localhost/javaee8_2017/mobileImages/oppo/";
        String[] imagesPath = new String[]
                  {
                            rootPath + "1.jpg",
                            rootPath + "2.jpg",
                            rootPath + "3.jpg",
                            rootPath + "4.jpg",
                            rootPath + "579b2896Nc754985d.jpg",
                            rootPath + "583d6cc2Ne61f243d.jpg",
                            rootPath + "583d6cc8Na1944807.jpg",
                            rootPath + "583d6cceN9462b26a.jpg",
                            rootPath + "583d6cdaN9f68fd01.jpg",
                            rootPath + "583d6ce1N3e708778.jpg",
                            rootPath + "583d6ce9N367e0c2e.jpg",
                            rootPath + "583d6cedN139b2d51.jpg",
                            rootPath + "583d6cf3N6373381a.jpg",
                            rootPath + "583d6cfbN38528dfa.jpg",
                            rootPath + "5840041fNe3ad7d0f.jpg",
                            rootPath + "584aab22N0b61191b.jpg",
                            rootPath + "584aab23Nc7bd2067.jpg"
                  };
        for (int i = 0; i < imagesPath.length; i++)
        {
            imagesMap.put(i, imagesPath[i]);
        }
        oppo.setImagesMap(imagesMap);

        type_oppo.getMobileGoodsSet().add(oppo);

        session.save(oppo);
        session.update(type_oppo);
    }

    private void saveOppo3(GoodsType type_oppo)
    {
        MobileGoods oppo = new MobileGoods();
        final String goodsName = "OPPO R9plus 4GB+64GB内存版 玫瑰金 全网通4G手机 双卡双待";
        oppo.setGoods_name(goodsName);
        oppo.setGoods_description("商品名称：OPPOR9 Plus商品编号：2698180商品毛重：0.54kg商品产地：中国大陆热点：快速充电，指纹识别，金属机身，拍照神器运行内存：4GB运营商：联通合约机机身内存：64GB系统：安卓（Android）");
        oppo.setGoods_number(2698180);
        oppo.setGoods_price(2999d);
        oppo.setMobile_backCamera("1600万像素");
        oppo.setMobile_battery("4000mAh");
        oppo.setMobile_color("玫瑰金");
        oppo.setMobile_frontCamera("1600万像素");
        oppo.setMobile_memory("64GB");
        oppo.setMobile_news("双卡双待，指纹识别，金属");
        oppo.setMobile_os("android");
        oppo.setMobile_rom("4GB");
        oppo.setMobileGoodsType(type_oppo);

        //images
        Map<Integer, String> imagesMap = new TreeMap<>();
        final String rootPath = "http://localhost/javaee8_2017/mobileImages/oppo/";
        String[] imagesPath = new String[]
                  {
                            rootPath + "1.jpg",
                            rootPath + "2.jpg",
                            rootPath + "3.jpg",
                            rootPath + "4.jpg",
                            rootPath + "579b2896Nc754985d.jpg",
                            rootPath + "583d6cc2Ne61f243d.jpg",
                            rootPath + "583d6cc8Na1944807.jpg",
                            rootPath + "583d6cceN9462b26a.jpg",
                            rootPath + "583d6cdaN9f68fd01.jpg",
                            rootPath + "583d6ce1N3e708778.jpg",
                            rootPath + "583d6ce9N367e0c2e.jpg",
                            rootPath + "583d6cedN139b2d51.jpg",
                            rootPath + "583d6cf3N6373381a.jpg",
                            rootPath + "583d6cfbN38528dfa.jpg",
                            rootPath + "5840041fNe3ad7d0f.jpg",
                            rootPath + "584aab22N0b61191b.jpg",
                            rootPath + "584aab23Nc7bd2067.jpg"
                  };
        for (int i = 0; i < imagesPath.length; i++)
        {
            imagesMap.put(i, imagesPath[i]);
        }
        oppo.setImagesMap(imagesMap);

        type_oppo.getMobileGoodsSet().add(oppo);

        session.save(oppo);
        session.update(type_oppo);
    }
    //endregion

    //region saveVivo
    //endregion


}