package qin.mobilegoods.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Administrator on 2017/1/24 1-024-24.<br/>
 */
public class PurchasesEntityPK implements Serializable
{
    private long productId;
    private long customerId;

    @Column(name = "PRODUCT_ID", nullable = false, precision = 0)
    @Id
    public long getProductId()
    {
        return productId;
    }

    public void setProductId(long productId)
    {
        this.productId = productId;
    }

    @Column(name = "CUSTOMER_ID", nullable = false, precision = 0)
    @Id
    public long getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(long customerId)
    {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchasesEntityPK that = (PurchasesEntityPK) o;
        return productId == that.productId &&
                  customerId == that.customerId;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(productId, customerId);
    }
}