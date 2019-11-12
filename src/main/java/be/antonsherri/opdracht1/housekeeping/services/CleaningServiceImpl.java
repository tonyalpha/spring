package be.antonsherri.opdracht1.housekeeping.services;

public class CleaningServiceImpl implements CleaningService {
        private CleaningTool tool;

        public void setCleaningTool(CleaningTool tool) {
            this.tool = tool;
        }

        public void clean() {
            System.out.println("Cleaning the house");
            tool.doCleanJob();
        }
}
