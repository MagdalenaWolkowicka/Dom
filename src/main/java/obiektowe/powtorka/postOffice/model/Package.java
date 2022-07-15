package obiektowe.powtorka.postOffice.model;

public class Package {

    private Person sender;
    private Person recipient;
    private int weight;
    private boolean priority;
    private Status status;

//    public Package(String sender, String recipient, int weight) {
//        boolean packageIsCreated = true;
//        if (sender == null || recipient == null) {
//            System.out.println("Brak danych");
//            packageIsCreated = false;
//        }
//        if (weight < 1 || weight > 100000) {
//            System.out.println("Zła waga paczki");
//            packageIsCreated = false;
//        }
//        if (packageIsCreated) {
//            this.sender = sender;
//            this.recipient = recipient;
//            this.weight = weight;
//            this.status = Status.CREATED;
//        } else {
//            System.out.println("Paczka nieutworzona");
//        }
//    }

    public Package(Person sender, Person recipient, boolean priority) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.priority = priority;
    }

    public Package(Person sender, Person recipient, boolean priority, Status status) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.priority = priority;
        this.status = status;
    }

    //    public Package(String sender, String recipient, int weight, boolean priority) {
//        this.sender = sender;
//        this.recipient = recipient;
//        this.weight = weight;
//        this.priority = priority;
//    }

    public double countPrice() {
        double price = 0;
        if (weight < 500) {
            price = 5.0;
        } else if (weight >= 500 && weight < 1000) {
            price = 8.0;
        } else if (weight >= 1000 && weight < 2000) {
            price = 12.0;
        } else {
            price = 12.0 + (weight - 2000) / 1000;
        }
        if (this.priority) {
            price = price + price * 0.1;
        }

        return price;
    }

    @Override
    public String toString() {
        return "Package{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", weight=" + weight +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isPriority() {
        return priority;
    }
}
