package effictive.factory.factorymethod;

import effictive.factory.simplefactory.Bmw;
import effictive.factory.simplefactory.Car;

public class BmwDriver implements Driver{
    public Car driverCar(){
        return new Bmw();
    }
}
