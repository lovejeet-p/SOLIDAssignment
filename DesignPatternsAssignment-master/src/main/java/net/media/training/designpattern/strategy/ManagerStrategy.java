package net.media.training.designpattern.strategy;

public class ManagerStrategy implements CompanyMemberStrategy {
    public void setSalary(int salary) {
        atLeast(salary, 1);
    }

    public void setManagerName(String name) {
        validateLength(name, 50);
        notEmpty(name);
    }

    public void setMonthsSpent(int months) {

    }
}
