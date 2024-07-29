package net.media.training.designpattern.strategy;

public interface CompanyMemberStrategy extends BaseStrategy {

    void setSalary(int salary);

    void setManagerName(String name);

    void setMonthsSpent(int months);
}
