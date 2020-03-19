package t_09_interfaces.ex18;

import t_09_interfaces.ex18.factories.BicycleFactory;
import t_09_interfaces.ex18.factories.TricycleFactory;
import t_09_interfaces.ex18.factories.UnicycleFactory;
import t_09_interfaces.ex18.model.Factories;

public class App {

    public static void main(String[] args)
    {
        Factories.serviceConsumer(new UnicycleFactory());
        Factories.serviceConsumer(new BicycleFactory());
        Factories.serviceConsumer(new TricycleFactory());
    }
}
