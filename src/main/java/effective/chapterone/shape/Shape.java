package effective.chapterone.shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Shape {

    private static Logger logger = LoggerFactory.getLogger(Shape.class);

    void draw(){
        logger.info(" [{}].draw() ",this);
        System.out.println(this + ".draw()");
    }

//    public abstract String toString();
}
