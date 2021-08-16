package de.cdp.bi.client;

import de.cdp.bi.config.ApplicationConfig;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


@Component
@RequiredArgsConstructor
public class CdpHttpAsyncClient {

    private final ApplicationConfig config;

    private static final Logger LOGGER = LoggerFactory.getLogger(CdpHttpAsyncClient.class);


    public List<String> getCdp(String userId) throws InterruptedException, ExecutionException, TimeoutException {

        LOGGER.trace("Retrieve data Tigergraph");
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(getUrlBuilder(userId)))
                .setHeader("Content-Type", "application/json")
                .build();

        HttpClient httpAsyncClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(1))
                .build();


        // sendAsync(): Sends the given request asynchronously using this client with the given response body handler.
        CompletableFuture<HttpResponse<String>> asyncResponse = httpAsyncClient.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        String asyncResultBody = asyncResponse.thenApply(HttpResponse::body).get(config.getGraphDbConnectTimeoutMs(), TimeUnit.MILLISECONDS);
        LOGGER.trace("Connection Succesful");

        return getFormattedStringList(asyncResultBody);
    }

    private List<String> getFormattedStringList(String body) {
        String substring = body.substring(1, body.length() - 1);
        return Arrays.asList(substring.split(",", -1));
    }

    private String getUrlBuilder(String userId) {

        return new StringBuilder()
                .append(config.getGraphDbBaseUrl())
                .append(String.format("?userId=%s", userId))
                .toString();
    }
}
