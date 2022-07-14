package obiektowe.powtorka.postOffice.model;

public class Address {

    private String city;
    private String street;
    private int houseNumber;
    private String zipCode;

    public Address(String city, String street, int houseNumber, String zipCode) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
