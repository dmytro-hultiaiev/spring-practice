package org.string.practise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.string.practise.IoC")
@ComponentScan("org.string.practise.DI")
@PropertySource("classpath:Car.properties")
public class SpringConfiguration {}
