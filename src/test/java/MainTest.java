import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class MainTest {

    @Test
    public void testHelloEndpoint() {
        RestAssured.given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hi there!"));
    }

    @Test
    public void testFailHelloEndpoint() {
        RestAssured.given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Oh there you are!"));
    }
}