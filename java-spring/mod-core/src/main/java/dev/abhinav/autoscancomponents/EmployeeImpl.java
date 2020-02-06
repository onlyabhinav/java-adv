package dev.abhinav.autoscancomponents;


import org.springframework.stereotype.Component;

@Component
public class EmployeeImpl implements Employee {
    private int empID = 0;
    private String empName = null;

    @Override
    public String getEmpDetails() {
        return "Name: " + empName + ", ID: " +empID;
    }
}
