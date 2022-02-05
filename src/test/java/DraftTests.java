import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DraftTests extends Data {

    @Test
    public void postBooking() {
        String url = urlBooking();
        String contentType = "application/json";
        String body = printJsonBooking();

        Response response = RestAssured.
                given().
                contentType(contentType).
                body(body).
                when().
                post(url).
                then().
                extract().
                response();

        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println("Body :" + response.getBody().asString());
    }


}


