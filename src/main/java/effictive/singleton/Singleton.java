package effictive.singleton;

import java.util.HashMap;

public class Singleton {

    private static HashMap<String,Object> sinRegistry = new HashMap();
    static private Singleton s = new Singleton();

    protected Singleton(){}

    public static Singleton getInstance(String name) throws ClassNotFoundException {
        if (name == null)
            name = "Singleton";
        if (sinRegistry.get(name) == null){
            try {
                sinRegistry.put(name,Class.forName(name));
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return (Singleton) sinRegistry.get(name);
    }

    public void test(){
        System.out.println("getclasssuccess");
    }





}
