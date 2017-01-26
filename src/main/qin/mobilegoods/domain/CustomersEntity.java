package qin.mobilegoods.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Objects;

/**
 * Created by Administrator on 2017/1/24 1-024-24.<br/>
 */
@Entity
@Table(name = "CUSTOMERS", schema = "C##ORACLE12", catalog = "")
public class CustomersEntity
{
    private long customerId;
    private String firstName;
    private String lastName;
    private Time dob;
    private String phone;

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
    @Column(name = "FIRST_NAME", nullable = false, length = 10)
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = false, length = 10)
    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "DOB", nullable = true)
    public Time getDob()
    {
        return dob;
    }

    public void setDob(Time dob)
    {
        this.dob = dob;
    }

    @Basic
    @Column(name = "PHONE", nullable = true, length = 12)
    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomersEntity that = (CustomersEntity) o;
        return customerId == that.customerId &&
                  Objects.equals(firstName, that.firstName) &&
                  Objects.equals(lastName, that.lastName) &&
                  Objects.equals(dob, that.dob) &&
                  Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(customerId, firstName, lastName, dob, phone);
    }
}