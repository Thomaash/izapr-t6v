package izapr.t6v.greens;

import izapr.t6v.post.Message;
import izapr.t6v.post.PostOffice;
import izapr.t6v.reds.RedSecretMessage;
import java.util.List;

public class GreenEmbassy {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("==> Zelený");

        // Neni nad to číst si cizí poštu.
        final List<Message> messages = PostOffice.getInstance().retrieve("Červený");
        for (Message message : messages) {
            if (message instanceof RedSecretMessage) {
                final RedSecretMessage redSecretMessage = (RedSecretMessage) message;
                System.out.println(redSecretMessage);
                // Z tohodle balíčku nelze.
                // System.out.println(redSecretMessage.getMessage());
            } else {
                System.out.println(message);
            }
            System.out.println();
        }

        System.out.println();
    }

}
