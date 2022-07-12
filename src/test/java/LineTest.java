import obiektowe.inheritance.point.Line;
import obiektowe.inheritance.point.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {

    Line line;

    @BeforeEach
    void beforeEach() {
        line = new Line();
    }

    @Test
    public void shouldCountLineLengthEquals0() {
        //given
        Point point1 = new Point(2, 2);
        Point point2 = new Point(2, 2);

        //when
        double lineLength = line.countLineLength(point1, point2);

        //then
        assertEquals(0, lineLength);
    }

    @Test
    public void shouldCountLineLengthWithTheSameX() {
        //given
        Point point1 = new Point(2, 5);
        Point point2 = new Point(2, 8);

        //when
        double lineLength = line.countLineLength(point1, point2);

        //then
        assertEquals(3, lineLength);
    }

    @Test
    public void shouldCountLineLengthWithTheSameY() {
        //given
        Point point1 = new Point(6, 5);
        Point point2 = new Point(2, 5);

        //when
        double lineLength = line.countLineLength(point1, point2);

        //then
        assertEquals(4, lineLength);
    }

    @Test
    public void shouldCountLineLengthWithDifferentXY() {
        //given
        Point point1 = new Point(6, 5);
        Point point2 = new Point(3, 9);

        //when
        double lineLength = line.countLineLength(point1, point2);

        //then
        assertEquals(5, lineLength);
    }

    @Test
    public void shouldCountLineMiddle() {
        //given
        Point point = new Point(3, 3);

        //when
        Point middleOfLine = line.countLineMiddle(2,4,2,4);

        //then
        assertEquals(point.getX(), middleOfLine.getX());
        assertEquals(point.getY(), middleOfLine.getY());
    }
}
