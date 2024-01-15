package com.DC.utilities;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class SecurityAPI {
    static ReadConfig config = ReadConfig.getInstance();

    private static String payload = "{\r\n" +
            "    \"username\": \"" + config.getBearerUserName() + "\",\r\n" +
            "    \"password\":\"" + config.getBearerPassword() + "\"\r\n" +
            "}";

    public static String getTokenAPI() throws Exception {
        String token = null;
        RestAssured.baseURI = config.getBearerURL();

        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("Content-Type", "application/json");

        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.headers(headerMap);
        httpRequest.body(payload);

        // Response object
        Response response = httpRequest.request(Method.POST);

        //Retrieve the token
        if (response.statusCode() == HttpStatus.SC_OK) {
            token = response.jsonPath().getString("accessToken");
        }

        return token;
    }


}

