package creational.Factory.car;

import creational.MainClassCreational;

public class Toyota implements Car{
    @Override
    public void carName() {
        MainClassCreational.print("Toyota");
    }
}
