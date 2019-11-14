package be.antonsherri.opdracht3.housekeeping.services;

import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public CleaningTool broom() {
        return new Broom();
    }

    @Bean
    @Scope("prototype")
    public CleaningTool vacuum() {
        return new VacuumCleaner();
    }

    @Bean
    @Scope("prototype")
    public CleaningTool sponge() {
        return new Sponge();
    }

    @Bean
    @Scope(value="prototype", proxyMode = ScopedProxyMode.INTERFACES)
    public CleaningTool disposableDuster() {
        return new DisposableDuster();
    }


    @Bean(name = "BroomService")
    @Lazy
    public CleaningService jill() {
        System.out.println("CleaningService Jill initialized");
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(broom());
        return cs;
    }

    @Bean(name = "VacuumService")
    public CleaningService bob() {
        System.out.println("CleaningService Bob initialized");
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(vacuum());
        return cs;
    }

    @Bean(name = "SpongeService")
    public CleaningService jane() {
        System.out.println("CleaningService Jane initialized");
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(sponge());
        return cs;
    }
    @Bean(name = "DusterService")
    public CleaningService scott() {
        System.out.println("CleaningService Scott initialized");
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(disposableDuster());
        return cs;
    }
}
