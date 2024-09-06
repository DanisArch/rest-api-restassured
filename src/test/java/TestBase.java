import io.restassured.RestAssured;
import jdk.jfr.ContentType;
import org.junit.jupiter.api.BeforeAll;

import javax.swing.text.AbstractDocument;

import static io.restassured.RestAssured.given;

public class TestBase {
    static String url = "https://reqres.in";

    @BeforeAll
    public static void  setup() {
        RestAssured.baseURI = url;
        RestAssured.basePath ="api";
        RestAssured.requestSpecification() = given().accept(ContentType.ANY);
    }
}
