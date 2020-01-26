package dev.abhinav;

import dev.abhinav.beancycle.BeanCycle;
import dev.abhinav.circulardependency.DemoClassA;
import dev.abhinav.circulardependency.DemoClassB;
import dev.abhinav.game.Game;
import dev.abhinav.interfaces.NumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

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
        log.info("Circular Depedency [demoClassA] = {}", demoClassA.sayHello() );

        DemoClassB demoClassB = context.getBean("demoClassB", DemoClassB.class);
        log.info("Circular Depedency [demoClassB] = {}", demoClassB.sayHello() );

        // Bean Lifecycle

        BeanCycle beanCycle = context.getBean("beanCycle", BeanCycle.class);
        log.info("BeanCycle initialized :: {}", beanCycle.showOnInit());


        // Close Spring context
        context.close();

    }
}
