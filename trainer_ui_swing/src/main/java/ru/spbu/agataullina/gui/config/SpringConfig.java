package ru.spbu.agataullina.gui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "ru.spbu.agataullina")
@PropertySource("jdbc.properties")
public class SpringConfig {

}
