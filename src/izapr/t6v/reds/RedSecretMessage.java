package izapr.t6v.reds;

import izapr.t6v.post.SecretMessage;

public class RedSecretMessage extends SecretMessage {

    public RedSecretMessage(String senderAddress, String recipientAddress, String message) {
        super(senderAddress, recipientAddress, message);
    }

    @Override
    protected String getSecretMessage() {
        return super.getSecretMessage();
    }

}
