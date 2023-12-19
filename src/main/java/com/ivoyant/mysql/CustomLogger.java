package com.ivoyant.mysql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomLogger {
    private static final Logger logger = LoggerFactory.getLogger(CustomLogger.class);

    public static void error(String message) {
        logger.error(message);

    }

    public static void warn(String message) {
        logger.warn(message);

    }

    public static void info(String message) {
        logger.info(message);

    }
}
