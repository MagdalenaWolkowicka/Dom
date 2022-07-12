package obiektowe.inheritance.shape.model;

public abstract class Shape {

    protected String color;
    protected boolean isFilled;

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public abstract double getArea();

    public abstract double getPerimeter();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        String isFilledWord = null;
        if (isFilled) {
            isFilledWord = "filled";
        } else {
            isFilledWord = "not filled";
        }
        return "Shape with color of " + color + " and " + isFilledWord;
    }
}
