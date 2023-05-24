import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean(Car.class);
        car.transportTest();
        Bus bus = context.getBean(Bus.class);
        bus.transportTest();
        Pickup pickup = context.getBean(Pickup.class);
        pickup.transportTest();

        Driver carDriver = context.getBean("carDriver", Driver.class);
        carDriver.driverTest();
        Driver busDriver = context.getBean("busDriver", Driver.class);
        busDriver.driverTest();
        Driver pickupDriver = context.getBean("pickupDriver", Driver.class);
        pickupDriver.driverTest();
    }

}
