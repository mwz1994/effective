package effictive.factory.simplefactory;

public class Magnate {

    public static void main(String[] args) {
        try {
            Car car = Driver.driverCar("benz");

            car.drive();

            /*Bmw bmw = (Bmw) car;

            bmw.drive();*/

            Benz benz = (Benz) car;

            benz.drive();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
