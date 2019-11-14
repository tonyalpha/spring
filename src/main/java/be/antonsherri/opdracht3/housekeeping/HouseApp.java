package be.antonsherri.opdracht3.housekeeping;

import be.antonsherri.opdracht3.housekeeping.services.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {
    public static void main(String [] args) {

        try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
            CleaningService jill = ctx.getBean("BroomService", CleaningService.class);
            CleaningService bob = ctx.getBean("VacuumService", CleaningService.class);
            CleaningService patrick = ctx.getBean("SpongeService", CleaningService.class);
            CleaningService scott = ctx.getBean("DusterService", CleaningService.class);
            jill.clean();
            bob.clean();
            patrick.clean();
            scott.clean();
            scott.clean();
        }
    }
}
