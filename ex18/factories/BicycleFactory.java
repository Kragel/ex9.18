package t_09_interfaces.ex18.factories;

import t_09_interfaces.ex18.model.Bicycle;
import t_09_interfaces.ex18.model.Cycle;

public class BicycleFactory implements CycleFactory {
    public Cycle getService()
    {
        return new Bicycle();
    }
}