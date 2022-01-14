import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class Booking extends Data {

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

    @Test
    public void getBookingsReturns() {
        Response response = get(urlBooking());

//        System.out.println("Response :" + response.asString());
        System.out.println("status code: " + response.getStatusCode());
        System.out.println("Body :" + response.getBody().asString());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

/*    @Test
      public void getBookingId() {
          Response response = get("https://restful-booker.herokuapp.com/booking/4");

          System.out.println("Response :" + response.asString());
          System.out.println("status code: " + response.getStatusCode());
          System.out.println("Body :" + response.getBody().asString());

          int statusCode = response.getStatusCode();
          Assert.assertEquals(statusCode, 200);
      }

 */

    @Test
    public void getBookingsStatus() {
        given().
                get(urlBooking()).
                then().
                statusCode(200);
    }
    @Test
    public void getTokenAndPut() {
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
        int bookingid = response.jsonPath().getInt("bookingid");
        System.out.println("bookingid: "  + bookingid);

        String put_url = "https://restful-booker.herokuapp.com/booking/" + bookingid;
        String cookies = "token=f61416de503d436";
        String authorization = "Basic YWRtaW46cGFzc3dvcmQxMjM=";

        String bodyData = printJsonBooking();

        Response response_put = RestAssured.
                given().
                contentType(contentType).
                cookie(cookies).
                header("Authorization", authorization).
                header("Cookie", cookies).
                body(bodyData).
                when().
                put(put_url).
                then().
                extract().
                response();

        Assert.assertEquals(response_put.getStatusCode(),200);
        System.out.println("Body :" + response.getBody().asString());
    }

    @Test
    public void postAndPatchBooking() {
        String url = "https://restful-booker.herokuapp.com/booking";
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

        String url2 = "https://restful-booker.herokuapp.com/booking/" + bookingid;
        String cookies = "token=f61416de503d436";
        String authorization = "Basic YWRtaW46cGFzc3dvcmQxMjM=";
        String bodyDataPatch = printJsonPatchbooking();

        Response response2 = RestAssured.
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

        Assert.assertEquals(response2.getStatusCode(),200);
        System.out.println("status: " + response2.getBody().asString());
    }

    @Test
    public void postAndDeleteBooking() {
        String url = "https://restful-booker.herokuapp.com/booking";
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
//        System.out.println("Body :" + response.getBody().asString());
        int bookingid = response.jsonPath().getInt("bookingid");
        System.out.println("bookingid: "  + bookingid);

        String url2 = "https://restful-booker.herokuapp.com/booking/" + bookingid;
        String cookies = "token=f61416de503d436";
        String authorization = "Basic YWRtaW46cGFzc3dvcmQxMjM=";

        Response response2 = RestAssured.
                given().
                contentType(contentType).
                cookie(cookies).
                header("Authorization", authorization).
                header("Cookie", cookies).
                when().
                delete(url2).
                then().
                extract().
                response();

        Assert.assertEquals(response2.getStatusCode(),201);
        System.out.println("status: " + response2.getBody().asString());
    }
}

