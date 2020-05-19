package izapr.t6v.blues;

import izapr.t6v.post.PostOffice;
import izapr.t6v.post.Postcard;

public class BlueEmbassy {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("==> Modrý");

        PostOffice.getInstance().send(
                new Postcard(
                        "Modrý",
                        "Červený",
                        "Dnes v noci zaútočíme na Zelený. "
                        + "Džte to v tajnosti, ať neztratíme moment překvapení."
                )
        );

        System.out.println();
    }

}
