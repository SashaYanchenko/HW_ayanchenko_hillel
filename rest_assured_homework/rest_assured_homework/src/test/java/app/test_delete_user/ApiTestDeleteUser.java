package app.test_delete_user;

import app.config.Specs;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiTestDeleteUser {
    private String baseUrl = "https://reqres.in/";

    @Test
    public void TestDeleteUser() {
        Specs.setSpecs(Specs.requestSpec(baseUrl), Specs.responseSpec204());
        given()
                .when()
                .delete("api/users/2")
                .then().log().all();
    }
}
