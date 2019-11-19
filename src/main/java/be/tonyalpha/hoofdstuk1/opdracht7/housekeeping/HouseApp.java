package be.tonyalpha.hoofdstuk1.opdracht7.housekeeping;

import be.tonyalpha.hoofdstuk1.opdracht7.housekeeping.services.AppConfig;
import be.tonyalpha.hoofdstuk1.opdracht7.housekeeping.services.DomesticService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {
    public static void main(String [] args) {

        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext()) {
            ctx.getEnvironment().setActiveProfiles("bigHouse");
            ctx.register(AppConfig.class);
            ctx.refresh();
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
