package sprint7.topic2.javaAPI.lesson1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class Praktikum {

    private final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDU1MTU3ODI4YTdlZTAwM2RkOWU3OWUiLCJpYXQiOjE2ODcxODA1NjksImV4cCI6MTY4Nzc4NTM2OX0.E1MOyd2704Jbncy4C2TxFw7XnLRo2HNrDjCWYYIx79I";


    @Before
    public void setUp() {
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru";
    }

    @Test
    public void getMyInfoStatusCode() {
        given()
                .auth().oauth2(token)
                .get("/api/users/me")
                .then().statusCode(200);
    }

    @Test
    public void checkUserName() {
        given()
                .auth().oauth2(token)
                .get("/api/users/me")
                .then().assertThat().body("data.name", equalTo("Аристарх Сократович"));

    }

    @Test
    public void checkUserNameAndPrintResponseBody() {
        Response response = given().auth().oauth2(token).get("/api/users/me");
        response.then().assertThat().body("data.name", equalTo("Аристарх Сократович"));
        System.out.println(response.body().asString());
    }
}
