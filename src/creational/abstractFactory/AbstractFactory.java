package creational.abstractFactory;

public interface AbstractFactory<T> {

    T getProduct(String Type);

}
