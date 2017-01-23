package qin.mobilegoods.utils;

import java.io.Serializable;

/**
 * 手机商品超级实体类
 *
 * @param <T>
 * @author qinzhengying
 * @since 1.8 2017
 */
public interface SuperEntity8<T extends Serializable>
          extends MobileUtils, qin.javaee8.core.SuperEntity8<T>
{
}