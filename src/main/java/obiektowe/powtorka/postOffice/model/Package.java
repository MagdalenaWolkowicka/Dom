package obiektowe.powtorka.postOffice.model;

public class Package {

    private Person sender;
    private Person recipient;
    private int weight;
    private boolean priority;
    private Status status;

    public Package(Person sender, Person recipient, boolean priority) {
        this.sender = sender;
        this.recipient = recipient;
        this.priority = priority;
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

    public boolean isPriority() {
        return priority;
    }
}
