package models;

import dto.Choice;

import java.util.List;

public class ChatCompletionResponse {
    private String id;
    private String ObjectPropertyName;
    private long created;
    private String model;
    private List<Choice> choices;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
}
