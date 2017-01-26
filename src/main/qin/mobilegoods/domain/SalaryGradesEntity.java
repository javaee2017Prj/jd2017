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
@Table(name = "SALARY_GRADES", schema = "C##ORACLE12", catalog = "")
public class SalaryGradesEntity
{
    private long salaryGradeId;
    private Long lowSalary;
    private Long highSalary;

    @Id
    @Column(name = "SALARY_GRADE_ID", nullable = false, precision = 0)
    public long getSalaryGradeId()
    {
        return salaryGradeId;
    }

    public void setSalaryGradeId(long salaryGradeId)
    {
        this.salaryGradeId = salaryGradeId;
    }

    @Basic
    @Column(name = "LOW_SALARY", nullable = true, precision = 0)
    public Long getLowSalary()
    {
        return lowSalary;
    }

    public void setLowSalary(Long lowSalary)
    {
        this.lowSalary = lowSalary;
    }

    @Basic
    @Column(name = "HIGH_SALARY", nullable = true, precision = 0)
    public Long getHighSalary()
    {
        return highSalary;
    }

    public void setHighSalary(Long highSalary)
    {
        this.highSalary = highSalary;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalaryGradesEntity that = (SalaryGradesEntity) o;
        return salaryGradeId == that.salaryGradeId &&
                  Objects.equals(lowSalary, that.lowSalary) &&
                  Objects.equals(highSalary, that.highSalary);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(salaryGradeId, lowSalary, highSalary);
    }
}