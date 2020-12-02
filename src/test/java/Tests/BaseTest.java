package Tests;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public static RequestSpecification requestSpecification;
    public static ResponseSpecification responseSpecification;

    public static RequestSpecification userRequestSpecification;
    public static ResponseSpecification userResponseSpecification;

    @BeforeClass
    public static void createRequestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("http://dummy.restapiexample.com/api/v1/")
                .build();
    }

    @BeforeClass
    public static void createResponseSpecification() {
        responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();
    }

    @BeforeClass
    public static void createUserRequestSpecification() {
        userRequestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://gorest.co.in/public-api/")
                .build();
    }

    @BeforeClass
    public static void createUserResponseSpecification() {
        userResponseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200).
                build();
    }

}
