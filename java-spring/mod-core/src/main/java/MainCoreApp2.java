import dev.abhinav.autoscancomponents.Employee;
import dev.abhinav.autoscancomponents.EmployeeImpl;
import dev.abhinav.beancycle.BeanCycle;
import dev.abhinav.circulardependency.DemoClassA;
import dev.abhinav.circulardependency.DemoClassB;
import dev.abhinav.game.Game;
import dev.abhinav.game.NumberGenerator;
import dev.abhinav.game.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCoreApp2 {

    private static final Logger log = LoggerFactory.getLogger(MainCoreApp2.class);

    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {

        log.info("Hello from mod-core:Main class");

        // ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        // Get "numberGenerator" from the Spring Context
        NumberGenerator numGen = context.getBean("numberGenerator", NumberGenerator.class);

        log.info(" Random number = {} ", numGen.next());

        // Get "game" from the Spring Context
        Game game = context.getBean("game", Game.class);

        // Reset the game.
        game.reset();

        log.info("Game Initialized. ");

        log.info("Game Number :: {}", game.getNumber());
        log.info("COMPLETING EXECUTION.. ");

        // Close Spring context
        context.close();

    }
}
