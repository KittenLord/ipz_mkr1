package mkr1;

import java.util.Base64;

public class EncryptedMessage extends DecoratedMessage {

    public String getContent() { return encrypt(baseMessage.getContent()); }

    private String encrypt(String plainText) {

        // very secure 👍
        byte[] bytes = plainText.getBytes();
        return Base64.getEncoder().encodeToString(bytes);

    }

    public EncryptedMessage(IMessage baseMessage) {
        this.baseMessage = baseMessage;
    }

}
