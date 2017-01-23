package qin.mobilegoods.service;

import qin.javaee8.exceptions.JavaEE8Exception;
import qin.mobilegoods.domain.GoodsType;
import qin.mobilegoods.domain.MobileGoods;

import java.util.List;

/**
 * 手机服务层
 *
 * @author qinzhengying
 * @since 1.8
 */
public interface MobileService
{
    //region 获取商品类型
    List<GoodsType> getGoodsTypeList();
    //endregion

    //region 保存商品信息
    void save(MobileGoods mobileGoods, String goodsType) throws JavaEE8Exception;

    //endregion
}
