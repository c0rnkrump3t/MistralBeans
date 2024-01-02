package models;
//  Used for ChatCompletionRequest  //
public class Message {
    private Role role;
    private String content;


    public enum Role{
        SYSTEM, USER, ASSISTANT
    }

    public Message(Role role, String content) {
        this.role = role;
        this.content = content;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
