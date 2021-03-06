package com.arm.mbed.cloud.sdk.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.mockwebserver.MockResponse;
import com.squareup.okhttp.mockwebserver.MockWebServer;
import com.squareup.okhttp.mockwebserver.RecordedRequest;

import retrofit2.Call;
import retrofit2.http.GET;

public class TestApiClientWrapper {

    private static final String AN_ENDPOINT_PATH = "an/endpoint/";

    /**
     * Tests that the HTTP client wrapper works as expected by spawning a mock server and checking received requests.
     */
    @Test
    public void testClient() {
        try {
            MockWebServer server = new MockWebServer();
            server.enqueue(new MockResponse().setBody("hello, world!"));
            server.start();
            HttpUrl baseUrl = server.url("");
            ConnectionOptions opt = new ConnectionOptions("apikey");
            opt.setHost(baseUrl.toString());
            ApiClientWrapper clientWrapper = new ApiClientWrapper(opt);
            TestApiService testService = clientWrapper.createService(TestApiService.class);
            assertTrue(testService.getEndpointValue().execute().isSuccessful());
            RecordedRequest request = server.takeRequest();
            assertEquals("/" + AN_ENDPOINT_PATH, request.getPath());
            assertNotNull(request.getHeader("Authorization"));
            assertTrue(request.getHeader("Authorization").contains("Bearer"));
            assertNotNull(request.getHeader("User-Agent"));
            assertTrue(request.getHeader("User-Agent").contains(ApiClientWrapper.UserAgent.MBED_CLOUD_SDK_IDENTIFIER));
            server.shutdown();
        } catch (IOException | InterruptedException e) {
            fail(e.getMessage());
        }
    }

    public interface TestApiService {

        @GET(AN_ENDPOINT_PATH)
        Call<String> getEndpointValue();

    }

}
