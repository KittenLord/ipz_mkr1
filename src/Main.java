package mkr1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        IMessage a = new Message("Hello      everyone!    How    are    you?");
        IMessage b = new CompressedMessage(a);
        IMessage c = new TimestampedMessage(b, new Date());
        IMessage d = new SignedMessage(c, "Vanya Braslavets");
        IMessage e = new EncryptedMessage(d);

        System.out.println(a.getContent() + "\n");
        System.out.println(b.getContent() + "\n");
        System.out.println(c.getContent() + "\n");
        System.out.println(d.getContent() + "\n");
        System.out.println(e.getContent() + "\n");

    }


}
