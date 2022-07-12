package obiektowe.inheritance.shape.model;

public class Circle extends Shape {

    private int radius;

    public Circle(String color, boolean isFilled, int radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        area = Math.round(area * 10);
        return area / 10;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        perimeter = Math.round(perimeter * 10);
        return perimeter / 10;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }
}
