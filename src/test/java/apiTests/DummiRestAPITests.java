package apiTests;

import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.testng.Assert.assertEquals;

public class DummiRestAPITests {


    @BeforeClass
    public void startUp(){
        RestAssured.baseURI = "http://dummy.restapiexample.com";
    }

    @Test
    @Step("Get all employee positive test")
    public void getAllEmployeePositiveTest(){

        given().filter(new AllureRestAssured())
                .when()
                .get("/api/v1/employees")
                .then()
                .log().all()
                .statusCode(200)
                .assertThat()
                .body("status", Matchers.equalTo("success"))
                .body("data.id", Matchers.hasItems("1","2","3"));

    }

    @Test
    @Step("Get all employee negative test")
    public void getAllEmployeeNegativeTest(){
        given().filter(new AllureRestAssured())
                .when()
                .get("/api/v1/employee")
                .then()
                .log().all()
                .statusCode(404)
                .assertThat()
                .body("message", Matchers.equalTo("Error Occured! Page Not found, contact rstapi2example@gmail.com"));
    }

    @Test
    @Step("Get employee by id positive test")
    public void getEmployeeByIdPositiveTest(){
        given().filter(new AllureRestAssured())
                .when()
                .get("/api/v1/employee/3")
                .then()
                .log().all()
                .statusCode(200)
                .assertThat()
                .body("status", equalTo("success"))
                .body("message",equalTo("Successfully! Record has been fetched."))
                .body("data.id", equalTo(3));
    }

    @Test
    @Step("Get employee by id negative test")
    public void getEmployeeByIdNegativeTest(){
        given().filter(new AllureRestAssured())
                .when()
                .get("/api/v1/employee/0")
                .then()
                .log().all()
                .statusCode(400)
                .assertThat()
                .body("status", equalTo("error"))
                .body("message",equalTo("Not found record"))
                .body("errors", equalTo("id is empty"));
    }

    @Test
    @Step("Post employee positive test")
    public void postEmployeePositiveTest(){
        PostRequestModel postRequest = new PostRequestModel("Mike","5000","35");
        Employee employeeData = new Employee("Mike","5000","35");
        PostResponseModel expectedResponseBody = new PostResponseModel("success", employeeData,"Successfully! Record has been added.");

        PostResponseModel responseBodyObject = given()
                .filter(new AllureRestAssured())
                .header("Content-Type","application/json")
                .with()
                .log().all()
                .body(postRequest.toString())
                .when()
                .request("POST", "/api/v1/create")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .as(PostResponseModel.class);
        assertEquals(responseBodyObject,expectedResponseBody);
    }

    @Test
    @Step("Post employee negative test")
    public void postEmployeeNegativeTest(){

        PostRequestModel postRequest = new PostRequestModel("Mike","5000","35");
         given().filter(new AllureRestAssured())
                .header("Content-Type","application/json")
                .with()
                .log().all()
                .body(postRequest.toString())
                .when()
                .request("POST", "/api/v1/employee/1")
                .then()
                .log().all()
                 .assertThat()
                .statusCode(405);
    }

    @Test
    @Step("Delete employee positive test")
    public void deleteEmployeePositiveTest(){
        given().filter(new AllureRestAssured())
                .when()
                .delete("/api/v1/delete/4")
                .then()
                .statusCode(200)
                .assertThat()
                .body("status",equalTo("success"))
                .body("message",equalTo("Successfully! Record has been deleted"))
                .body("data", equalTo("4"));
    }

    @Test
    @Step("Delete employee negative test")
    public void deleteEmployeeNegativeTest(){
        given().filter(new AllureRestAssured())
                .when()
                .delete("/api/v1/delete/0")
                .then()
                .statusCode(400)
                .assertThat()
                .body("status",equalTo("error"))
                .body("message",equalTo("Not found record"))
                .body("errors", equalTo("id is empty"));
    }

    @Step("Update employee positive test")
    @Test
    public void updateEmployeeByIdPositiveTest(){

        PostRequestModel postRequest = new PostRequestModel("Mike","10000","35");
        Employee employeeData = new Employee("Mike","10000","35");
        PostResponseModel expectedResponseBody = new PostResponseModel("success", employeeData,"Successfully! Record has been updated.");
        PostResponseModel responseBodyObject =given()
                .filter(new AllureRestAssured())
                .header("Content-Type","application/json")
                .with()
                .log().all()
                .body(postRequest.toString())
                .when()
                .put("/api/v1/update/21")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .as(PostResponseModel.class);
        assertEquals(responseBodyObject,expectedResponseBody);
    }

    @Test
    @Step("Update employee negative test")
    public void updateEmployeeByIdNegativeTest(){

        PostRequestModel postRequest = new PostRequestModel("Mike","10000","35");
        given().filter(new AllureRestAssured())
            .header("Content-Type","application/json")
            .with()
            .log().all()
            .body(postRequest.toString())
            .when()
            .put("/api/v1/delete/")
            .then()
            .log().all()
            .assertThat()
            .statusCode(301);
    }
}
