package dto.response;

import java.util.List;

import models.Usage;

public class EmbeddingResponse {
    private String id;
    private String object;
    private List<EmbeddingDataItem> data;
    private String model;
    private Usage usage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<EmbeddingDataItem> getData() {
        return data;
    }

    public void setData(List<EmbeddingDataItem> data) {
        this.data = data;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }
}
    

