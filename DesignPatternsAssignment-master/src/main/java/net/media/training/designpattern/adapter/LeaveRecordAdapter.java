package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class LeaveRecordAdapter implements LeaveRecord {
    private ThirdPartyLeaveRecord thirdPartyLeaveRecord;
    public LeaveRecordAdapter() {
        this.thirdPartyLeaveRecord = new ThirdPartyLeaveRecord();
    }

    @Override
    public String getMostAbsentEmployee() {
        Employee emp = this.thirdPartyLeaveRecord.getMostAbsentEmployee();
        return emp.getName();
    }

    @Override
    public int getEmployeeAbsences(String employeeName) {
        String name[] = employeeName.split(" ");
        String last = name[name.length-1];
        String rest = "";
        for(int i = 0; i < name.length-1; i++) {
            rest += " " + name[i];
        }
        Employee emp = new Employee(last + "," + rest);
        return this.thirdPartyLeaveRecord.getEmployeeAbsences(emp);
    }
}
