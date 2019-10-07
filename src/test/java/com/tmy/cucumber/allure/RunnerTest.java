package com.tmy.cucumber.allure;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.FileWriter;
import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {
                "pretty",
                "json:target/cucumber-report.json",
        },
        features = "src/test/resources/"
)
public class RunnerTest {

    @BeforeClass()
    public static void runTomcat() throws Exception {
//        RestAssured.baseURI = "http://localhost:8100/rest/raven/1.0/api/test";
//        Response response;
//
//        response = RestAssured
//                .given()
//                .header("Authorization", "Basic bXRvbWE6YWRtaW4=")
//                .contentType("application/json")
//                .when()
//                .queryParam("keys", "XA-1")
//                .get();
//
//        List<String> keys = response.jsonPath().get("key");
//        String fileName = keys.get(0) + ".feature";
//
//
//        List<String> definitions = response.jsonPath().get("definition");
//        String definition = definitions.get(0);
//
//
//        try (FileWriter writer = new FileWriter("src/test/resources/" + fileName)) {
//            writer.write("Feature: jira \n \n  Scenario: " + keys.get(0) + "\n");
//            writer.write(definition);
//        }

    }


}