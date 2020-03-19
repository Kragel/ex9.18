package t_09_interfaces.ex18.factories;

import t_09_interfaces.ex18.model.Cycle;
import t_09_interfaces.ex18.model.Tricycle;

public class TricycleFactory implements CycleFactory {
    public Cycle getService()
    {
        return new Tricycle();
    }
}
