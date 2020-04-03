package effictive.shape;

import java.util.stream.Stream;

public class Shapes {

    public static void main(String[] args) {
        Stream.of(new Circle(),new Square(), new Triangle()).forEach(Shape::draw);
    }
}
