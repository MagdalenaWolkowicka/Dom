package obiektowe.enums.shirt;

public class Shop {

    public void pack(Shirt shirt) {



        switch (shirt.getSize()) {
            case XL:
            case XXL:
            case M:
                System.out.println("Pakuję do dużej torby");
                break;
            case S:
            case XS:
                System.out.println("Pakuję do małej torby");
                break;
            default:
                System.out.println("Nie rozpoznano rozmiaru");
        }
        System.out.println("Rozmiar liczbowo " + shirt.getNumeberSize());
    }
}
