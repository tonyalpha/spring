package be.tonyalpha.hoofdstuk1.opdracht11.housekeeping.housekeeping;

import be.tonyalpha.hoofdstuk1.opdracht11.housekeeping.housekeeping.services.AppConfig;
import be.tonyalpha.hoofdstuk1.opdracht11.housekeeping.housekeeping.services.DomesticService;
import be.tonyalpha.hoofdstuk1.opdracht11.housekeeping.housekeeping.services.LunchEvent;
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
        }
//        try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
//            System.out.println("Container initialized!");
//            DomesticService tony = ctx.getBean("domesticServiceImpl", DomesticService.class);
//            tony.runHouseHold();
//        }
    }
}
