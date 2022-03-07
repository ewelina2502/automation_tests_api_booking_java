import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class DraftTests extends Data {

    @Test
    public void getBookingsDataFromJsonResponse() {
        String contentType = "application/json";

        Response response = RestAssured.
                given().
                contentType(contentType).
                body(printAssertJsonBooking()).
                when().
                post(urlBooking()).
                then().
                extract().
                response();

        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("Body :" + response.getBody().asString());
        int bookingid = response.jsonPath().getInt("bookingid");
        System.out.println("bookingid: " + bookingid);

        Response response_get = get("https://restful-booker.herokuapp.com/booking/" + bookingid);

        System.out.println("status code: " + response_get.getStatusCode());
        System.out.println("Body :" + response.getBody().asString());

        String firstname = response_get.jsonPath().get("firstname");
        Assert.assertEquals("Aldona", firstname);

    }
}




