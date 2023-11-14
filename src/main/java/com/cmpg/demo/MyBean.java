package com.cmpg.demo;


import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.MeterRegistry;

@Component
public class MyBean {

    public MyBean(MeterRegistry registry) {
        registry.gauge("hpametric", 50);
    }

}
