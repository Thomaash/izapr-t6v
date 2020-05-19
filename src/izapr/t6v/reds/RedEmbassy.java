package izapr.t6v.reds;

import izapr.t6v.post.Message;
import izapr.t6v.post.PostOffice;
import java.util.List;

public class RedEmbassy {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("==> Červený");

        final List<Message> messages = PostOffice.getInstance().retrieve("Červený");
        for (Message message : messages) {
            if (message instanceof RedSecretMessage) {
                final RedSecretMessage redSecretMessage = (RedSecretMessage) message;
                System.out.println(message);
                System.out.println(redSecretMessage.getSecretMessage());
            } else {
                System.out.println(message);
            }
            System.out.println();
        }

        System.out.println();

        final RedSecretMessage rsm = new RedSecretMessage("Modrý", "Červený", "Hi!");
        rsm.getSecretMessage();
    }

}
