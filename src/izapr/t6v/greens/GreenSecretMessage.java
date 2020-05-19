package izapr.t6v.greens;

import izapr.t6v.post.SecretMessage;

public class GreenSecretMessage extends SecretMessage {

    public GreenSecretMessage(String senderAddress, String recipientAddress, String message) {
        super(senderAddress, recipientAddress, message);
    }

    @Override
    protected String getSecretMessage() {
        return super.getSecretMessage();
    }

}
