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
@Table(name = "PRODUCT_TYPES", schema = "C##ORACLE12", catalog = "")
public class ProductTypesEntity
{
    private long productTypeId;
    private String name;

    @Id
    @Column(name = "PRODUCT_TYPE_ID", nullable = false, precision = 0)
    public long getProductTypeId()
    {
        return productTypeId;
    }

    public void setProductTypeId(long productTypeId)
    {
        this.productTypeId = productTypeId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 10)
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductTypesEntity that = (ProductTypesEntity) o;
        return productTypeId == that.productTypeId &&
                  Objects.equals(name, that.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(productTypeId, name);
    }
}