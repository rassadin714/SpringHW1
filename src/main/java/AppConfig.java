import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "car")
    public Car getCarBean() {
        return new Car("Audi");
    }

    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus("Mercedes");
    }

    @Bean(name = "pickup")
    public Pickup getPickupBean() {
        return new Pickup("RAM");
    }

    @Bean(name = "carDriver")
    public Driver getDriverCar() {
        return new Driver("Mikhail", getCarBean());
    }

    @Bean(name = "busDriver")
    public Driver getDriverBus() {
        return new Driver("Yulia", getBusBean());
    }

    @Bean(name = "pickupDriver")
    public Driver getDriverPickup() {
        return new Driver("Anton", getPickupBean());
    }

}
