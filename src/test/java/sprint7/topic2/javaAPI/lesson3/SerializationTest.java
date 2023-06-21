package sprint7.topic2.javaAPI.lesson3;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class SerializationTest {

    @Before
    public void setUp() {
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru";
    }

    @Test
    public void createNewPlaceAndCheckResponse() {
        Card card = new Card(
                "Интересное место",
                "https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/photoSelenide.jpg"
        );

        given()
                .header("Content-type", "application/json")
                .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDU1MTU3ODI4YTdlZTAwM2RkOWU3OWUiLCJpYXQiOjE2ODcxODA1NjksImV4cCI6MTY4Nzc4NTM2OX0.E1MOyd2704Jbncy4C2TxFw7XnLRo2HNrDjCWYYIx79I")
                .and()
                .body(card)
                .when()
                .post("/api/cards")
                .then()
                .statusCode(201)
                .and()
                .assertThat().body("data._id", notNullValue());
    }
}
