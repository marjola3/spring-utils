package pl.mp.spring;

/**
 * Created by Mariola on 2014-10-08.
 */
public class Triangle implements Shape{

    private int height = 5;

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("triangle");
    }
}
