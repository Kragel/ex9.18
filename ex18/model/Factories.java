package t_09_interfaces.ex18.model;

import t_09_interfaces.ex18.factories.CycleFactory;

public class Factories {
    public static void serviceConsumer(CycleFactory fact)
    {
        Cycle s = fact.getService();
        s.method1();
        s.method2();
    }
}