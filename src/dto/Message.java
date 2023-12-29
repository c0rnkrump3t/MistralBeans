package dto;

public class Message {
    Role role;
    private String content;

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

    public enum Role{
        USER, ASSISTANT
    }
}
