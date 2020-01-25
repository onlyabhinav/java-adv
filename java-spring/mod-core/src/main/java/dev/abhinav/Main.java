package dev.abhinav;

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

        NumberGenerator numGen = context.getBean("numberGenerator", NumberGenerator.class);

        log.info(" Random number = {} " ,numGen.next() );

        context.close();

    }
}
