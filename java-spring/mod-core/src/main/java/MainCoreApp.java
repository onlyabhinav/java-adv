import dev.abhinav.autoscancomponents.Employee;
import dev.abhinav.autoscancomponents.EmployeeImpl;
import dev.abhinav.beancycle.BeanCycle;
import dev.abhinav.circulardependency.DemoClassA;
import dev.abhinav.circulardependency.DemoClassB;
import dev.abhinav.game.Game;
import dev.abhinav.game.NumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCoreApp {

    private static final Logger log = LoggerFactory.getLogger(MainCoreApp.class);

    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {

        log.info("Hello from mod-core:Main class");

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        // Get "numberGenerator" from the Spring Context
        NumberGenerator numGen = context.getBean("numberGenerator", NumberGenerator.class);

        log.info(" Random number = {} " ,numGen.next() );

        // Get "game" from the Spring Context
        Game game = context.getBean("game", Game.class);

        // Reset the game.
        game.reset();

        log.info("Game Initialized. ");

        // Circular Dependency

        DemoClassA demoClassA = context.getBean("demoClassA", DemoClassA.class);
        log.info("Circular Depedency [demoClassA] = {}", demoClassA.sayHello());

        DemoClassB demoClassB = context.getBean("demoClassB", DemoClassB.class);
        log.info("Circular Depedency [demoClassB] = {}", demoClassB.sayHello());

        // Bean Lifecycle

        BeanCycle beanCycle = context.getBean("beanCycle", BeanCycle.class);
        log.info("BeanCycle initialized :: {}", beanCycle.showOnInit());

        //Employee scannedComponent = context.getBean(Employee.class);      // this works (thru interface)
        Employee scannedComponent = context.getBean(EmployeeImpl.class);    // this also works

        log.info("Checking Auto Components.. ");
        log.info("[1] => scannedComponent initialized :: {}", scannedComponent.getEmpDetails());

        Employee scannedComponentByName = context.getBean("employeeBean", EmployeeImpl.class); // Employee.class also works
        log.info("[2] => scannedComponentByName initialized :: {}", scannedComponentByName.getEmpDetails());


        log.info("COMPLETING EXECUTION.. ");

        // Close Spring context
        context.close();

    }
}
