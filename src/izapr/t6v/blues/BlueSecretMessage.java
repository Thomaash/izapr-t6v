package izapr.t6v.blues;

import izapr.t6v.post.SecretMessage;

public class BlueSecretMessage extends SecretMessage {

    public BlueSecretMessage(String senderAddress, String recipientAddress, String message) {
        super(senderAddress, recipientAddress, message);
    }

    @Override
    protected String getSecretMessage() {
        return super.getSecretMessage();
    }

}
