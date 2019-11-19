package be.tonyalpha.hoofdstuk1.opdracht6.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Service
public class CleaningServiceImpl implements CleaningService {
        private CleaningTool tool;
        private Logger logger;
        private float rate;

        @Autowired
        void setCleaningTool(@Qualifier("shaggy") CleaningTool tool) {
            this.tool = tool;
        }

        @Value("10")
        public void setRate(float rate) {
            this.rate = rate;
        }

        @Autowired
        public void setLogger(Logger logger) {
        this.logger = logger;
        }

        public void clean() {
            logger.info("Cleaning the house.");
            tool.doCleanJob();
        }

        @PostConstruct
        public void init() {
            logger.info("Cleaning service preparing for work.");
        }

        @PreDestroy
        public void destroy() {
            logger.info("Cleaning service finishing up.");
        }
}
