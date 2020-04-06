package effective.factory;


import java.util.Calendar;
import java.util.Date;


public class StaticFactory {


    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();

        Integer number = Integer.valueOf("3");

        System.out.println(number);

        Date date = new Date();
        Date date0 = new Date(0L);
        Date date1 = new Date("0");
        Date date2 = new Date(1,2,3);


    }





}
