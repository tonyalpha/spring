package be.tonyalpha.hoofdstuk1.opdracht7.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class LawnMower implements GardeningTool {
    private Logger logger;

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    public void doGardenJob() {
        logger.info("Mowing the lawn.");
    }
}
