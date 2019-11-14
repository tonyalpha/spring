package be.antonsherri.opdracht3.housekeeping.services;

public class CleaningServiceImpl implements CleaningService {
        private CleaningTool tool;

        void setCleaningTool(CleaningTool tool) {
            this.tool = tool;
        }

        public void clean() {
            System.out.println("Cleaning the house");
            tool.doCleanJob();
        }
}
