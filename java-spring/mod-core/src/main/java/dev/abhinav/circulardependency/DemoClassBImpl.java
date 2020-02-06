package dev.abhinav.circulardependency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class  DemoClassBImpl implements DemoClassB {
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

    @PostConstruct
    public void initThisClass() {
        log.info("[PostConstruct] THIS IS CALLED ON  [POST CONSTRUCT]");
    }

    @PreDestroy
    public void destroyThisClass() {
        log.info("[destroyThisClass] THIS IS CALLED ON [DESTROY]");
    }


    @Override
    public String sayHello() {

        log.info("Hello from Class {}", this.getClass().getCanonicalName());

        return "Hello from B";

    }
}
