package effictive.singleton;

public class testSingletonMap {

    public static void main(String[] args) throws ClassNotFoundException {
        SingletonChildA singletonChildA = SingletonChildA.getInstance();
        Integer number = null;
        
        String str = number.toString();

        singletonChildA.test();
    }
}
