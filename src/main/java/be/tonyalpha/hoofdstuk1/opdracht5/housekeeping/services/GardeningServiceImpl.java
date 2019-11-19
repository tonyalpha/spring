package be.tonyalpha.hoofdstuk1.opdracht5.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class GardeningServiceImpl implements GardeningService {
    private GardeningTool tool;
    private Logger logger;

    @Autowired
    public void setGardeningTool(GardeningTool tool) {
        this.tool = tool;
    }

    public void garden() {
        logger.info("Working in the garden.");
        tool.doGardenJob();
    }

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    public void init() {
        logger.info("GardeningService preparing for work.");
    }

    public void destroy() {
        logger.info("GardeningService cleaning up.");
    }
}
