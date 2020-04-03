package effictive.singleton;

public class SingletonChildA extends Singleton{

    public SingletonChildA(){}

    static public SingletonChildA getInstance() throws ClassNotFoundException {
        return (SingletonChildA) Singleton.getInstance("effictive.singleton.SingletonChildA");
    }

    public void test(){
        System.out.println("getclasssuccessA");
    }

}
