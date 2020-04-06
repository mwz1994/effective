package effective.chapterone.singleton;

public class SingletonPro {

    private static SingletonPro instance = new SingletonPro();

    private SingletonPro(){}

    public static synchronized SingletonPro getInstance(){
        if (instance == null)
            instance = new SingletonPro();
        return instance;
    }
}
