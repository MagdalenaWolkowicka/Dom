package obiektowe.inheritance.shape;

import obiektowe.inheritance.shape.model.Circle;
import obiektowe.inheritance.shape.model.Rectangle;
import obiektowe.inheritance.shape.model.Square;

public class ShapeDemo {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle("czerwone", true,3);
        System.out.println(circle1);
        double circleArea = circle1.getArea();
        System.out.println(circleArea);
        double circlePerimeter = circle1.getPerimeter();
        System.out.println(circlePerimeter);
        System.out.println("");

        Rectangle rectangle = new Rectangle("niebieski", false, 3, 4);
        System.out.println(rectangle);
        double rectangleArea = rectangle.getArea();
        System.out.println(rectangleArea);
        double rectanglePerimeter = rectangle.getPerimeter();
        System.out.println(rectanglePerimeter);
        System.out.println("");

        Square square = new Square("zielony", true, 4, 4);
        System.out.println(square);
        double squareArea = square.getArea();
        System.out.println(squareArea);
        double squarePerimeter = square.getPerimeter();
        System.out.println(squarePerimeter);


    }
}
