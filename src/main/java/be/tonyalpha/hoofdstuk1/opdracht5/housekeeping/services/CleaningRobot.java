package be.tonyalpha.hoofdstuk1.opdracht5.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
@Primary
public class CleaningRobot implements CleaningService {
    private List<CleaningTool> tools;
    private Logger logger;

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Autowired
    public void setCleaningTools(List<CleaningTool> tools) {
        this.tools = tools;
    }
    public void clean(){
        logger.info("Cleaning the house.");
        tools.forEach(CleaningTool::doCleanJob);
    }
}
