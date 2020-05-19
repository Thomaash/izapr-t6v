package izapr.t6v.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PostOffice {

    private static final PostOffice SINGLETON = new PostOffice();

    public static PostOffice getInstance() {
        return PostOffice.SINGLETON;
    }

    private final HashMap<String, List<Message>> messages = new HashMap<>();

    public void send(final Message message) {
        final String recipientAddress = message.getRecipientAddress();
        if (!this.messages.containsKey(recipientAddress)) {
            this.messages.put(recipientAddress, new ArrayList<>());
        }

        this.messages.get(recipientAddress).add(message);
    }

    public List<Message> retrieve(final String address) {
        if (this.messages.containsKey(address)) {
            return this.messages.remove(address);
        } else {
            return new ArrayList<>();
        }
    }

}
