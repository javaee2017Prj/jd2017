package qin.mobilegoods.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Created by Administrator on 2017/1/24 1-024-24.<br/>
 */
@Entity
@Table(name = "PRODUCTS", schema = "C##ORACLE12", catalog = "")
public class ProductsEntity
{
    private long productId;
    private String name;
    private String description;
    private Long price;

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

    @Basic
    @Column(name = "NAME", nullable = false, length = 30)
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 50)
    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Basic
    @Column(name = "PRICE", nullable = true, precision = 2)
    public Long getPrice()
    {
        return price;
    }

    public void setPrice(Long price)
    {
        this.price = price;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsEntity that = (ProductsEntity) o;
        return productId == that.productId &&
                  Objects.equals(name, that.name) &&
                  Objects.equals(description, that.description) &&
                  Objects.equals(price, that.price);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(productId, name, description, price);
    }
}