package obiektowe.inheritance.point;

public class Line {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line(float X1, float X2, float Y1, float Y2) {
        point1 = new Point(X1, Y1);
        point2 = new Point(X2, Y2);
    }

    public Line() {
    }

    public double countLineLength(Point point1, Point point2) {
        double lineLength = 0;
        if (point1.getX() == point2.getX() && point1.getY() == point2.getY()) {
            lineLength = 0;
        } else if (point1.getX() == point2.getX()) {
            lineLength = Math.abs(point1.getY() - point2.getY());
        } else if (point1.getY() == point2.getY()) {
            lineLength = Math.abs(point1.getX() - point2.getX());
        } else {
            lineLength = countLineLengthForDifferentXY(point1, point2);
        }
        return lineLength;
    }

    private float countLineLengthForDifferentXY(Point point1, Point point2) {
        float X = 0;
        float Y = 0;
        X = Math.abs(point1.getY() - point2.getY());
        Y = Math.abs(point1.getX() - point2.getX());

        return (float) Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
    }

    public Point countLineMiddle(int X1, int X2, int Y1, int Y2) {
        float middleX = 0;
        float middleY = 0;

        middleX = (X1 + X2) / 2;
        middleY = (Y1 + Y2) / 2;

        return new Point(middleX, middleY);
    }

    public Point countLineMiddle2Arguments(Point point1, Point point2) {
        float middleX = 0;
        float middleY = 0;

        middleX = (point1.getX() + point2.getX()) / 2;
        middleY = (point1.getY() + point2.getY()) / 2;

        return new Point(middleX, middleY);
    }


    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
}
