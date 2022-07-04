package obiektowe.enums.shirt;

public class EnumDemo {

    public static void main(String[] args) {

        Shirt shirt1 = new Shirt(SizeeeeeEnum.XL);
        Shirt shirt2 = new Shirt(SizeeeeeEnum.XXL);

        System.out.println(shirt1);
        System.out.println(shirt2);

        Shop shop = new Shop();
        shop.pack(shirt1);
        shop.pack(shirt2);
        System.out.println("");

        SizeeeeeEnum size = SizeeeeeEnum.S;
        System.out.println(size.getNumberSize());
        System.out.println("");

        for (SizeeeeeEnum value : SizeeeeeEnum.values()) {
            System.out.println(value);
            System.out.println(value.getNumberSize());
            System.out.println(value.name());
            System.out.println(value.ordinal());
        }


    }
}
