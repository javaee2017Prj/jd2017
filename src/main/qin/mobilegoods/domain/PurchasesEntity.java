package qin.mobilegoods.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Created by Administrator on 2017/1/24 1-024-24.<br/>
 */
@Entity
@Table(name = "PURCHASES", schema = "C##ORACLE12", catalog = "")
@IdClass(PurchasesEntityPK.class)
public class PurchasesEntity
{
    private long productId;
    private long customerId;
    private long quantity;
    private ProductsEntity productsByProductId;
    private CustomersEntity customersByCustomerId;

    @Id
    @Column(name = "PRODUCT_ID", nullable = false, precision = 0)
    public long getProductId()
    {
        return productId;
    }

    public void setProductId(long productId)
    {
        this.productId = productId;
    }

    @Id
    @Column(name = "CUSTOMER_ID", nullable = false, precision = 0)
    public long getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(long customerId)
    {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "QUANTITY", nullable = false, precision = 0)
    public long getQuantity()
    {
        return quantity;
    }

    public void setQuantity(long quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchasesEntity that = (PurchasesEntity) o;
        return productId == that.productId &&
                  customerId == that.customerId &&
                  quantity == that.quantity;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(productId, customerId, quantity);
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", nullable = false)
    public ProductsEntity getProductsByProductId()
    {
        return productsByProductId;
    }

    public void setProductsByProductId(ProductsEntity productsByProductId)
    {
        this.productsByProductId = productsByProductId;
    }

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID", nullable = false)
    public CustomersEntity getCustomersByCustomerId()
    {
        return customersByCustomerId;
    }

    public void setCustomersByCustomerId(CustomersEntity customersByCustomerId)
    {
        this.customersByCustomerId = customersByCustomerId;
    }
}