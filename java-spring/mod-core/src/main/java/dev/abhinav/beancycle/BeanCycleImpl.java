package dev.abhinav.beancycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanCycleImpl implements BeanCycle {

    private static final Logger log = LoggerFactory.getLogger(BeanCycleImpl.class);

    @Override
    public String showOnInit() {

        log.info("ON_INIT");

        return "INITIALIZED";
    }

    @Override
    public String showOnDestroy() {
        log.info("ON_DESTROY");
        return "";
    }
}
