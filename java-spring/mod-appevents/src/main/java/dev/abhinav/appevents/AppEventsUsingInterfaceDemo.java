package dev.abhinav.appevents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class AppEventsUsingInterfaceDemo implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger log = LoggerFactory.getLogger(AppEventsUsingInterfaceDemo.class);


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        log.info("[EVENT_USING_INTERFACE] CONTEXT Initialized :: {ContextRefreshedEvent}");
    }
}
