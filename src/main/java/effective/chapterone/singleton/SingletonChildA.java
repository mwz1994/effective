package effective.chapterone.singleton;

public class SingletonChildA extends Singleton{

    public SingletonChildA(){}

    static public SingletonChildA getInstance() throws ClassNotFoundException {
        return (SingletonChildA) getInstance("SingletonChildA");
    }

    public void test(){
        System.out.println("getclasssuccessA");
    }

}
