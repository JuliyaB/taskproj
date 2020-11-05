package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static io.restassured.RestAssured.given;

public class restAssuredPostRequest {

    @Test
    public void postRestOrder() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{  \"id\": 0,  \"petId\": 0,  \"quantity\": 0,  \"shipDate\": \"2020-09-23T14:53:48.887Z\",  \"status\": \"placed\",  \"complete\": false}")
                .when()
                .post("/store/order");
        assertEquals(200, response.statusCode());
        System.out.println("POST Response Order\n" + response.asString());
    }

    @Test
    public void postRestNewPet() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{  \"id\": 0,  \"category\": {    \"id\": 0,    \"name\": \"string\"  },  \"name\": \"doggie\",  \"photoUrls\": [    \"string\"  ],  \"tags\": [    {      \"id\": 0,      \"name\": \"string\"    }  ],  \"status\": \"available\"}")
                .when()
                .post("/pet");
        assertEquals(200, response.statusCode());
        System.out.println("POST Response New Pet\n" + response.asString());
    }
}
