package effective.chapterone.factory.simplefactory;

//工厂类角色
public class Driver {
    //工厂方法 返回类型为抽象产品角色
    public static Car driverCar(String s) throws Exception{

        if (s.equalsIgnoreCase("Benz"))
            return new Benz();
        else if(s.equalsIgnoreCase("Bmwz"))
            return new Bmw();
        else throw new Exception();
    }

}
