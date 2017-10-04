package org.minipanda.thespring.inaction.ch1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.minipanda.thespring.inaction.ch1"})
public interface CDPlayerConfig {

}
