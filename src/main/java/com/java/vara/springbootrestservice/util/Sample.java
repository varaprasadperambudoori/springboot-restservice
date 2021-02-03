package com.java.vara.springbootrestservice.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.RequestSpecification;
import org.apache.commons.lang3.ObjectUtils;

import static com.jayway.restassured.RestAssured.given;

public class Sample {

    public static ValidatableResponse add (JsonNode payload) {
        return
                given()
                .body(payload)
                .when()
                .get("/students/Student1/courses")
                .then();
    }

    public static RequestSpecification requestSpecification = RestAssured.given()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .baseUri(host());

    private static String host() {

        return ObjectUtils.defaultIfNull(System.getProperty("http://localhost:8080"),"http://localhost:8080");

    }


    static RequestSpecification given(){
        return requestSpecification;
    }
}
