package effictive.factory.simplefactory;

public class Magnate {

    public static void main(String[] args) {
        try {
            Car car = Driver.driverCar("benz");

            car.drive();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
