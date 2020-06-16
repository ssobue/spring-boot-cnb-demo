package dev.ssobue.cnb;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@DisplayName("Application Launching Tests")
class CloudNativeBuildPackDemoApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Context Load Test")
    void contextLoads() {
        assertNotNull(context);
    }
}
