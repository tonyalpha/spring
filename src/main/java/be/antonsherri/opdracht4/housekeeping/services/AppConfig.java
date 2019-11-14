package be.antonsherri.opdracht4.housekeeping.services;

import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {

    @Bean
    @Primary
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

    @Bean
    public GardeningTool lawnMower() {
        return new LawnMower();
    }

    @Bean(name = "BroomService")
    @Lazy
    public CleaningService jill() {
        System.out.println("CleaningService Jill initialized");
        CleaningServiceImpl csi = new CleaningServiceImpl();
        csi.setCleaningTool(broom());
        return csi;
    }

    @Bean(name = "VacuumService")
    public CleaningService bob() {
        System.out.println("CleaningService Bob initialized");
        CleaningServiceImpl csi = new CleaningServiceImpl();
        csi.setCleaningTool(vacuum());
        return csi;
    }

    @Bean(name = "SpongeService")
    public CleaningService jane() {
        System.out.println("CleaningService Jane initialized");
        CleaningServiceImpl csi = new CleaningServiceImpl();
        csi.setCleaningTool(sponge());
        return csi;
    }

    @Bean(name = "DusterService")
    public CleaningService scott() {
        System.out.println("CleaningService Scott initialized");
        CleaningServiceImpl csi = new CleaningServiceImpl();
        csi.setCleaningTool(disposableDuster());
        return csi;
    }

    @Bean(name = "LawnMowerService", initMethod = "init", destroyMethod = "destroy")
    public GardeningService jake(GardeningTool tool) {
        GardeningServiceImpl gsi = new GardeningServiceImpl();
        gsi.setGardeningTool(tool);
        return gsi;
    }

    @Bean
    public CleaningService jamie(CleaningTool tool) {
        System.out.println("CleaningService Jamie initialized");
        CleaningServiceImpl csi = new CleaningServiceImpl();
        csi.setCleaningTool(tool);
        return csi;
    }
    @Bean
    public DomesticService tony() {
        System.out.println("DomesticService tony initialized");
        DomesticServiceImpl domesticServiceImpl = new DomesticServiceImpl();
        domesticServiceImpl.setCleaningService(jamie(broom()));
        domesticServiceImpl.setGardeningService(jake(lawnMower()));
        return domesticServiceImpl;
    }
}
