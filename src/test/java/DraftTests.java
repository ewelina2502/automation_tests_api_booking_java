import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.get;

public class DraftTests extends Data {

    @Test
    public void getReturnListofParameter() {
        String contentType = "application/json";

        Response response = RestAssured.
                given().
                contentType(contentType).
                body(printJsonBooking()).
                when().
                post(urlBooking()).
                then().
                extract().
                response();

        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("Body :" + response.getBody().asString());

        int bookingid = response.jsonPath().getInt("bookingid");
        System.out.println("bookingid: "  + bookingid);

        String url_patch =  urlBooking() + "/" + bookingid;

        Response response_patch = RestAssured.
                given().
                contentType(contentType).
                body(printJsonPatchbooking()).
                cookie(cookies()).
                header("Authorization", authorization()).
                header("Cookie", cookies()).
                when().
                patch(url_patch).
                then().
                extract().
                response();

        Assert.assertEquals(response_patch.getStatusCode(),200);
        System.out.println("Body after Patch: " + response_patch.getBody().asString());

    }



}




