package sprint7.topic2.javaAPI.lesson1.task1;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Praktikum {

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDU1MTU3ODI4YTdlZTAwM2RkOWU3OWUiLCJpYXQiOjE2ODcxODA1NjksImV4cCI6MTY4Nzc4NTM2OX0.E1MOyd2704Jbncy4C2TxFw7XnLRo2HNrDjCWYYIx79I";

    @Before
    public void setUp() {
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru";
    }

    @Test
    public void checkCardsStatusCode() {
        given().auth().oauth2(token)
                .get("/api/cards")
                .then().statusCode(200);
    }
}
