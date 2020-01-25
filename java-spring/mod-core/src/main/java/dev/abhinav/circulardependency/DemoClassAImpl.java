package dev.abhinav.circulardependency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoClassAImpl implements DemoClassA {
    private static final Logger log = LoggerFactory.getLogger(DemoClassAImpl.class);
    private DemoClassB demoClassB;

    // == constructor ==
    DemoClassAImpl(){}

    DemoClassAImpl(DemoClassB demoClassB)
    {
        this.demoClassB = demoClassB;
    }


    // setter
    public void setDemoClassB(DemoClassB demoClassB){
        this.demoClassB = demoClassB;
    }

    @Override
    public String sayHello() {
        log.info("Hello from Class {}", this.getClass().getCanonicalName());

        return "Hello from A";
    }
}
