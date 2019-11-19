package be.tonyalpha.hoofdstuk1.opdracht6.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.logging.Logger;

@Component
public class HedgeTrimmerFactory {
    private Logger logger;

    @Bean
    @Primary
    public GardeningTool hedgeTrimmer() {
        int hour = LocalTime.now().getHour();
        if(hour > 8 && hour < 18) {
            return () -> logger.info("Trimming electric.");
        } else {
            return () -> logger.info("Trimming manual.");
        }
    }

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
