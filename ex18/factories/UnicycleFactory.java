package t_09_interfaces.ex18.factories;

import t_09_interfaces.ex18.model.Cycle;
import t_09_interfaces.ex18.model.Unicycle;

public class UnicycleFactory implements CycleFactory {
    public Cycle getService()
    {
        return new Unicycle();
    }
}