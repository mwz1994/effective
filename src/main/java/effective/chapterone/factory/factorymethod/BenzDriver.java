package effective.chapterone.factory.factorymethod;

import effective.chapterone.factory.simplefactory.Benz;
import effective.chapterone.factory.simplefactory.Car;

public class BenzDriver implements Driver {
    public Car driverCar(){
        return new Benz();
    }
}
