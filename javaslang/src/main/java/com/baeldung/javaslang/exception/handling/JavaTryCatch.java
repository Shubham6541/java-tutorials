package com.nklkarthi.javaslang.exception.handling;

import com.nklkarthi.javaslang.exception.handling.client.ClientException;
import com.nklkarthi.javaslang.exception.handling.client.HttpClient;
import com.nklkarthi.javaslang.exception.handling.client.Response;

public class JavaTryCatch {
    private HttpClient httpClient;

    public JavaTryCatch(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Response getResponse() {
        try {
            return httpClient.call();
        } catch (ClientException e) {
            return null;
        }
    }
}
