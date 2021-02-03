package com.java.vara.springbootrestservice;

import com.fasterxml.jackson.databind.JsonNode;
import com.java.vara.springbootrestservice.util.Sample;
import com.jayway.restassured.response.ValidatableResponse;
import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    JsonNode js ;

    @Test
    public void testsample(){

        ValidatableResponse response = Sample.add(js);

        Assert.assertTrue(response.toString().equalsIgnoreCase("Course1"));
    }
}
