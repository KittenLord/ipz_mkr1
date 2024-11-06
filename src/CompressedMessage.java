package mkr1;

public class CompressedMessage implements IMessage {

    private IMessage baseMessage;
    public String getContent() { return compress(baseMessage.getContent()); }

    private String compress(String uncompressed) {

        StringBuilder compressed = new StringBuilder();
        boolean lastCharacterIsSpace = false;
        for(int i = 0; i < uncompressed.length(); i++) {

            char c = uncompressed.charAt(i);
            if(c == ' ') {
                if(lastCharacterIsSpace) continue;
                lastCharacterIsSpace = true;
            }
            else {
                lastCharacterIsSpace = false;
            }

            compressed.append(c);

        }

        return compressed.toString();

    }

    public CompressedMessage(IMessage baseMessage) {
        this.baseMessage = baseMessage;
    }

}
