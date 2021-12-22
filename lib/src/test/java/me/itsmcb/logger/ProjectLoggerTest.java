package me.itsmcb.logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProjectLoggerTest {

    @Test void debugWorks() {
        ProjectLogger logger = new ProjectLogger("TEST", true, true);
        assertTrue(logger.getDebug(), "Debug boolean should return 'true'");
        logger.setDebug(false);
        assertFalse(logger.getDebug(), "Debug boolean should return 'false'");
    }
}
