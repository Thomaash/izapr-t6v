package izapr.t6v.greens;

import izapr.t6v.post.Message;
import izapr.t6v.post.PostOffice;
import java.util.List;

public class GreenEmbassy {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("==> Zelený");

        // Neni nad to číst si cizí poštu.
        final List<Message> messages = PostOffice.getInstance().retrieve("Červený");
        for (Message message : messages) {
            System.out.println(message);
            System.out.println();
        }

        System.out.println();
    }

}
