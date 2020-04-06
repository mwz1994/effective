package effective.chapterone.singleton;


public class SingletonP {

    private static SingletonP instance = new SingletonP();

    private SingletonP(){}

    public static SingletonP getInstance(){
        return instance;
    }
}
