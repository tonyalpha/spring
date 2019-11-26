package be.tonyalpha.hoofdstuk1.opdracht11.housekeeping.housekeeping.services;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class AppConfig {
}