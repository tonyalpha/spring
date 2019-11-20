package be.tonyalpha.hoofdstuk1.opdracht7.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.logging.Logger;

@Service
@Profile("bigHouse")
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
        logger.info("Robot cleaning the house.");
        tools.forEach(CleaningTool::doCleanJob);
    }
    @PostConstruct
    public void init() {
        logger.info("Robot preparing for work.");
    }
    @PreDestroy
    public void destroy() {
        logger.info("Robot finishing up.");
    }
}
