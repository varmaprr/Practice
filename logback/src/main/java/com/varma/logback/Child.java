package com.varma.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.Map;

/**
 * Created by varma on 7/26/2017.
 */
public class Child implements Runnable {
    private Logger logger = LoggerFactory.getLogger(Child.class);

    // contextMap is set when new Child() is called
    private Map<String, String> contextMap = MDC.getCopyOfContextMap();

    public void run() {
        MDC.setContextMap(contextMap);  // set contextMap when thread start
        logger.info("Running in the child thread");
    }
}
