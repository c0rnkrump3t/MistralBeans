package dto;

public class Choice {
    private int integer;
    private Message message;
    private String content;
    private Finish_Reason finish_reason;

    private Usage usage;

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Finish_Reason getFinish_reason() {
        return finish_reason;
    }

    public void setFinish_reason(Finish_Reason finish_reason) {
        this.finish_reason = finish_reason;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public enum Finish_Reason{
        STOP, LENGTH, MODEL_LENGTH;
    }
}
