package izapr.t6v.blues;

import izapr.t6v.post.PostOffice;
import izapr.t6v.reds.RedSecretMessage;

public class BlueEmbassy {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("==> Modrý");

        PostOffice.getInstance().send(
                new RedSecretMessage(
                        "Modrý",
                        "Červený",
                        "Dnes v noci zaútočíme na Zelený. "
                        + "Džte to v tajnosti, ať neztratíme moment překvapení."
                )
        );

        System.out.println();
    }

}
