package obiektowe.enums.shirt;

public enum SizeeeeeEnum {
    XXL(44),
    XL(42),
    L(40),
    M(38),
    S(36),
    XS(34),
    XXS(32);

    private int numberSize;

    SizeeeeeEnum(int numberSize) {
        this.numberSize = numberSize;
    }

    public int getNumberSize() {
        return numberSize;
    }

    public void setNumberSize(int numberSize) {
        this.numberSize = numberSize;
    }

    @Override
    public String toString() {
        return "SizeeeeeEnum{" +
                "numberSize=" + numberSize +
                '}';
    }
}
