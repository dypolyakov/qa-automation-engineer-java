package sprint7.topic2.javaAPI.lesson4.task3;

import io.restassured.RestAssured;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;
import sprint7.topic2.javaAPI.lesson4.task2.User;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class Praktikum {

    @Before
    public void setUp() {
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru";
    }

    @Test
    public void checkUserName() {
        User user =
                given()
                        .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDU1MTU3ODI4YTdlZTAwM2RkOWU3OWUiLCJpYXQiOjE2ODcxODA1NjksImV4cCI6MTY4Nzc4NTM2OX0.E1MOyd2704Jbncy4C2TxFw7XnLRo2HNrDjCWYYIx79I"
                        )
                        .get("/api/users/me")
                        .body().as(User.class);

        MatcherAssert.assertThat(user, notNullValue());

    }

}
