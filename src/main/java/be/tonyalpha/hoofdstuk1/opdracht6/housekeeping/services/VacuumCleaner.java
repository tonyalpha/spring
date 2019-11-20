package be.tonyalpha.hoofdstuk1.opdracht6.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Scope("prototype")
@Order(2)
@Qualifier("electric")
public class VacuumCleaner implements CleaningTool {
    private Logger logger;

    VacuumCleaner() {
    }
    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    public void doCleanJob() {
        logger.info("Vacuuming");
    }
}