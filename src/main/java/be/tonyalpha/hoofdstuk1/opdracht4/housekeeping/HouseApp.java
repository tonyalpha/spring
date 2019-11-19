package be.tonyalpha.hoofdstuk1.opdracht4.housekeeping;

import be.tonyalpha.hoofdstuk1.opdracht4.housekeeping.services.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {
    public static void main(String [] args) {
        try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
            System.out.println("Container initialized!");
            DomesticService tony = ctx.getBean("tony", DomesticService.class);
            tony.runHouseHold();
        }
    }
}
