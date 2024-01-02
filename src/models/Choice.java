package models;

import dto.response.ResponseMessage;

public class Choice {
    private int integer;
    private ResponseMessage responseMessage;
    private String content;
    private Finish_Reason finish_reason;

    private Usage usage;

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public ResponseMessage getMessage() {
        return responseMessage;
    }

    public void setMessage(ResponseMessage responseMessage) {
        this.responseMessage = responseMessage;
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
