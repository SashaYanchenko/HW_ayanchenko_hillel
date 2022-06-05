package app.test_list_of_colors;

import app.config.Specs;
import app.dto.list_of_colors.ColorsData;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class ApiTestColorData {
    private String baseUrl = "https://reqres.in/";

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
}
