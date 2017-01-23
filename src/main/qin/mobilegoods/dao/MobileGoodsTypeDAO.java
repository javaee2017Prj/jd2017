package qin.mobilegoods.dao;

import java.util.List;

/**
 * 手机商品类型数据访问层
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
public interface MobileGoodsTypeDAO
{
    //region 查询所有商品类型

    /**
     * 查询所有商品类型
     *
     * @return 所有商品类型集合
     */
    List findAllType();
    //endregion
}