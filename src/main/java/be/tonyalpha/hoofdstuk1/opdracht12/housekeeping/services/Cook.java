package be.tonyalpha.hoofdstuk1.opdracht12.housekeeping.services;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
class Cook {
    public Cook() {}

    @EventListener
    public void makeLunch(LunchEvent lunchEvent) {
        System.out.println("Making lunch...");
    }
}
