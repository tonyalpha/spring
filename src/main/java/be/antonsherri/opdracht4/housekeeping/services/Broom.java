package be.antonsherri.opdracht4.housekeeping.services;

public class Broom implements CleaningTool {
    Broom() {
        System.out.println("Test Broom");
    }
    public void doCleanJob() {
        System.out.println("Scrub scrub");
    }
}
