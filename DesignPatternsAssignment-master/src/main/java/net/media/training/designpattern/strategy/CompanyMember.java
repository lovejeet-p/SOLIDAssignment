package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:14:31 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CompanyMember {
    private String name;
    protected String mgrName;
    protected int salary;
    protected int monthsSpent;

    protected CompanyMemberStrategy companyMemberStrategy;

    public CompanyMember(CompanyMemberStrategy companyMemberStrategy) {
        this.companyMemberStrategy = companyMemberStrategy;
    }


    public void setName(String name) {
        companyMemberStrategy.validateLength(name, 50);
        this.name = name;
    }
}
