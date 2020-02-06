package dev.abhinav.project;

import dev.abhinav.autoscancomponents.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebProject {

    private static final Logger log = LoggerFactory.getLogger(WebProject.class);

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void getProjectEmployee(){

        log.info("[PROJECT] Employee Details: {}",this.employee.getEmpDetails() );

    }
}
