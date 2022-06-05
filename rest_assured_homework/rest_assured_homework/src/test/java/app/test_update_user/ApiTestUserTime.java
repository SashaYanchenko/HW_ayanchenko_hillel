package app.test_update_user;

import app.config.Specs;
import app.dto.update_user.UserTime;
import app.dto.update_user.UserTimeResponse;
import org.testng.annotations.Test;

import java.time.Clock;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class ApiTestUserTime {
    private String baseUrl = "https://reqres.in/";

    @Test
    public void TestTimeUpdate() {
        Specs.setSpecs(Specs.requestSpec(baseUrl), Specs.responseSpec200());
        UserTime userTime = new UserTime("morpheus", "zion resident");
        UserTimeResponse userTimeResponse = given()
                .body(userTime)
                .when()
                .put("api/users/2")
                .then().log().all()
                .extract().as(UserTimeResponse.class);
        String regex = "(.{5})$";
        String currentTime = Clock.systemUTC().instant().toString().replaceAll(regex, "");
        assertEquals(currentTime, userTimeResponse.getUpdatedAt().replaceAll(regex, ""));
    }
}
