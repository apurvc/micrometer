package com.cmpg.demo;


import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.MeterRegistry;

@Component
public class MyBean {

    //private final Map<String> dictionary;

    public MyBean(MeterRegistry registry) {
        //this.dictionary = Dictionary.load();
        registry.gauge("dictionary.size", 100);
    }

}
