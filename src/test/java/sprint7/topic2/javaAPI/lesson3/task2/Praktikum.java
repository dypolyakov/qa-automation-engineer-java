package sprint7.topic2.javaAPI.lesson3.task2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import sprint7.topic2.javaAPI.lesson3.task1.Profile;

import static io.restassured.RestAssured.given;

public class Praktikum {
    @Before
    public void setUp() {
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru";
    }

    @Test
    public void updateProfile() {
        Profile profile = new Profile("Василий Васильев", "Самый крутой исследователь");

        Response response =
                given()
                .header("Content-type", "application/json")
                .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDU1MTU3ODI4YTdlZTAwM2RkOWU3OWUiLCJpYXQiOjE2ODcxODA1NjksImV4cCI6MTY4Nzc4NTM2OX0.E1MOyd2704Jbncy4C2TxFw7XnLRo2HNrDjCWYYIx79I")
                .and()
                .body(profile)
                .when()
                .patch("/api/users/me");

        response.then().statusCode(200);
    }
}
