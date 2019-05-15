package creational;

import creational.Factory.car.Car;
import creational.Factory.car.CarFactory;
import creational.Factory.shape.ShapeFactory;
import creational.Factory.shape.Shape;
import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.FactoryProvider;

public class MainClassCreational {

    public static void main(String[] args){


        //Abstract Factory Pattern
        ShapeFactory abstractShapeFactory = (ShapeFactory) FactoryProvider.getFactory("Shape");
        Shape abstractCircle = abstractShapeFactory.getProduct("CIRCLE");
        abstractCircle.draw();

        CarFactory abstractCarFactory = (CarFactory) FactoryProvider.getFactory("Car");
        Car abstractAudi = abstractCarFactory.getProduct("Audi");
        abstractAudi.carName();

        //Factory Pattern
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape SQUARE = shapeFactory.getShape("SQUARE");
        SQUARE.draw();

        Car audi = CarFactory.buildCar("Audi");
        audi.carName();

        Car toyota = CarFactory.buildCar("Toyota");
        toyota.carName();

    }


    public static <T> void print(T t){
        System.out.println(t);
    }


}
