package pl.mp.spring;

/**
 * Created by Mariola on 2014-10-09.
 */
public class Drawing {

    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void drawShape() {
        this.shape.draw();
    }
}
