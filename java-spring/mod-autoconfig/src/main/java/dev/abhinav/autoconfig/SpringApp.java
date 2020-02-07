package dev.abhinav.autoconfig;

import dev.abhinav.autoconfig.beans.Employee;
import dev.abhinav.autoconfig.beans.EmployeeImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    private static final Logger log = LoggerFactory.getLogger(SpringApp.class);

    //private static final String CONFIG_LOCATION = "beans.xml";  // We will NOT use it for Annotation Based Configuration

    public static void main(String[] args) {


        log.info("Starting AUTO_CONFIG");

        log.info(" ==================== ");

//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);  // this is XML Based Configuration

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        Employee scannedComponent = context.getBean(EmployeeImpl.class);    // this also works

        log.info("Checking Auto Components.. ");
        log.info("[1] => scannedComponent initialized :: {}", scannedComponent.getEmpDetails());

    }
}
