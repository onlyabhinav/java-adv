package dev.abhinav.circulardependency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoClassBImpl implements DemoClassB {
    private static final Logger log = LoggerFactory.getLogger(DemoClassBImpl.class);

    private DemoClassA demoClassA;

    // == constructor ==
    DemoClassBImpl(){}

    DemoClassBImpl(DemoClassA demoClassA)
    {
        this.demoClassA = demoClassA;
    }


    // setter
    public void setDemoClassA(DemoClassA demoClassA){
        this.demoClassA = demoClassA;
    }

    @Override
    public String sayHello() {

        log.info("Hello from Class {}", this.getClass().getCanonicalName());

        return "Hello from B";

    }
}
