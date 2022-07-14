package obiektowe.powtorka.postOffice.model;

import obiektowe.powtorka.postOffice.model.Address;

public class Person {

    private String name;
    private String surname;
    private Address address;

    public Person(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                '}';
    }
}
