import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import models.*;

public class MistralApiClient {

    private static final String BASE_URL = "https://api.mistral.ai/v1";
    private final HttpClient httpClient;

    public MistralApiClient() {
        this.httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }
    protected CompletableFuture<String> sendPostRequestAsync(String endpoint, String requestBodyJson) throws Exception  {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + endpoint))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBodyJson))
                .build();

        return httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body);
    }

    protected CompletableFuture<String> sendGetRequestAsync(String endpoint) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + endpoint))
                .GET() // This sets the method to GET
                .build();

        return httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body);
    }

    /*===================
    * ===================
    * ===================*/
/* TODO:
    public CompletableFuture<ChatCompletionResponse> createChatCompletionAsync(ChatCompletionRequest request) {
     }

    public CompletableFuture<EmbeddingResponse> createEmbeddingAsync(EmbeddingRequest request) {
     }

    public CompletableFuture<ModelList> listModelsAsync() {
     }
 */

}
