package qin.mobilegoods.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.mobilegoods.domain.GoodsType;
import qin.mobilegoods.domain.MobileGoods;
import qin.mobilegoods.service.MobileService;
import qin.mobilegoods.utils.MobileUtilsImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 手机商品控制层
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@Controller
@Scope("prototype")
@RequestMapping(value = "/mobileGoods")
public class MobileGoodsController extends MobileUtilsImpl
{
    private static final long serialVersionUID = 649431685336910309L;

    //region 注入服务层
    private MobileService mobileService;

    public MobileService getMobileService()
    {
        return mobileService;
    }

    @Resource
    public void setMobileService(MobileService mobileService)
    {
        this.mobileService = mobileService;
    }
    //endregion

    //region 显示商品首页

    /**
     * 显示商品首页
     */
    @RequestMapping(value = "/doMainView")
    public ModelAndView doMainView()
    {
        return new ModelAndView("/mobileGoods/doMainView");
    }
    //endregion

    //region 显示商品类型

    @Override
    public Class getLogClass()
    {
        return MobileGoodsController.class;
    }

    @RequestMapping(value = "/showGoodsType")
    public void showGoodsType(HttpServletResponse response)
    {
        //获取商品类型
        List<GoodsType> goodsTypeList = mobileService.getGoodsTypeList();

        StringBuilder ajaxMsg = new StringBuilder();

        for (Iterator<GoodsType> it = goodsTypeList.iterator(); it.hasNext(); )
        {
            GoodsType g = it.next();
        }

        try
        {
            returnJson(ajaxMsg.toString(), response);
        }
        catch (Exception ex)
        {
            superInfo_logger_expection(ex);
        }
    }
    //endregion

    //region 新增商品信息

    /**
     * 新增商品信息
     */
    @RequestMapping(value = "/addMobileGoods")
    public void addMobileGoods(HTMLMobileGoods goods, HttpServletResponse response)
    {
        Map<String, MobileGoods> map = checkGoods(goods);

        try
        {
            String keySet = map.keySet().toString();
            if (keySet.equals("[success]"))
            {
                //如果判断结果为成功则保存实体类
                MobileGoods mobileGoods = map.get(STR_SUCCESS);
                //mobileGoods.setMobileGoodsType(new GoodsType(goods.getMOBILE_TYPE().trim()));
                //region 商品类型
                String goodsTypeName = goods.getMOBILE_TYPE().trim();
                //endregion
                Map<Integer, String> imagesMap = new TreeMap<>();
                //region 判断商品图片是否为空
                String getMobile_ImagesMap1 = goods.getGetMobile_ImagesMap1().trim();
                String getMobile_ImagesMap2 = goods.getGetMobile_ImagesMap2().trim();
                String getMobile_ImagesMap3 = goods.getGetMobile_ImagesMap3().trim();
                String getMobile_ImagesMap4 = goods.getGetMobile_ImagesMap4().trim();
                String getMobile_ImagesMap5 = goods.getGetMobile_ImagesMap5().trim();

                if (getMobile_ImagesMap1.length() > 0) imagesMap.put(0, getMobile_ImagesMap1);
                if (getMobile_ImagesMap2.length() > 0) imagesMap.put(1, getMobile_ImagesMap2);
                if (getMobile_ImagesMap3.length() > 0) imagesMap.put(2, getMobile_ImagesMap3);
                if (getMobile_ImagesMap4.length() > 0) imagesMap.put(3, getMobile_ImagesMap4);
                if (getMobile_ImagesMap5.length() > 0) imagesMap.put(4, getMobile_ImagesMap5);

                //endregion
                mobileGoods.setImagesMap(imagesMap);
                mobileService.save(mobileGoods, goodsTypeName);
            }
            else
            {
                returnJson(keySet, response);
            }
        }
        catch (Exception ex)
        {
            superInfo_logger_expection(ex);
        }

        Object _value = 0;
    }
    //endregion

}
