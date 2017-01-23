package qin.mobilegoods.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import qin.javaee8.dao.impl.JavaEE8DAOSupportImpl;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.mobilegoods.dao.MobileGoodsDAO;
import qin.mobilegoods.domain.GoodsType;
import qin.mobilegoods.domain.MobileGoods;
import qin.mobilegoods.utils.MobileUtilsImpl;

import javax.annotation.Resource;

/**
 * 手机商品数据访问层实现类
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@Repository(value = "mobileGoodsDAOImpl8")
@SuppressWarnings("all")
public class MobileGoodsDAOImpl
          extends JavaEE8DAOSupportImpl<MobileGoods, Long>
          implements MobileGoodsDAO
{
    private static final long serialVersionUID = -5422968483652938187L;

    //region 获取配置文件
    @Override
    public String getLog4jLocation()
    {
        MobileUtilsImpl m = new MobileUtilsImpl();
        return m.getLog4jLocation();
    }
    //endregion

    //region 注入Session工厂
    private SessionFactory sessionFactory;

    @Override
    public SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    @Resource
    @Override
    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    //endregion

    //region 获取Session

    /**
     * 获取我的Session
     *
     * @return
     */
    @Override
    public Session getSession()
    {
        return sessionFactory.openSession();
    }
    //endregion

    //region 构造函数
    public MobileGoodsDAOImpl()
    {
        superInfo_logger_normal(">>>>正在初始化手机商品数据访问层实现类<<<<");
    }
    //endregion

    //region 保存
    @Override
    public void saveMobileInfo(MobileGoods entity, String goodsType) throws JavaEE8Exception
    {
        try
        {
            Session session = sessionFactory.openSession();
            superInfo_logger_normal("保存的手机商品信息:" + entity);
            GoodsType mobileGoodsType = (GoodsType) session
                      .createQuery("from GoodsType where goods_typeName='" + goodsType + "'")
                      .list().get(0);
            entity.setMobileGoodsType(mobileGoodsType);
            mobileGoodsType.getMobileGoodsSet().add(entity);
            session.save(entity);
            session.update(mobileGoodsType);
            session.beginTransaction().commit();
        }
        catch (Exception ex)
        {
            superInfo_logger_expection("手机信息保存失败!" + ex);
        }
    }
    //endregion
}