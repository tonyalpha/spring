package be.tonyalpha.hoofdstuk1.opdracht6.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.logging.Logger;

@Service
public class GardeningServiceImpl implements GardeningService {
    private GardeningTool tool;
    private Logger logger;

    @Resource(name="lawnMower")
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

    @PostConstruct
    public void init() {
        logger.info("Gardening service preparing for work.");
    }

    @PreDestroy
    public void destroy() {
        logger.info("Gardening service finishing up.");
    }
}
