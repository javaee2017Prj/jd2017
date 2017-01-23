package qin.test;

import org.junit.Test;
import qin.mobilegoods.domain.MobileGoods;
import qin.mobilegoods.utils.MobileUtils;

public class DeleteGoods extends MakeTable implements MobileUtils
{
    @Test
    @Override
    public void make()
    {
        MobileGoods mobileGoods = (MobileGoods) session.
                  createQuery("from MobileGoods where id=159")
                  .list().get(0);

        session.delete(mobileGoods);
        transaction.commit();
    }

    @Override
    public String getLog4jLocation()
    {
        return "";
    }

    @Override
    public Class getLogClass()
    {
        return DeleteGoods.class;
    }

    @Test
    public void a() {
        superInfo_logger_normal(">>>>正在初始化商品类型实体类默认构造函数<<<<");
    }
}