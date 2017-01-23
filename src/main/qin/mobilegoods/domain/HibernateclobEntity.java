package qin.mobilegoods.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2017/1/21 1-021-21.<br/>
 */
@Entity
@Table(name = "HIBERNATECLOB", schema = "C##ZHOUJIELUN", catalog = "")
public class HibernateclobEntity
{
    private Long id;
    private String clob;

    @Basic
    @Column(name = "ID", nullable = true, precision = 0)
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "CLOB_", nullable = true)
    public String getClob()
    {
        return clob;
    }

    public void setClob(String clob)
    {
        this.clob = clob;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HibernateclobEntity that = (HibernateclobEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (clob != null ? !clob.equals(that.clob) : that.clob != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (clob != null ? clob.hashCode() : 0);
        return result;
    }
}