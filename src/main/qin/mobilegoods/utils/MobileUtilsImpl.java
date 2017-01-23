package qin.mobilegoods.utils;

import qin.mobilegoods.controller.HTMLMobileGoods;
import qin.mobilegoods.domain.MobileGoods;

import java.util.HashMap;
import java.util.Map;

/**
 * 实现类
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
public class MobileUtilsImpl implements MobileUtils
{
    private static final long serialVersionUID = 3532473646484017317L;

    //region 构造函数
    public MobileUtilsImpl()
    {

    }
    //endregion

    /*
    <%--
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
--%>
     */
    //region 检查手机商品是否符合规范

    /**
     * 检查手机商品是否符合规范
     */
    protected Map<String, MobileGoods> checkGoods(HTMLMobileGoods goods)
    {
        StringBuilder expBuilder = new StringBuilder();
        MobileGoods mobileGoods = new MobileGoods();

        //region 手机编号只能是数字
        String MOBILE_GOODSNUMBER = goods.getMOBILE_GOODSNUMBER().trim();

        if (MOBILE_GOODSNUMBER.matches("[0-9]*"))
        {
            mobileGoods.setGoods_number(Integer.valueOf(MOBILE_GOODSNUMBER));
        }
        else
        {
            expBuilder.append("手机编号只能是数字!").append(STR_BR);
        }
        //endregion

        //region 判断手机名称
        //1.不能全部为数字
        String MOBILE_GOODSNAME = goods.getMOBILE_GOODSNAME().trim();
        if (MOBILE_GOODSNAME.matches("[0-9]*")) expBuilder.append("商品名称不能全部为数字!").append(STR_BR);
        //2.不能超过50个字符
        if (MOBILE_GOODSNAME.length() > 50)
        {
            expBuilder.append("商品名称不能超过50个字符!").append(STR_BR);
        }
        else
        {
            mobileGoods.setGoods_name(MOBILE_GOODSNAME);
        }
        //endregion

        //region 手机价格
        String MOBILE_GOODSPRICE = goods.getMOBILE_GOODSPRICE().trim();

        //1.价格不能为空, 全部为数字如果包含.也做判断
        if (MOBILE_GOODSPRICE.length() == 0)
        {
            expBuilder.append("手机价格不能为空!").append(STR_BR);
        }
        else
        {
            if (MOBILE_GOODSPRICE.contains("."))
            {
                int headIndex = MOBILE_GOODSPRICE.indexOf('.');
                //2.从头开始截取并且判断是否全部是数字
                String headStr = MOBILE_GOODSPRICE.substring(0, headIndex);
                //检查.后面是否全部是数字
                //从.后面开始截取, 由于index指向的是.的位置所以.后的位置是index + 1
                String endStr = MOBILE_GOODSPRICE.substring(headIndex + 1, MOBILE_GOODSPRICE.length());

                //3.简便判断(判断.前面和.后面是否都是数字)
                if (headStr.matches("[0-9]*") && endStr.matches("[0-9]*"))
                {
                    //4.设置价格
                    mobileGoods.setGoods_price(Double.parseDouble(MOBILE_GOODSPRICE));
                }
                else
                {
                    //肯定有不是数字的字符
                    expBuilder.append("商品价格必须全部是数字然后再加.").append(STR_BR);
                }
            }
            else
            {
                //5.判断是否全部是数字
                if (!MOBILE_GOODSPRICE.matches("[0-9]*"))
                {
                    expBuilder.append("商品价格必须全部是数字然后再加.").append(STR_BR);
                }
                else
                {
                    mobileGoods.setGoods_price(Double.parseDouble(MOBILE_GOODSPRICE));
                }
            }
        }
        //endregion

        //region 手机内存
        String MOBILE_MEMORY_ = goods.getMOBILE_MEMORY_().trim();
        //内存必须包含GB并且不能超过20个字符
        if (!MOBILE_MEMORY_.contains("GB")) expBuilder.append("手机内存必须包含GB!").append(STR_BR);
        if (MOBILE_MEMORY_.length() > 20)
        {
            expBuilder.append("手机内存不能大于20个字符!").append(STR_BR);
        }
        else
        {
            mobileGoods.setMobile_memory(MOBILE_MEMORY_);
        }
        //endregion

        //region 热点
        //热点不能超过3000个字符
        String MOBILE_NEWS_ = goods.getMOBILE_NEWS_().trim();
        if (MOBILE_NEWS_.length() > 3000)
        {
            expBuilder.append("手机热点不能超过3000个字符!").append(STR_BR);
        }
        else
        {
            mobileGoods.setMobile_news(MOBILE_NEWS_);
        }
        //endregion

        //region 电池
        String MOBILE_BATTERY_ = goods.getMOBILE_BATTERY_().trim();

        //不能超过50个字符
        if (MOBILE_BATTERY_.length() > 50)
        {
            expBuilder.append("手机电池不能超过50个字符!").append(STR_BR);
        }
        else
        {
            mobileGoods.setMobile_battery(MOBILE_BATTERY_);
        }
        //endregion

        //region 机身内存
        String MOBILE_ROM_ = goods.getMOBILE_ROM_().trim();
        if (MOBILE_ROM_.length() > 40)
        {
            expBuilder.append("机身内存不能超过40个字符!").append(STR_BR);
        }
        else
        {
            mobileGoods.setMobile_rom(MOBILE_ROM_);
        }
        //endregion

        //region 机身颜色
        String MOBILE_COLOR_ = goods.getMOBILE_COLOR_().trim();

        if (MOBILE_COLOR_.length() > 50)
        {
            expBuilder.append("机身颜色不能超过50个字符!").append(STR_BR);
        }
        else
        {
            mobileGoods.setMobile_color(MOBILE_COLOR_);
        }
        //endregion

        //描述
        mobileGoods.setGoods_description(goods.getMOBILE_GOODSDESCRIPTION().trim());
        //系统
        mobileGoods.setMobile_os(goods.getMOBILE_OS_().trim());
        //前置摄像头
        mobileGoods.setMobile_frontCamera(goods.getMOBILE_FRONTCAMERA_().trim());
        //后置摄像头
        mobileGoods.setMobile_backCamera(goods.getMOBILE_BACKCAMERA_().trim());

        Map<String, MobileGoods> resultMap = new HashMap<>();
        if (expBuilder.length() == 0)
        {
            resultMap.put(STR_SUCCESS, mobileGoods);
        }
        else
        {
            resultMap.put(expBuilder.toString(), mobileGoods);
        }

        return resultMap;
    }
    //endregion
}