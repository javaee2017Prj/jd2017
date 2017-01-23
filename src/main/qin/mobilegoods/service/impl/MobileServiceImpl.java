package qin.mobilegoods.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.mobilegoods.dao.MobileGoodsDAO;
import qin.mobilegoods.dao.impl.MobileGoodsTypeDAOImpl;
import qin.mobilegoods.domain.GoodsType;
import qin.mobilegoods.domain.MobileGoods;
import qin.mobilegoods.service.MobileService;
import qin.mobilegoods.utils.MobileUtilsImpl;

import javax.annotation.Resource;
import java.util.List;

/**
 * 手机服务层实现
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@Service
@Transactional
public class MobileServiceImpl extends MobileUtilsImpl implements MobileService
{
    private static final long serialVersionUID = 2778257821004373194L;

    //region 构造函数
    public MobileServiceImpl()
    {
        superInfo_logger_normal("<<<<正在初始化手机商品服务层实现类>>>>");
    }
    //endregion

    //region 为输出功能做准备

    @Override
    public Class getLogClass()
    {
        return MobileServiceImpl.class;
    }

    //endregion

    //region 注入数据访问层
    private MobileGoodsDAO mobileGoodsDAO;

    public MobileGoodsDAO getMobileGoodsDAO()
    {
        return mobileGoodsDAO;
    }

    @Resource
    public void setMobileGoodsDAO(MobileGoodsDAO mobileGoodsDAO)
    {
        this.mobileGoodsDAO = mobileGoodsDAO;
    }

    private MobileGoodsTypeDAOImpl mobileGoodsTypeDAO;

    public MobileGoodsTypeDAOImpl getMobileGoodsTypeDAO()
    {
        return mobileGoodsTypeDAO;
    }

    @Resource
    public void setMobileGoodsTypeDAO(MobileGoodsTypeDAOImpl mobileGoodsTypeDAO)
    {
        this.mobileGoodsTypeDAO = mobileGoodsTypeDAO;
    }
    //endregion

    //region 获取商品类型
    @Override
    public List<GoodsType> getGoodsTypeList()
    {
        return mobileGoodsTypeDAO.findAllType();
    }
    //endregion

    //region 保存手机商品
    @Override
    public void save(MobileGoods mobileGoods, String goodsType) throws JavaEE8Exception
    {
        mobileGoodsDAO.saveMobileInfo(mobileGoods, goodsType);
    }
    //endregion

}
