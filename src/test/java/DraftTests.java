import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DraftTests extends Data {

    @BeforeTest
    public static int postBookingBeforeTest() {
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

        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println("Body :" + response.getBody().asString());
        return response.jsonPath().getInt("bookingid");
    }

    @Test
    public void getIdBeforeTestAndPut() {
        String contentType = "application/json";

        String put_url = urlBooking() + "/"+ postBookingBeforeTest();
        String cookies = cookies();
        String authorization = authorization();
        String bodyDataPut = printJsonPutBooking();

        Response response_put = RestAssured.
                given().
                contentType(contentType).
                body(bodyDataPut).
                cookie(cookies).
                header("Authorization", authorization).
                header("Cookie", cookies).
                when().
                put(put_url).
                then().
                extract().
                response();

        Assert.assertEquals(response_put.getStatusCode(),200);
        System.out.println("Body after put: " + response_put.getBody().asString());
    }


    }




