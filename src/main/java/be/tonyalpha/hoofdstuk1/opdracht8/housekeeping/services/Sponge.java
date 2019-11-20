package be.tonyalpha.hoofdstuk1.opdracht8.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Scope("prototype")
@Order(4)
@Qualifier("wet")
@Profile("smallHouse | bigHouse")
public class Sponge implements CleaningTool {
    private Logger logger;
    Sponge() {
    }
    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    public void doCleanJob() {
        logger.info("Spunging");
    }
}
