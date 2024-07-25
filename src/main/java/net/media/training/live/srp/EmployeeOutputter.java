package net.media.training.live.srp;

public class EmployeeOutputter {
    public String toHtml(Employee employee) {
        String outputString = "<div>";
        outputString += "<h1>Employee Info</h1>";
        outputString += "<div id='emp" + employee.getEmpId() + "'>";
        outputString += "<span>" + employee.getName() + "</span>";
        outputString += "<div class='left'>";
        outputString += "<span>Leave Left :</span>";
        outputString += "<span>Annual Salary:</span>";
        outputString += "<span>Manager:</span>";
        outputString += "<span>Reimbursable Leave:</span>";
        outputString += "</div>";
        outputString += "<div class='right'><span>" + employee.getAvailableLeaves() + "</span>";
        outputString += "<span>" + employee.getAnnualSalary() + "</span>";
        outputString += "<span>" + employee.getManager() + "</span>";
        outputString += "<span>" + employee.getTotalLeavesLeftPreviously() + "</span>";
        outputString += "</div> </div>";

        return outputString;
    }
}
