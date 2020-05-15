package com.codeprep.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

import java.util.HashMap;
import java.util.Map;

public class HealthChecker implements HealthIndicator {

    @Override
    public Health getHealth(boolean includeDetails) {

        Map<String, String> inits = new HashMap<>();
        inits.put("customEndpoint", "SUCCESSFUL");
        return Health.up().withDetails(inits).build();
    }

    @Override
    public Health health() {
        return null;
    }
}
