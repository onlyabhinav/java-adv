package dev.abhinav.appevents;


import org.springframework.context.annotation.Configuration;

@Configuration
public class ModuleConfig {

    private int maxNumber = 50;

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
}
