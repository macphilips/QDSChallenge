package com.qds.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by MOROLANI on 8/30/2017.
 */
@Service
public class HelloWorldService {
    public String getDesc() {
        return "Gradle + Spring MVC Hello World Example";
    }

    public String getTitle(String name) {
        if (StringUtils.isEmpty(name)) {
            return "Hello World";
        } else {
            return "Hello " + name;
        }
    }
}
