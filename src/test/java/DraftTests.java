import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DraftTests extends Data {

    @Test
    public void postAndPatchBooking() {
        String url = urlBooking();
        String contentType = "application/json";
        String bodyData = printJsonBooking();

        Response response = RestAssured.
                given().
                contentType(contentType).
                body(bodyData).
                when().
                post(url).
                then().
                extract().
                response();

        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("Body :" + response.getBody().asString());
        int bookingid = response.jsonPath().getInt("bookingid");
        System.out.println("bookingid: "  + bookingid);

        String url2 =  urlBooking() + "/" + bookingid;
        String cookies = cookies();
        String authorization = authorization();
        String bodyDataPatch = printJsonPatchbooking();

        Response response_patch = RestAssured.
                given().
                contentType(contentType).
                body(bodyDataPatch).
                cookie(cookies).
                header("Authorization", authorization).
                header("Cookie", cookies).
                when().
                patch(url2).
                then().
                extract().
                response();

        Assert.assertEquals(response_patch.getStatusCode(),200);
        System.out.println("status: " + response_patch.getBody().asString());
    }
}
