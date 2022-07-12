package obiektowe.inheritance.shape.model;

public class Square extends Rectangle {

    public Square(String color, boolean isFilled, int length, int width) {
        super(color, isFilled, length, width);
    }

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.pow(length,2);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }
}
