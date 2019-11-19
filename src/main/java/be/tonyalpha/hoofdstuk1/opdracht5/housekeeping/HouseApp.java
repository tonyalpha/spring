package be.tonyalpha.hoofdstuk1.opdracht5.housekeeping;

import be.tonyalpha.hoofdstuk1.opdracht5.housekeeping.services.AppConfig;
import be.tonyalpha.hoofdstuk1.opdracht5.housekeeping.services.DomesticService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {
    public static void main(String [] args) {
        try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
            System.out.println("Container initialized!");
            DomesticService tony = ctx.getBean("domesticServiceImpl", DomesticService.class);
            tony.runHouseHold();
        }
    }
}
