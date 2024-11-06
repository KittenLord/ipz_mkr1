package mkr1;

import java.util.Base64;

public class EncryptedMessage implements IMessage {

    private IMessage baseMessage;
    public String getContent() { return encrypt(baseMessage.getContent()); }

    private String encrypt(String plainText) {

        // very secure 👍
        byte[] bytes = plainText.getBytes();
        String encrypted = Base64.getEncoder().encodeToString(bytes);
        return encrypted;

    }

    public EncryptedMessage(IMessage baseMessage) {
        this.baseMessage = baseMessage;
    }

}
