package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:31:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee extends CompanyMember {
    private int maxAllowedLeaves;

    Employee() {
        super(new EmployeeStrategy());
    }

    public void setSalary(int salary) {
        this.companyMemberStrategy.setSalary(salary);
        this.salary = salary;
    }

    public void setMonthsSpent(int months) {
        this.companyMemberStrategy.setMonthsSpent(months);
        this.monthsSpent = months;
    }

    public void setMaxAllowedLeaves(int leaves) {
        this.companyMemberStrategy.atLeast(leaves, 1);
        this.maxAllowedLeaves = leaves;
    }

    public void setManagerName(String name) {
        this.companyMemberStrategy.setManagerName(name);
        this.mgrName = name;
    }
}

