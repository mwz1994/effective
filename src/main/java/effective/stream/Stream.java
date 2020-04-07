package effective.stream;


import java.util.Random;

public class Stream {
    public static void main(String[] args) {
        System.out.println(System.nanoTime());
        System.out.println(System.currentTimeMillis());
        new Random(47).ints(5,20).
                distinct().limit(7).sorted().forEach(System.out::println);
    }
}
