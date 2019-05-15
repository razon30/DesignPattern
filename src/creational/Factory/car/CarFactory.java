package creational.Factory.car;

import creational.abstractFactory.AbstractFactory;

public class CarFactory implements AbstractFactory<Car> {

    public static Car buildCar(String type){

        if ("Audi".equalsIgnoreCase(type)){
            return new Audi();
        }else {
            return new Toyota();
        }

    }


    @Override
    public Car getProduct(String Type) {

        if ("Audi".equalsIgnoreCase(Type)){
            return new Audi();
        }else {
            return new Toyota();
        }

    }
}
