package com.cmpg.demo;

import org.springframework.context.annotation.Configuration;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;

@Configuration(proxyBeanMethods = false)
public class MyMeterRegistryConfiguration {

    @Bean
    public MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
    return (registry) -> registry.config().commonTags("cluster_name","cluster-1","pod_name","micrometer","namespace_name","default","projectId","playground-s-11-2af6ea26");
}
}   
