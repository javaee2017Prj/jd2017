package qin.test;

import org.junit.Test;
import qin.mobilegoods.domain.GoodsType;
import qin.mobilegoods.domain.MobileGoods;

import java.util.Iterator;
import java.util.List;

public class SaveGoodsType extends MakeTable
{
    //region 1
    @Test
    public void deleteGoods()
    {
        List<MobileGoods> mobileGoodsList = session
                  .createQuery("from MobileGoods where goods_name='sadf'")
                  .list();

        for (Iterator<MobileGoods> it = mobileGoodsList.iterator(); it.hasNext(); )
        {
            MobileGoods m = it.next();
            session.delete(m);
        }

        transaction.commit();
    }

    @Test
    public void delete1()
    {
        MobileGoods m = (MobileGoods) session.get(MobileGoods.class, new Long(105));
        session.delete(m);
        transaction.commit();
    }

    @Test
    public void save1()
    {
        /*
        mobile_os='sdafsdaf', mobile_memory='254GB', mobile_frontCamera='sadf', mobile_news='sadf',
        mobile_backCamera='sdaf', mobile_battery='sdaf', mobile_rom='sadf', mobile_color='adsf'
         */
        MobileGoods m = new MobileGoods();
        m.setMobile_os("sdafsdaf");
        m.setMobile_memory("254gb");
        m.setMobile_frontCamera("sadf");
        m.setMobile_news("dsfsadf");
        m.setMobile_backCamera("dsafsadf");
        m.setMobile_battery("dsfasadf");
        m.setMobile_rom("dsafasdf");
        m.setMobile_color("dsafsadfs");
        m.setGoods_name("dfasdf");
        m.setGoods_price(234d);
        m.setGoods_description("dfasdfasdf");
        m.setGoods_number(2353425);

        session.save(m);
        transaction.commit();
    }

    void noUser()
    {

    }

    @Test
    public void saveType()
    {
        GoodsType parentMobile = new GoodsType("手机");

        GoodsType type0 = new GoodsType("联想");
        parentMobile.getChildrenSet().add(type0);
        type0.setParentGoodsType(parentMobile);
        GoodsType type1 = new GoodsType("华为");
        parentMobile.getChildrenSet().add(type1);
        type1.setParentGoodsType(parentMobile);
        GoodsType type2 = new GoodsType("oppo");
        parentMobile.getChildrenSet().add(type2);
        type2.setParentGoodsType(parentMobile);
        GoodsType type3 = new GoodsType("小米");
        parentMobile.getChildrenSet().add(type3);
        type3.setParentGoodsType(parentMobile);
        GoodsType type4 = new GoodsType("大米");
        parentMobile.getChildrenSet().add(type4);
        type4.setParentGoodsType(parentMobile);
        GoodsType type5 = new GoodsType("苹果");
        parentMobile.getChildrenSet().add(type5);
        type5.setParentGoodsType(parentMobile);
        GoodsType type6 = new GoodsType("乐视");
        parentMobile.getChildrenSet().add(type6);
        type6.setParentGoodsType(parentMobile);
        GoodsType type7 = new GoodsType("vivo");
        parentMobile.getChildrenSet().add(type7);
        type7.setParentGoodsType(parentMobile);
        GoodsType type8 = new GoodsType("魅族");
        parentMobile.getChildrenSet().add(type8);
        type8.setParentGoodsType(parentMobile);
        GoodsType type9 = new GoodsType("微软");
        parentMobile.getChildrenSet().add(type9);
        type9.setParentGoodsType(parentMobile);
        session.save(type0);
        session.save(type1);
        session.save(type2);
        session.save(type3);
        session.save(type4);
        session.save(type5);
        session.save(type6);
        session.save(type7);
        session.save(type8);
        session.save(type9);

        session.save(parentMobile);

        transaction.commit();
    }

    @Test
    public void printTest()
    {
        printCode("联想", "华为", "oppo", "小米", "大米", "苹果", "乐视", "vivo", "魅族", "微软");
    }

    private void printCode(String... goodsTypeName)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < goodsTypeName.length; i++)
        {
            System.out.println(new StringBuilder().append("GoodsType type").append(i).append(" = new GoodsType(\"").append(goodsTypeName[i]).append("\");").toString());
            System.out.println(new StringBuilder().append("parentMobile.getChildrenSet().add(type").append(i).append(");").toString());
            System.out.println(new StringBuilder().append("type").append(i).append(".setParentGoodsType(parentMobile);").toString());
            sb.append("session.save(type").append(i).append(");");
        }

        System.out.println(sb.toString());
    }
    //endregion

    @Test
    public void deleteGoods1()
    {
        List<MobileGoods> mobileGoodsList = session
                  .createQuery("from MobileGoods where goods_name='asdfsdaf'")
                  .list();

        session.delete(mobileGoodsList.get(0));
        session.delete(mobileGoodsList.get(1));

        transaction.commit();
    }
}