package dto.request;

import java.util.List;

public class EmbeddingRequest {
    private String model;
    private List<String> input;
    private EncodingFormat encodingFormat;

    public EmbeddingRequest(String model, List<String> input, EncodingFormat encodingFormat) {
        this.model = model;
        this.input = input;
        this.encodingFormat = encodingFormat;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getInput() {
        return input;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }

    public EncodingFormat getEncodingFormat() {
        return encodingFormat;
    }

    public void setEncodingFormat(EncodingFormat encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public enum EncodingFormat {
        FLOAT 
    }
}
    

