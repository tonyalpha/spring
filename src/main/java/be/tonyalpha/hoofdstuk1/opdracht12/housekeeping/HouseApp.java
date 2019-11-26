package be.tonyalpha.hoofdstuk1.opdracht12.housekeeping;

import be.tonyalpha.hoofdstuk1.opdracht12.housekeeping.services.AppConfig;
import be.tonyalpha.hoofdstuk1.opdracht12.housekeeping.services.DomesticService;
import be.tonyalpha.hoofdstuk1.opdracht12.housekeeping.services.LunchEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class HouseApp {
    public static void main(String [] args) {

        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext()) {
            ctx.getEnvironment().setActiveProfiles("smallHouse");
            ctx.register(AppConfig.class);
            ctx.refresh();
            System.out.println(ctx.getEnvironment().getProperty("rate")); // DOES NOT WORK WITH: java -Drate=8 HouseApp
            DomesticService domesticService = ctx.getBean("domesticServiceImpl", DomesticService.class);
            domesticService.runHouseHold();
            ctx.publishEvent(new LunchEvent());

            Locale locale = Locale.CANADA_FRENCH;
            String message = ctx.getMessage("welcome", new Object[] {12}, locale);
            System.out.println(message);
        }
//        try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
//            System.out.println("Container initialized!");
//            DomesticService tony = ctx.getBean("domesticServiceImpl", DomesticService.class);
//            tony.runHouseHold();
//        }
    }
}
