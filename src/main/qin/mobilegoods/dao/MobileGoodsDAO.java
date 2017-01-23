package qin.mobilegoods.dao;

import org.hibernate.Session;
import qin.javaee8.dao.JavaEE8DAOSupport;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.mobilegoods.domain.MobileGoods;

/**
 * 手机商品数据访问层
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
public interface MobileGoodsDAO extends JavaEE8DAOSupport<MobileGoods, Long>
{
    //region 获取我的Session

    /**
     * 获取我的Session
     *
     * @return
     */
    Session getSession();
    //endregion

    //region 保存

    void saveMobileInfo(MobileGoods entity, String goodsType) throws JavaEE8Exception;

    //endregion
}