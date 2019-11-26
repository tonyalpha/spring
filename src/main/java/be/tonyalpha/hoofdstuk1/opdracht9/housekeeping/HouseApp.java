package be.tonyalpha.hoofdstuk1.opdracht9.housekeeping;

import be.tonyalpha.hoofdstuk1.opdracht9.housekeeping.services.DomesticService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HouseApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext())  {
            ctx.getEnvironment().setActiveProfiles("smallHouse");
            ctx.setConfigLocation("housekeeping.xml");
            ctx.refresh();
            DomesticService domesticService = ctx.getBean("domesticServiceImpl", DomesticService.class);
            domesticService.runHouseHold();
            // XML FILE NEEDS TO BE IN SRC\MAIN\RESOURCES\
            // APPLICATION.PROPERTIES FILE NEEDS TO BE IN SRC\MAIN\JAVA
        }
    }
}
