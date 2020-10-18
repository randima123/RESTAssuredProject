package Tests;

import Models.EmployeeCreateResponse;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class EmployeeAPITest extends BaseTest {

    @Test
    public void requestEmployeeId1_logRequestAndResponseDetsils() {

        given().
                spec(requestSpecification).log().all().
                when().get("employee/1").
                then().spec(responseSpecification).
                and().log().body();
    }

    @Test
    public void requestEmployeeId1_checkContentType_expectsJson() {

        given().
                spec(requestSpecification).
                when().get("employee/1").
                then().assertThat().
                contentType(ContentType.JSON);
    }

    @Test
    public void requestEmployeeId1_checkEmployeeName_expectsTigerNixon() {

        given().
                spec(requestSpecification).
                when().get("employee/1").
                then().assertThat().
                body("data.employee_name", equalTo("Tiger Nixon"));
    }

    @Test
    public void requestEmployeeList_checkEmployeeName_expectsTigerNixon() {

        given().
                spec(requestSpecification).
                when().get("employees").
                then().assertThat().
                body("data.employee_name", hasItem("Tiger Nixon"));
    }

    @Test
    public void requestEmployeeList_checksize_expects24() {

        given().
                spec(requestSpecification).
                when().get("employees").
                then().assertThat().
                body("data", hasSize(24));
    }

    @Test
    public void getEmployeeData_validateEmployeeId() {

        EmployeeCreateResponse employeeCreateResponse =
        given().
                spec(requestSpecification).
                when().
                get("employee/1").
                as(EmployeeCreateResponse.class);

        System.out.println(employeeCreateResponse.getData().getName());
        Assert.assertEquals(
                "Tiger Nixon",
                employeeCreateResponse.getData().getName()
        );

    }

    @Test
    public void extractEmployeeData_validateEmployeeId() {

        String employeeName =
                given().
                        spec(requestSpecification).
                        when().
                        get("employee/1").
                        then().extract().
                        jsonPath().getString("data.employee_name");

        System.out.println(employeeName);
        Assert.assertEquals(
                "Tiger Nixon", employeeName
        );

    }


}
