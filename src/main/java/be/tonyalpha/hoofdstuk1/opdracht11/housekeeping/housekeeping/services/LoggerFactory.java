package be.tonyalpha.hoofdstuk1.opdracht11.housekeeping.housekeeping.services;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class LoggerFactory {
    @Bean
    @Scope("prototype")
    public Logger logger(InjectionPoint ip) {
        return Logger.getLogger(ip.getClass().getName());
    }
}
