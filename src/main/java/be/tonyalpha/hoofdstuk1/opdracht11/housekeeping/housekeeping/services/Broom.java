package be.tonyalpha.hoofdstuk1.opdracht11.housekeeping.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Scope("prototype")
@Order(1)
@Profile("smallHouse | bigHouse")
public class Broom implements CleaningTool {
    private Logger logger;

    Broom() {
    }
    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    public void doCleanJob() {
        logger.info("Scrubbing");
    }
}
