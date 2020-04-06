package effective.chapterone.factory.factorymethod;

import effective.chapterone.factory.simplefactory.Car;

public class FactoryMethodMagnate {
    public static void main(String[] args) {
        Driver driver = new BenzDriver();
        Car car = driver.driverCar();
        car.drive();
    }
}
