package dev.abhinav.autoconfig;


import dev.abhinav.autoconfig.beans.Game;
import dev.abhinav.autoconfig.beans.GameImpl;
import dev.abhinav.autoconfig.beans.NumberGenerator;
import dev.abhinav.autoconfig.beans.NumberGeneratorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan(basePackages = "dev.abhinav.autoconfig")
public class AppConfig {


    @Bean
    public NumberGenerator numberGenerator() {
        return new NumberGeneratorImpl();
    }


    @Bean
    public Game game() {
        return new GameImpl();
    }

}
