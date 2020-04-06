package effective.chapterone.factory.factorymethod;

import effective.chapterone.factory.simplefactory.Bmw;
import effective.chapterone.factory.simplefactory.Car;

public class BmwDriver implements Driver{
    public Car driverCar(){
        return new Bmw();
    }
}
