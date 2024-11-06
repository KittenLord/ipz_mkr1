package mkr1;

import java.util.Date;

public class TimestampedMessage implements IMessage {

    private IMessage baseMessage;
    private String timestamp;
    public String getContent() { return baseMessage.getContent() + "\nSent at: " + timestamp; }

    public TimestampedMessage(IMessage baseMessage, Date timestamp) {
        this.baseMessage = baseMessage;
        this.timestamp = timestamp.toString();
    }

}
