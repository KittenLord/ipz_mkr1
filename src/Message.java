package mkr1;

public class Message implements IMessage {

    private String content;
    public String getContent() { return content; }

    public Message(String content) {
        this.content = content;
    }

}
