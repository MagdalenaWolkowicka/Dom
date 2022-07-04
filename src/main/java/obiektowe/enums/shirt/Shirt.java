package obiektowe.enums.shirt;

public class Shirt {

    private SizeeeeeEnum size;

    public Shirt(SizeeeeeEnum size) {
        this.size = size;
    }

    public SizeeeeeEnum getSize() {
        return size;
    }

    public int getNumeberSize() {
        return size.getNumberSize();
    }

    public void setSize(SizeeeeeEnum size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + size + '\'' +
                '}';
    }
}
