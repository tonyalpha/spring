package be.tonyalpha.hoofdstuk1.opdracht8.housekeeping;

import be.tonyalpha.hoofdstuk1.opdracht8.housekeeping.services.AppConfig;
import be.tonyalpha.hoofdstuk1.opdracht8.housekeeping.services.DomesticService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {
    public static void main(String [] args) {

        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext()) {
            ctx.getEnvironment().setActiveProfiles("smallHouse");
            ctx.register(AppConfig.class);
            ctx.refresh();
            System.out.println(ctx.getEnvironment().getProperty("rate")); // DOES NOT WORK WITH: java -Drate=8 HouseApp
            DomesticService domesticService = ctx.getBean("domesticServiceImpl", DomesticService.class);
            domesticService.runHouseHold();
        }
//        try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
//            System.out.println("Container initialized!");
//            DomesticService tony = ctx.getBean("domesticServiceImpl", DomesticService.class);
//            tony.runHouseHold();
//        }
    }
}
