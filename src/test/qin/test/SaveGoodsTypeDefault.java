package qin.test;

import org.junit.Test;
import qin.mobilegoods.domain.GoodsType;

public class SaveGoodsTypeDefault extends MakeTable
{
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
}