package be.tonyalpha.hoofdstuk1.opdracht5.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
