package net.troja.eve.esi;

import net.troja.eve.esi.auth.OAuth;
import okhttp3.OkHttpClient;

public class ApiClientBuilder {

    private String clientID = null;
    private String clientSecret = null;
    private String refreshToken = null;
    private String accessToken;
    private String userAgent;
    private OkHttpClient okHttpClient;

    public ApiClient build() {
        ApiClient client = new ApiClient();

        // Set default User-Agent.
        String systemUserAgent = System.getProperty("http.agent");
        if (userAgent != null && !userAgent.isEmpty()) {
            client.setUserAgent(userAgent);
        } else if (systemUserAgent != null && !systemUserAgent.isEmpty()) {
            client.setUserAgent(systemUserAgent);
        } else {
            client.setUserAgent("eve-esi/slack:@goldengnu");
        }
        // Set auth
        final OAuth auth = (OAuth) client.getAuthentication("evesso");
        auth.setAuthWeb(clientID, clientSecret, refreshToken); //Some of the values may be null, that is okay and by design
        if (accessToken != null) {
            auth.setAccessToken(accessToken);
        }
        if (okHttpClient != null) {
            client.setHttpClient(okHttpClient);
        }
        return client;
    }

    public ApiClientBuilder authWeb(String clientID, String clientSecret) {
        this.clientID = clientID;
        this.clientSecret = clientSecret;
        return this;
    }

    public ApiClientBuilder authDesktop(String clientID) {
        this.clientID = clientID;
        return this;
    }

    public ApiClientBuilder clientID(String clientID) {
        this.clientID = clientID;
        return this;
    }

    public ApiClientBuilder clientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public ApiClientBuilder refreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    public ApiClientBuilder accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public ApiClientBuilder userAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public ApiClientBuilder okHttpClient(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
        return this;
    }

}
