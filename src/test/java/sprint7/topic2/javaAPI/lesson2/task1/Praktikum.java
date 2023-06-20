package sprint7.topic2.javaAPI.lesson2.task1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static sprint7.topic2.javaAPI.lesson2.Setting.*;

public class Praktikum {

    @Before
    public void setUp() {
        RestAssured.baseURI = BASE_URI;
    }

    @Test
    public void updateProfileAndCheckStatusCode() {
        File json = new File("src/test/resources/updateProfile.json");
        Response response =
                given()
                        .header("Content-type", "application/json")
                        .auth().oauth2(TOKEN)
                        .and()
                        .body(json)
                        .when()
                        .patch(PROFILE);
        response.then().assertThat()
                .statusCode(200)
                .and()
                .body("data.name", equalTo("Василий Васильев"));
    }
}
