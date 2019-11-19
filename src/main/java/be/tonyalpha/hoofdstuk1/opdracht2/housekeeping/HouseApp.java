package be.tonyalpha.hoofdstuk1.opdracht2.housekeeping;

import be.tonyalpha.hoofdstuk1.opdracht2.housekeeping.services.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {
    public static void main(String [] args) {

        try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
            CleaningService jill = ctx.getBean("jill", CleaningService.class);
            CleaningService bob = ctx.getBean("bob", CleaningService.class);
            CleaningService patrick = ctx.getBean("patrick", CleaningService.class);
            jill.clean();
            bob.clean();
            patrick.clean();
        }
    }
}
