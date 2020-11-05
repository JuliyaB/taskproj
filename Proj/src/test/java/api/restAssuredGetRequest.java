package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static io.restassured.RestAssured.given;

public class restAssuredGetRequest {
    @Test
    public void getRestStatusPending() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        Response response = given()
                .get("/pet/findByStatus?status=pending");
        assertEquals(200, response.statusCode());
        System.out.println("Get Response Finds Pets by status\n" + response.asString());
    }

    @Test
    public void getRestInventoriesStatus() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        Response response = given()
                .get("/store/inventory");
        assertEquals(200, response.statusCode());
        System.out.println("Get Response Returns pet inventories by status\n" + response.asString());
    }
}
