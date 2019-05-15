package creational.abstractFactory;

import creational.Factory.car.CarFactory;
import creational.Factory.shape.ShapeFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String type){

        if ("Car".equalsIgnoreCase(type)) return new CarFactory();
        else return new ShapeFactory();

    }

}
