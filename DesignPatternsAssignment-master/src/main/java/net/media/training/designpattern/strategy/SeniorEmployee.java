package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:35:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeniorEmployee extends CompanyMember {
    private int setMaxBonus;

    SeniorEmployee() {
        super(new SeniorEmployeeStrategy());
    }

    public void setSalary(int salary) {
        this.companyMemberStrategy.setSalary(salary);
        this.salary = salary;
    }

    public void setMonthsSpent(int months) {
        this.companyMemberStrategy.setMonthsSpent(months);
        this.monthsSpent = months;
    }

    public void setMaxBonus(int bonus) {
        this.companyMemberStrategy.atLeast(bonus, 1);
        this.setMaxBonus = bonus;
    }

    public void setManagerName(String name) {
        this.companyMemberStrategy.setManagerName(name);
        this.mgrName = name;
    }
}
