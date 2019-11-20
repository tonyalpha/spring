package be.tonyalpha.hoofdstuk1.opdracht8.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Service
public class DomesticServiceImpl implements DomesticService {
    private Logger logger;
    private CleaningService cleaningService;
    private GardeningService gardeningService;

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Autowired
    void setCleaningService (CleaningService cleaningService) {
        this.cleaningService = cleaningService;
    }

    @Autowired
    void setGardeningService(GardeningService gardeningService) {
        this.gardeningService = gardeningService;
    }
    public void runHouseHold() {
        logger.info("Running household");
        cleaningService.clean();
        gardeningService.garden();
    }
    @PostConstruct
    public void init() {
        logger.info("Domestic service preparing for work.");
    }
    @PreDestroy
    public void destroy() {
        logger.info("Domestic service finishing up.");
    }
}
