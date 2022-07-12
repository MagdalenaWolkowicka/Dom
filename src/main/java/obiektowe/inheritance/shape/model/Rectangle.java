package obiektowe.inheritance.shape.model;

public class Rectangle extends Shape {

    protected int length;
    protected int width;

    public Rectangle(String color, boolean isFilled, int length, int width) {
        super(color, isFilled);
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }
}
