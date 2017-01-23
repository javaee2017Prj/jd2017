package qin.mobilegoods.controller;

/**
 * 接收界面字段
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@SuppressWarnings("all")
public final class HTMLMobileGoods
{
    //region 私有构造函数
    private HTMLMobileGoods()
    {

    }
    //endregion

    //region 商品图片
    private String getMobile_ImagesMap1;

    private String getMobile_ImagesMap2;

    private String getMobile_ImagesMap3;

    private String getMobile_ImagesMap4;

    private String getMobile_ImagesMap5;

    public String getGetMobile_ImagesMap1()
    {
        return getMobile_ImagesMap1;
    }

    public void setGetMobile_ImagesMap1(String getMobile_ImagesMap1)
    {
        this.getMobile_ImagesMap1 = getMobile_ImagesMap1;
    }

    public String getGetMobile_ImagesMap2()
    {
        return getMobile_ImagesMap2;
    }

    public void setGetMobile_ImagesMap2(String getMobile_ImagesMap2)
    {
        this.getMobile_ImagesMap2 = getMobile_ImagesMap2;
    }

    public String getGetMobile_ImagesMap3()
    {
        return getMobile_ImagesMap3;
    }

    public void setGetMobile_ImagesMap3(String getMobile_ImagesMap3)
    {
        this.getMobile_ImagesMap3 = getMobile_ImagesMap3;
    }

    public String getGetMobile_ImagesMap4()
    {
        return getMobile_ImagesMap4;
    }

    public void setGetMobile_ImagesMap4(String getMobile_ImagesMap4)
    {
        this.getMobile_ImagesMap4 = getMobile_ImagesMap4;
    }

    public String getGetMobile_ImagesMap5()
    {
        return getMobile_ImagesMap5;
    }

    public void setGetMobile_ImagesMap5(String getMobile_ImagesMap5)
    {
        this.getMobile_ImagesMap5 = getMobile_ImagesMap5;
    }
    //endregion

    //region toString

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("HTMLMobileGoods{");
        sb.append("MOBILE_TYPE='").append(MOBILE_TYPE).append('\'');
        sb.append(", MOBILE_GOODSNUMBER='").append(MOBILE_GOODSNUMBER).append('\'');
        sb.append(", MOBILE_GOODSNAME='").append(MOBILE_GOODSNAME).append('\'');
        sb.append(", MOBILE_GOODSPRICE='").append(MOBILE_GOODSPRICE).append('\'');
        sb.append(", MOBILE_GOODSDESCRIPTIO='").append(MOBILE_GOODSDESCRIPTION).append('\'');
        sb.append(", MOBILE_OS_='").append(MOBILE_OS_).append('\'');
        sb.append(", MOBILE_MEMORY_='").append(MOBILE_MEMORY_).append('\'');
        sb.append(", MOBILE_FRONTCAMERA_='").append(MOBILE_FRONTCAMERA_).append('\'');
        sb.append(", MOBILE_NEWS_='").append(MOBILE_NEWS_).append('\'');
        sb.append(", MOBILE_BACKCAMERA_='").append(MOBILE_BACKCAMERA_).append('\'');
        sb.append(", MOBILE_BATTERY_='").append(MOBILE_BATTERY_).append('\'');
        sb.append(", MOBILE_ROM_='").append(MOBILE_ROM_).append('\'');
        sb.append(", MOBILE_COLOR_='").append(MOBILE_COLOR_).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //endregion

    //region 商品类型
    /**
     * 商品类型
     */
    private String MOBILE_TYPE;

    public String getMOBILE_TYPE()
    {
        return MOBILE_TYPE;
    }

    public void setMOBILE_TYPE(String MOBILE_TYPE)
    {
        this.MOBILE_TYPE = MOBILE_TYPE;
    }
    //endregion

    //region 商品编号
    /**
     * 商品编号
     */
    private String MOBILE_GOODSNUMBER;

    public String getMOBILE_GOODSNUMBER()
    {
        return MOBILE_GOODSNUMBER;
    }

    public void setMOBILE_GOODSNUMBER(String MOBILE_GOODSNUMBER)
    {
        this.MOBILE_GOODSNUMBER = MOBILE_GOODSNUMBER;
    }
    //endregion

    //region 手机名称
    /**
     * 手机名称
     */
    private String MOBILE_GOODSNAME;

    public String getMOBILE_GOODSNAME()
    {
        return MOBILE_GOODSNAME;
    }

    public void setMOBILE_GOODSNAME(String MOBILE_GOODSNAME)
    {
        this.MOBILE_GOODSNAME = MOBILE_GOODSNAME;
    }
    //endregion

    //region 手机价格
    /**
     * 手机价格
     */
    private String MOBILE_GOODSPRICE;

    public String getMOBILE_GOODSPRICE()
    {
        return MOBILE_GOODSPRICE;
    }

    public void setMOBILE_GOODSPRICE(String MOBILE_GOODSPRICE)
    {
        this.MOBILE_GOODSPRICE = MOBILE_GOODSPRICE;
    }
    //endregion

    //region 手机描述
    /**
     * 手机描述
     */
    private String MOBILE_GOODSDESCRIPTION;

    public String getMOBILE_GOODSDESCRIPTION()
    {
        return MOBILE_GOODSDESCRIPTION;
    }

    public void setMOBILE_GOODSDESCRIPTION(String MOBILE_GOODSDESCRIPTION)
    {
        this.MOBILE_GOODSDESCRIPTION = MOBILE_GOODSDESCRIPTION;
    }
    //endregion

    //region 手机系统
    /**
     * 手机系统
     */
    private String MOBILE_OS_;

    public String getMOBILE_OS_()
    {
        return MOBILE_OS_;
    }

    public void setMOBILE_OS_(String MOBILE_OS_)
    {
        this.MOBILE_OS_ = MOBILE_OS_;
    }
    //endregion

    //region 手机内存
    /**
     * 手机内存
     */
    private String MOBILE_MEMORY_;

    public String getMOBILE_MEMORY_()
    {
        return MOBILE_MEMORY_;
    }

    public void setMOBILE_MEMORY_(String MOBILE_MEMORY_)
    {
        this.MOBILE_MEMORY_ = MOBILE_MEMORY_;
    }
    //endregion

    //region 前置摄像头
    /**
     * 前置摄像头
     */
    private String MOBILE_FRONTCAMERA_;

    public String getMOBILE_FRONTCAMERA_()
    {
        return MOBILE_FRONTCAMERA_;
    }

    public void setMOBILE_FRONTCAMERA_(String MOBILE_FRONTCAMERA_)
    {
        this.MOBILE_FRONTCAMERA_ = MOBILE_FRONTCAMERA_;
    }
    //endregion

    //region 热点
    /**
     * 热点
     */
    private String MOBILE_NEWS_;

    public String getMOBILE_NEWS_()
    {
        return MOBILE_NEWS_;
    }

    public void setMOBILE_NEWS_(String MOBILE_NEWS_)
    {
        this.MOBILE_NEWS_ = MOBILE_NEWS_;
    }
    //endregion

    //region 后置摄像头
    /**
     * 后置摄像头
     */
    private String MOBILE_BACKCAMERA_;

    public String getMOBILE_BACKCAMERA_()
    {
        return MOBILE_BACKCAMERA_;
    }

    public void setMOBILE_BACKCAMERA_(String MOBILE_BACKCAMERA_)
    {
        this.MOBILE_BACKCAMERA_ = MOBILE_BACKCAMERA_;
    }
    //endregion

    //region 电池
    /**
     * 电池
     */
    private String MOBILE_BATTERY_;

    public String getMOBILE_BATTERY_()
    {
        return MOBILE_BATTERY_;
    }

    public void setMOBILE_BATTERY_(String MOBILE_BATTERY_)
    {
        this.MOBILE_BATTERY_ = MOBILE_BATTERY_;
    }
    //endregion

    //region 机身内存
    /**
     * 机身内存
     */
    private String MOBILE_ROM_;

    public String getMOBILE_ROM_()
    {
        return MOBILE_ROM_;
    }

    public void setMOBILE_ROM_(String MOBILE_ROM_)
    {
        this.MOBILE_ROM_ = MOBILE_ROM_;
    }
    //endregion

    //region 机身颜色
    /**
     * 机身颜色
     */
    private String MOBILE_COLOR_;

    public String getMOBILE_COLOR_()
    {
        return MOBILE_COLOR_;
    }

    public void setMOBILE_COLOR_(String MOBILE_COLOR_)
    {
        this.MOBILE_COLOR_ = MOBILE_COLOR_;
    }
    //endregion
}