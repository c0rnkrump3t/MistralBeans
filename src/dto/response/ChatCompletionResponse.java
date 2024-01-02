package dto.response;
import models.Choice;
import models.Usage;
import java.util.List;

public class ChatCompletionResponse {
    private String id;

    private String ObjectPropertyName;

    private long created;

    private String responseModel;

    private List<Choice> choices;

    private Usage usage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjectPropertyName() {
        return ObjectPropertyName;
    }

    public void setObjectPropertyName(String objectPropertyName) {
        ObjectPropertyName = objectPropertyName;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getResponseModel() {
        return responseModel;
    }

    public void setResponseModel(String responseModel) {
        this.responseModel = responseModel;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
}
