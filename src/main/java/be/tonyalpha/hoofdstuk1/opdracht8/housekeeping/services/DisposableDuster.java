package be.tonyalpha.hoofdstuk1.opdracht8.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Scope(value="prototype", proxyMode = ScopedProxyMode.INTERFACES)
@Order(3)
public class DisposableDuster implements CleaningTool {
    private Logger logger;
    private boolean used = false;
    public void doCleanJob() {
        if (used) {
            logger.info("Disposable duster already used, please throw away.");
        } else {
            logger.info("Dusting.");
            used = true;
        }
    }
    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
