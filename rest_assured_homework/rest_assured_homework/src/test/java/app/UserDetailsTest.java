package app;

import app.config.Specs;
import app.dto.Reg.Register;
import app.dto.Reg.SuccessReg;
import app.dto.Reg.UnSuccessReg;
import app.dto.list_of_colors.ColorsData;
import app.dto.update_user.UserTime;
import app.dto.update_user.UserTimeResponse;
import org.testng.annotations.Test;

import java.time.Clock;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.*;
import static org.testng.AssertJUnit.assertEquals;

public class UserDetailsTest {
    private String baseUrl = "https://reqres.in/";


    @Test
    public void testSuccessReg() {
        Specs.setSpecs(Specs.requestSpec(baseUrl), Specs.responseSpec200());
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        Register user = new Register("eve.holt@reqres.in", "pistol");
        SuccessReg successReg = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(SuccessReg.class);
        assertEquals(id, successReg.getId());
        assertEquals(token, successReg.getToken());
    }

    @Test
    public void testUnSuccessReg() {
        Specs.setSpecs(Specs.requestSpec(baseUrl), Specs.responseSpec400());
        Register user = new Register("sydney@fife", "");
        UnSuccessReg unSuccessReg = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(UnSuccessReg.class);
        assertEquals("Missing password", unSuccessReg.getError());
    }

    @Test
    public void TestSortedColors() {
        Specs.setSpecs(Specs.requestSpec(baseUrl), Specs.responseSpec200());
        List<ColorsData> colors = given()
                .when()
                .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ColorsData.class);
        List<Integer> years = colors.stream().map(ColorsData::getYear).collect(Collectors.toList());
        List<Integer> sortedYears = years.stream().sorted().collect(Collectors.toList());
        assertEquals(sortedYears, years);
        System.out.println(years);
        System.out.println(sortedYears);
    }

    @Test
    public void TestDeleteUser() {
        Specs.setSpecs(Specs.requestSpec(baseUrl), Specs.responseSpec204());
        given()
                .when()
                .delete("api/users/2")
                .then().log().all();
    }

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
