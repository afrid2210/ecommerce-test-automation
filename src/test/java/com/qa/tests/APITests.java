package com.qa.tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITests {

    private String apiBaseUrl = "https://jsonplaceholder.typicode.com";

    @Test(description = "Get user list and verify response")
    public void testGetUsersList() {
        given()
            .baseUri(apiBaseUrl)
        .when()
            .get("/users")
        .then()
            .statusCode(200)
            .body("size()", greaterThan(0))
            .body("[0].id", equalTo(1))
            .body("[0].name", equalTo("Leanne Graham"));
    }

    @Test(description = "Create new post and verify response")
    public void testCreatePost() {
        String requestBody = "{\n" +
            "  \"userId\": 1,\n" +
            "  \"title\": \"Test Post\",\n" +
            "  \"body\": \"This is a test\"\n" +
            "}";

        given()
            .baseUri(apiBaseUrl)
            .contentType("application/json")
            .body(requestBody)
        .when()
            .post("/posts")
        .then()
            .statusCode(201)
            .body("id", notNullValue())
            .body("title", equalTo("Test Post"));
    }
}
