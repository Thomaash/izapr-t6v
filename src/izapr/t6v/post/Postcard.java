package izapr.t6v.post;

public class Postcard implements Message {

    private final String senderAddress;
    private final String recipientAddress;
    private final String message;

    public Postcard(String senderAddress, String recipientAddress, String message) {
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
        this.message = message;
    }

    @Override
    public String getSenderAddress() {
        return this.senderAddress;
    }

    @Override
    public String getRecipientAddress() {
        return this.recipientAddress;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return String.format(
                "Adresa odesílatele: %s\nAdresa příjemce: %s\n\n%s",
                this.senderAddress,
                this.recipientAddress,
                this.message
        );
    }

}
