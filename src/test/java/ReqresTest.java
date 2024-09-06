import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ReqresTest {

    String url = "https://reqres.in";

    @Test
    public void checkStatusCode() {
        given().
                baseUri(url).log().all().
        when().get("/api/users").
        then().log().all().assertThat().statusCode(200);
    }

    @Test
    public void addParamTest() {
        given().
                baseUri(url).log().all().
                when().param("page", 2).get("/api/users").
                then().log().all().assertThat().statusCode(200);
    }


}
