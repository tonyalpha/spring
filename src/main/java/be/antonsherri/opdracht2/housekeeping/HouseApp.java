package be.antonsherri.opdracht1.housekeeping;

import be.antonsherri.opdracht1.housekeeping.services.*;

public class HouseApp {
    public static void main(String [] args) {
        CleaningTool broom = new Broom();
        CleaningTool vacuum = new VacuumCleaner();
        CleaningTool sponge = new Sponge();

        CleaningServiceImpl jill = new CleaningServiceImpl();
        jill.setCleaningTool(broom);
        CleaningServiceImpl bob = new CleaningServiceImpl();
        bob.setCleaningTool(vacuum);
        CleaningServiceImpl patrick = new CleaningServiceImpl();
        patrick.setCleaningTool(sponge);

        jill.clean();
        bob.clean();
        patrick.clean();
    }
}
