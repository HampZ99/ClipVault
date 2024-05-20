package com.yharnam.clipvault.service;

import com.google.gson.Gson;
import com.yharnam.clipvault.model.AccessToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TwitchResource {
    private static final String CLIPS_URI = "https://api.twitch.tv/helix/clips?broadcaster_id=";
    private static final String TOKEN_URI = "https://id.twitch.tv/oauth2/token";
    private static final String FILEPATH = "C:\\Users\\hampz\\workspace\\ClipVault\\src\\main\\resources\\requestBody.json";
    private static final String CLIENT_ID = "Client-Id";
    private static final String AUTH = "Authorization";
    private static final String BEARER = "Bearer ";

    private static final Logger logger = LoggerFactory.getLogger(TwitchResource.class);

    private static HttpRequest getAccessToken() throws IOException {
        Path path = Paths.get(FILEPATH);
        String jsonBody = new String(Files.readAllBytes(path));
        try {
            return HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                    .uri(new URI(TOKEN_URI))
                    .header("Content-Type", "application/json")
                    .build();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    private static HttpResponse<String> getAccessTokenResponse() {
        try {
            logger.info("Sending request to Twitch API to retrieve Access Token");
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(getAccessToken(), HttpResponse.BodyHandlers.ofString());
            logger.debug("Received response from Twitch API: {}", response);
            return response;
        } catch (IOException | InterruptedException e) {
            logger.error("Error occurred while sending request to Twitch API", e);
            throw new RuntimeException(e);
        }
    }

    private static HttpRequest getClipsRequest() {
        try {
            Gson gson = new Gson();
            AccessToken accessToken = gson.fromJson(getAccessTokenResponse().body(), AccessToken.class);

            return HttpRequest.newBuilder()
                    .GET()
                    .uri(new URI(CLIPS_URI + "136259980"))
                    .header(CLIENT_ID, "k0u4amk2scdbpynkf0ullqsmaz3027")
                    .header(AUTH, BEARER + accessToken.getAccessToken())
                    .build();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public static HttpResponse<String> getClipsResponse() {
        try {
            logger.info("Sending request to Twitch API to retrieve clips data");
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(getClipsRequest(), HttpResponse.BodyHandlers.ofString());
            logger.debug("Received response from Twitch API: {}", response);
            return response;
        } catch (IOException | InterruptedException e) {
            logger.error("Error occurred while sending request to Twitch API", e);
            throw new RuntimeException(e);
        }
    }
}
