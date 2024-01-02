package dto.request;

import models.Message;

import java.util.List;

public class ChatCompletionRequest {
    private String requestModel;
    private List<Message> message;
    private Double temperature = 0.7;
    private Double top_p = 1.0;
    private Integer max_tokens = null;
    private boolean stream = false;
    private boolean safe_mode = false;
    private Integer random_seed = null;


    public String getRequestModel() {
        return requestModel;
    }

    public void setRequestModel(String requestModel) {
        this.requestModel = requestModel;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getTop_p() {
        return top_p;
    }

    public void setTop_p(Double top_p) {
        this.top_p = top_p;
    }

    public Integer getMax_tokens() {
        return max_tokens;
    }

    public void setMax_tokens(Integer max_tokens) {
        this.max_tokens = max_tokens;
    }

    public boolean isStream() {
        return stream;
    }

    public void setStream(boolean stream) {
        this.stream = stream;
    }

    public boolean isSafe_mode() {
        return safe_mode;
    }

    public void setSafe_mode(boolean safe_mode) {
        this.safe_mode = safe_mode;
    }

    public Integer getRandom_seed() {
        return random_seed;
    }

    public void setRandom_seed(Integer random_seed) {
        this.random_seed = random_seed;
    }
}
/* messages:
          description: >
            The prompt(s) to generate completions for, encoded as a list of dict
            with role and content. The first prompt role should be `user` or
            `system`.*/