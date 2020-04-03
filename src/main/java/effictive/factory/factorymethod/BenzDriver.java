package effictive.factory.factorymethod;

import effictive.factory.simplefactory.Benz;
import effictive.factory.simplefactory.Car;

public class BenzDriver implements Driver {
    public Car driverCar(){
        return new Benz();
    }
}
