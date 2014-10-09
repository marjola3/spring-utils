package pl.mp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mariola on 2014-10-08.
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-context.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        System.out.println(triangle.getHeight());

        //Shape shape = new Triangle();
        //myDrawMethod(shape);

        System.out.println("/////");

        Drawing drawing = new Drawing();
        drawing.setShape(triangle);
        drawing.drawShape();

    }

    public static void myDrawMethod(Shape shape) {
        shape.draw();
    }
}
