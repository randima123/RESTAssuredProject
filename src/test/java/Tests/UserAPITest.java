package Tests;

import Models.User;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserAPITest extends BaseTest{

    @Test
    public void requestEmployeeId1_logRequestAndResponseDetails() {
        given().
                spec(userRequestSpecification).
                when().
                get("users/4").
                then().
                spec(userResponseSpecification).
                and().
                log().body();
    }

    @Test
    public void sendUser_checkStatusCode_expect200() {
        User user = new User();
        given().
                auth().preemptive().
                oauth2("a39f3fbe828081026ba834f8a1bdcfbbda658578d8920e8cf13a05aee5836edc").
                spec(userRequestSpecification).
                contentType(ContentType.JSON).
                body(user).
                log().all().
                when().
                post("users").
                then().
                log().all().
                spec(userResponseSpecification);
    }

    @Test
    public void updateUser_checkStatusCode_expect200() {
        User user = new User();
        given().
                auth().preemptive().
                oauth2("a39f3fbe828081026ba834f8a1bdcfbbda658578d8920e8cf13a05aee5836edc").
                spec(userRequestSpecification).
                contentType(ContentType.JSON).
                body(user).
                log().all().
                when().
                put("users/1329").
                then().
                log().all().
                spec(userResponseSpecification);
    }

    @Test
    public void deleteUser_checkStatusCode_expect200() {
        User user = new User();
        given().
                auth().preemptive().
                oauth2("a39f3fbe828081026ba834f8a1bdcfbbda658578d8920e8cf13a05aee5836edc").
                spec(userRequestSpecification).
                contentType(ContentType.JSON).
                body(user).
                log().all().
                when().
                delete("users/1329").
                then().
                log().all().
                spec(userResponseSpecification);
    }
}
