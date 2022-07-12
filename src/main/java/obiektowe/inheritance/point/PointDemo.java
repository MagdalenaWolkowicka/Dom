package obiektowe.inheritance.point;

public class PointDemo {
    public static void main(String[] args) {

        Point point1 = new Point(0,10);
        Point point2 = new Point(8, 16);
        float [] tabl = point1.getXY();
        for (float v : tabl) {
            System.out.println(v);
        }
        System.out.println(point1);

        Line line = new Line();
        double lineLength = line.countLineLength(point1, point2);
        System.out.println(lineLength);

        Line line1 = new Line();

        Point middleOfLine = line1.countLineMiddle(2,4,2,4);
        System.out.println(middleOfLine);
        Point middleOfLine2 = line1.countLineMiddle2Arguments(point1, point2);
        System.out.println(middleOfLine2);

    }
}
