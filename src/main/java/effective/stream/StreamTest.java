package effective.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    private static Logger logger = LoggerFactory.getLogger(StreamTest.class);


    public static void main(String[] args) {
        int[] nums = {1,2,3};

        int sum ;

        sum = IntStream.of(nums).sum();

//        System.out.println(sum);

        IntStream randomStream = new Random().ints().limit(10);

        randomStream.forEach(System.out::println);

        String str = "my name is 007";

        Stream<String> split = Stream.of(str.split(" "));

        Stream<String> filter = split.filter(s->s.length()>2);

        System.out.println("-------------print filter stream-------------");

//        filter.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(str.split(" ")).filter(s->s.length()>2).map(String::length);

        System.out.println("-------------print filter length-------------");

//        integerStream.forEach(System.out::println);

        Stream.of(str.split(" ")).peek(System.out::println).forEach(System.out::println);

    }


}
