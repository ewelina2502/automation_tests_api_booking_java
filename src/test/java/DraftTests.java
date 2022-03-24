import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

import static io.restassured.RestAssured.get;

public class DraftTests extends Data {

    @Test
    public void postWithJson() {
        File file = new File("C:\\Users\\eweli\\IdeaProjects\\automation_tests_api_booking_java\\src\\test\\java\\create_booking.json");
        String contentType = "application/json";

        Response response = RestAssured.
                given().
                contentType(contentType).
                body(file).
                when().
                post(urlBooking()).
                then().
                extract().
                response();

        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("Body :" + response.getBody().asString());

    }


}




