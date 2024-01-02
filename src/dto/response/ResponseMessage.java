package dto.response;

public class ResponseMessage {
    Role role;
    private String content;
    public ResponseMessage(Role role, String content){
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

    public enum Role{
        USER, ASSISTANT
    }
}
