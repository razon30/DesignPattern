package creational.Factory.shape;


import creational.MainClassCreational;

//Step 2: Concrete classes
public class Square implements Shape{

    @Override
    public void draw() {
        MainClassCreational.print("I am from SQUARE");
    }
}
