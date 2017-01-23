package qin.mobilegoods.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import qin.mobilegoods.dao.MobileGoodsTypeDAO;
import qin.mobilegoods.domain.GoodsType;
import qin.mobilegoods.utils.MobileUtils;

import javax.annotation.Resource;
import java.util.List;

@Repository(value = "MobileGoodsTypeDAOImpl8")
public class MobileGoodsTypeDAOImpl
          implements MobileGoodsTypeDAO, MobileUtils
{
    private static final long serialVersionUID = 90250374025199132L;

    //region 构造函数

    @Override
    public Class getLogClass()
    {
        return MobileGoodsTypeDAOImpl.class;
    }

    public MobileGoodsTypeDAOImpl()
    {
        superInfo_logger_normal(">>>>正在初始化手机类型数据访问层实现类<<<<");
    }
    //endregion

    //region 注入Session工厂
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    //endregion

    //region 查询所有类型

    /**
     * 查询所有商品类型
     *
     * @return 所有商品类型集合
     */
    @Override
    public List<GoodsType> findAllType()
    {
        return sessionFactory.openSession()
                  .createQuery("from GoodsType ").list();
    }
    //endregion
}