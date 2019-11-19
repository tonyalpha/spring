package be.tonyalpha.hoofdstuk1.opdracht4.housekeeping.services;

public class DomesticServiceImpl implements DomesticService {
    private CleaningService cleaningService;
    private GardeningService gardeningService;

    void setCleaningService (CleaningService cleaningService) {
        this.cleaningService = cleaningService;
    }
    void setGardeningService(GardeningService gardeningService) {
        this.gardeningService = gardeningService;
    }
    public void runHouseHold() {
        System.out.println("Running house hold operation!");
        cleaningService.clean();
        gardeningService.garden();
    }
}
