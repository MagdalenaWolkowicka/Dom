package obiektowe.powtorka.carWorkshop;

public class Receipt {
    private String service;
    private int count;
    private int price;

    public Receipt(String service, int count, int price) {
        this.service = service;
        this.count = count;
        this.price = price;
    }

    public void  printReceipt() {
        System.out.printf("Typ naprawy - %s, ilosc %d, cena %d zł \n", service, count, price);
        //String.format();
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "service='" + service + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }

    public int getCount() {
        return count;
    }
}
