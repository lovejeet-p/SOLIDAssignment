package net.media.training.live.srp;


public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;
    private static int YEARS_TO_CONSIDER = 3;
    private double monthlySalary;
    private String name;

    private Address address;
    private int leavesTaken;
    private int totalLeavesAllowed;
    private String manager;
    private int yearsInOrg;
    private int thisYear;
    private int[] leavesLeftPreviously;

    public Employee(int empId, double monthlySalary, String name, Address address, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.address = address;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public static int getTotalLeavesAllowed() {
        return TOTAL_LEAVES_ALLOWED;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return this.address;
    }

    public int getLeavesTaken() {
        return this.leavesTaken;
    }

    public int getTotalLeaveAllowed() {
        return this.totalLeavesAllowed;
    }

    public int getLeaveTaken() {
        return this.leavesTaken;
    }

    public String getManager() {
        if(this.manager != null) {
            return this.manager;
        }
        else {
            return "None";
        }
    }

    public int getYearsInOrg() {
        return this.yearsInOrg;
    }

    public int getThisYear() {
        return this.thisYear;
    }

    public int[] getLeavesLeftPreviously() {
        return this.leavesLeftPreviously;
    }

    public int getAvailableLeaves() {
        return (this.totalLeavesAllowed - this.leavesTaken);
    }

    public long getAnnualSalary() {
        return Math.round(monthlySalary * 12);
    }

    public int getYearsToConsider() {
        if (this.getYearsInOrg() < Employee.YEARS_TO_CONSIDER) {
            return yearsInOrg;
        }
        else {
            return Employee.YEARS_TO_CONSIDER;
        }
    }

    public int getTotalLeavesLeftPreviously() {
        int totalLeavesLeftPreviously = 0;
        for (int i = 0; i < this.getYearsToConsider(); i++) {
            totalLeavesLeftPreviously += leavesLeftPreviously[this.getYearsInOrg()-i-1];
        }
        return totalLeavesLeftPreviously;
    }
}
