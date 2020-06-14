package net.deeptweetbot.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Application {

    private static final Logger logger
            = LoggerFactory.getLogger(Application.class);

    public static void main(String... args) {
        logger.info("Hello from Graal!");
    }

}
