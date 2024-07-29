package net.media.training.designpattern.strategy;

public class EmployeeStrategy implements CompanyMemberStrategy {

    public void setSalary(int salary) {
        atLeast(salary, 1);
        atMost(salary, 1000);
    }

    public void setManagerName(String name) {
        validateLength(name, 50);
        notEmpty(name);
    }

    public void setMonthsSpent(int months) {
        atLeast(months, 0);
    }
}
