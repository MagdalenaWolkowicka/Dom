package obiektowe.powtorka.postOffice.model;

public class Letter {

    private Person sender;
    private Person recipient;
    private boolean priority = false;
    private Status status;

    public Letter(Person sender, Person recipient, boolean priority) {
        this.sender = sender;
        this.recipient = recipient;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "sender=" + sender +
                ", recipient=" + recipient +
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
}
