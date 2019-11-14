package be.antonsherri.opdracht3.housekeeping.services;

public class DisposableDuster implements CleaningTool {
    private boolean used = false;
    public void doCleanJob() {
        if (used) {
            System.out.println("Disposable duster already used, please throw away!");
        } else {
            System.out.println("Dusting...");
            used = true;
        }
    }
}
