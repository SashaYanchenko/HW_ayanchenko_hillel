package app.test_reg;

import app.config.Specs;
import app.dto.reg.Register;
import app.dto.reg.SuccessReg;
import app.dto.reg.UnSuccessReg;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class ApiTestReg {
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
}
