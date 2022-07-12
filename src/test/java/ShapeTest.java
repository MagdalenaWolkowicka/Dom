import obiektowe.inheritance.shape.model.Circle;
import obiektowe.inheritance.shape.model.Rectangle;
import obiektowe.inheritance.shape.model.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    public void shouldCountCircleArea() {
        //given
        Circle circle = new Circle(2);

        //when
        double circleArea = circle.getArea();

        //then
        assertEquals(12.6, circleArea);

    }

    @Test
    public void shouldCountCirclePerimeter() {
        //given
        Circle circle = new Circle(3);

        //when
        double circlePerimeter = circle.getPerimeter();

        //then
        assertEquals(18.8, circlePerimeter);

    }

    @Test
    public void shouldCountRectangleArea() {
        //given
        Rectangle rectangle = new Rectangle(2, 4);

        //when
        double rectangleArea = rectangle.getArea();

        //then
        assertEquals(8, rectangleArea);

    }

    @Test
    public void shouldCountRectanglePerimeter() {
        //given
        Rectangle rectangle = new Rectangle(2, 4);

        //when
        double rectanglePerimeter = rectangle.getPerimeter();

        //then
        assertEquals(12, rectanglePerimeter);
    }

    @Test
    public void shouldCountSquareArea() {
        //given
        Square square = new Square(4);

        //when
        double squareArea = square.getArea();

        //then
        assertEquals(16, squareArea);
    }

    @Test
    public void shouldCountSquarePerimeter() {
        //given
        Square square = new Square(4);

        //when
        double squarePerimeter = square.getPerimeter();

        //then
        assertEquals(16, squarePerimeter);
    }


}
