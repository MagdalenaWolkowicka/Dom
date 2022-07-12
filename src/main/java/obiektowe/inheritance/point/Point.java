package obiektowe.inheritance.point;

public class Point {
    private float X;
    private float Y;

    public Point(float x, float y) {
        X = (float) x;
        Y = (float) y;
    }

//    public Point(double c, double b) {
//        X = 0;
//        Y = 0;
//    }

    public float[] getXY() {
        float [] tabl = new float[2];
        tabl[0] = X;
        tabl[1] = Y;

        return tabl;
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        Y = y;
    }

    @Override
    public String toString() {
        return "(" + X + ", " + Y + ")";
    }
}
