package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class restAssuredPutRequest {
    @Test
    public void putRest() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{  \"id\": 0,  \"category\": {    \"id\": 0,    \"name\": \"string\"  },  \"name\": \"doggie\",  \"photoUrls\": [    \"string\"  ],  \"tags\": [    {      \"id\": 0,      \"name\": \"string\"    }  ],  \"status\": \"available\"}")
                .when()
                .put("/pet");
        assertEquals(200, response.statusCode());
        System.out.println("PUT Response\n" + response.asString());
    }
}
