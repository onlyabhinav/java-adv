package dev.abhinav.appevents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

@Component
public class AppEventsUsingAnnotationsDemo {

    private static final Logger log = LoggerFactory.getLogger(AppEventsUsingAnnotationsDemo.class);


    //
    @EventListener(classes = {ContextStoppedEvent.class, ContextStartedEvent.class, ContextClosedEvent.class, ContextRefreshedEvent.class})
    public void allEvents(ApplicationContextEvent event) {
        log.info("[ALL_IN_ONE_EVENTS] Context Initialized :: {}", event.toString());
    }

    @EventListener
    public void start(ContextRefreshedEvent contextRefreshedEvent) {

        log.info("[EVENT_USING_ANNOTATION] Context Initialized :: {contextRefreshedEvent}");
    }

    @EventListener
    public void close(ContextClosedEvent contextClosedEvent) {

        log.info("[EVENT_USING_ANNOTATION] Context Initialized :: {contextClosedEvent}");
    }

    @EventListener
    public void start(ContextStartedEvent contextStartedEvent) {

        log.info("[EVENT_USING_ANNOTATION] Context Initialized :: {contextStartedEvent}");
    }

    @EventListener
    public void stop(ContextStoppedEvent contextStoppedEvent) {

        log.info("[EVENT_USING_ANNOTATION] Context Initialized :: {contextStoppedEvent}");
    }
}
