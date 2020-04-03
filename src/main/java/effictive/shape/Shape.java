package effictive.shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Shape {

    private static Logger logger = LoggerFactory.getLogger(Shape.class);

    void draw(){
        System.out.println(this.toString().equals("Circle"));
        logger.info(" [{}].draw() ",this.toString());
        System.out.println(this + ".draw()");
    }

    public abstract String toString();
}
