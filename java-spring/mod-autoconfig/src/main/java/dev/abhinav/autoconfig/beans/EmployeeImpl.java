package dev.abhinav.autoconfig.beans;


import org.springframework.stereotype.Component;

@Component("employeeBean")
public class EmployeeImpl implements Employee {
    private int empID = 0;
    private String empName = "default_name";

    @Override
    public String getEmpDetails() {
        return "Name: " + empName + ", ID: " + empID;
    }
}
