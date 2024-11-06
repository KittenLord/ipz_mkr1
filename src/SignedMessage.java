package mkr1;

public class SignedMessage extends DecoratedMessage {

    private String signature;
    public String getContent() { return sign(baseMessage.getContent()); }

    private String sign(String plainText) {

        return plainText + "\nSigned by: " + signature;

    }

    public SignedMessage(IMessage baseMessage, String signature) {
        this.baseMessage = baseMessage;
        this.signature = signature;
    }

}
