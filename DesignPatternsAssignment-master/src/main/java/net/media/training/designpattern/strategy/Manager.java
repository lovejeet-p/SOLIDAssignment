package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:37:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Manager extends CompanyMember {
    private String managementBand;
    Manager() {
        super(new ManagerStrategy());
    }

    public void setSalary(int salary) {
        this.companyMemberStrategy.setSalary(salary);
        this.salary = salary;
    }

    public void setMonthsSpent(int months) {
        this.companyMemberStrategy.setMonthsSpent(salary);
        this.monthsSpent = months;
    }

    public void setManagementBand(String managementBand) {
        this.companyMemberStrategy.notEmpty(managementBand);
        this.managementBand = managementBand;
    }
}
