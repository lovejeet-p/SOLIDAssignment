package net.media.training.designpattern.strategy;

public class SeniorEmployeeStrategy extends EmployeeStrategy {
    public void setSalary(int salary) {
        super.setSalary(salary);
        atLeast(salary, 200);
    }

    public void setMonthsSpent(int months) {
        super.setMonthsSpent(months);
        atLeast(months, 60);
    }

}
