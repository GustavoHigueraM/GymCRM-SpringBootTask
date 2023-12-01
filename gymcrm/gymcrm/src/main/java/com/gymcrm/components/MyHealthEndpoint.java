package com.gymcrm.components;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "my-health")
public class MyHealthEndpoint {
 
      Map<String, Object> healthMap = new LinkedHashMap<>();
    @ReadOperation
    public Map<String, Object> health() {
        healthMap.put("MyHealth", "Working");
        return healthMap;
    }
    @ReadOperation
    public String getHealth(@Selector String name) {
        return (String) healthMap.get(name);
    }
}
