package effictive.factory.factorymethod;

import effictive.factory.simplefactory.Car;

public class FactoryMethodMagnate {
    public static void main(String[] args) {
        Driver driver = new BenzDriver();
        Car car = driver.driverCar();
        car.drive();
    }
}
