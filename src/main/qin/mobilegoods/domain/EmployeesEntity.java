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
@Table(name = "EMPLOYEES", schema = "C##ORACLE12", catalog = "")
public class EmployeesEntity
{
    private long employeeId;
    private Long managerId;
    private String firstName;
    private String lastName;
    private String title;
    private Long salary;

    @Id
    @Column(name = "EMPLOYEE_ID", nullable = false, precision = 0)
    public long getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(long employeeId)
    {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "MANAGER_ID", nullable = true, precision = 0)
    public Long getManagerId()
    {
        return managerId;
    }

    public void setManagerId(Long managerId)
    {
        this.managerId = managerId;
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
    @Column(name = "TITLE", nullable = true, length = 20)
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Basic
    @Column(name = "SALARY", nullable = true, precision = 0)
    public Long getSalary()
    {
        return salary;
    }

    public void setSalary(Long salary)
    {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeesEntity that = (EmployeesEntity) o;
        return employeeId == that.employeeId &&
                  Objects.equals(managerId, that.managerId) &&
                  Objects.equals(firstName, that.firstName) &&
                  Objects.equals(lastName, that.lastName) &&
                  Objects.equals(title, that.title) &&
                  Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(employeeId, managerId, firstName, lastName, title, salary);
    }
}