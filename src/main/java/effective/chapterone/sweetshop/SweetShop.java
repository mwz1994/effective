package effective.chapterone.sweetshop;

import java.lang.reflect.InvocationTargetException;

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        Candy candy= new Candy();
        Class candyClazz = candy.getClass();
        System.out.println(candy);
        System.out.println("After creating Candy");
        try {
            Class gumClass = Class.forName("effective.chapterone.sweetshop.Gum");
            System.out.println(gumClass);
            Gum gum = (Gum) gumClass.getDeclaredConstructor().newInstance();
            int cellphone  = gum.getCellphone();
            System.out.println(cellphone);
        } catch(ClassNotFoundException | IllegalAccessException|NoSuchMethodException |InvocationTargetException | InstantiationException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
