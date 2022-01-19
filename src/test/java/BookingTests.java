import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BookingTests extends Data {

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

    @Test
    public void getBookingsStatus() {
        given().
                get(urlBooking()).
                then().
                statusCode(200);
    }

    @Test
    public void postAndPutBooking() {
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

        String put_url = urlBooking() + "/"+ bookingid;
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

        String url_patch =  urlBooking() + "/" + bookingid;
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
                patch(url_patch).
                then().
                extract().
                response();

        Assert.assertEquals(response_patch.getStatusCode(),200);
        System.out.println("status: " + response_patch.getBody().asString());
    }

    @Test
    public void postAndDeleteBooking() {
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
//        System.out.println("Body :" + response.getBody().asString());
        int bookingid = response.jsonPath().getInt("bookingid");
        System.out.println("bookingid: "  + bookingid);

        String url_delete = urlBooking() + "/" + bookingid;
        String cookies = cookies();
        String authorization = authorization();

        Response response_delete = RestAssured.
                given().
                contentType(contentType).
                cookie(cookies).
                header("Authorization", authorization).
                header("Cookie", cookies).
                when().
                delete(url_delete).
                then().
                extract().
                response();

        Assert.assertEquals(response_delete.getStatusCode(),201);
        System.out.println("status: " + response_delete.getBody().asString());
    }

    @Test
    public void postAndGetBookingById() {
        String url = urlBooking();
        String contentType = "application/json";
        String bodyData = printJsonBooking();

        Response response_post = RestAssured.
                given().
                contentType(contentType).
                body(bodyData).
                when().
                post(url).
                then().
                extract().
                response();

        Assert.assertEquals(response_post.getStatusCode(), 200);
        System.out.println("Body :" + response_post.getBody().asString());
        int bookingid = response_post.jsonPath().getInt("bookingid");
        System.out.println("bookingid: "  + bookingid);

        String url_get = urlBooking() + "/" + bookingid;
        Response response = RestAssured.
                given().
                get(url_get).
                then().
                statusCode(200).
                extract().
                response();

        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println("Body after post: " + response.getBody().asString());
    }

    @Test
    public void getBookingsReturnsBadUrl() {
        Response response = get("https://restful-booker.herokuapp.com/bookings");

        System.out.println("Response :" + response.asString());
        System.out.println("status code: " + response.getStatusCode());
        System.out.println("Body :" + response.getBody().asString());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 404);
    }
    @Test
    public void getBookingsReturnsBadMethod() {
        Response response = post(urlBooking());

        System.out.println("status code: " + response.getStatusCode());
        System.out.println("Body :" + response.getBody().asString());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 415);
    }

    @Test
    public void postBookingBadBoolean() {
        String url = "https://restful-booker.herokuapp.com/booking";
        String contentType = "application/json";
        String bodyData = printBadJsonBoolean();

        Response response = RestAssured.
                given().
                contentType(contentType).
                body(bodyData).
                when().
                post(url).
                then().
                extract().
                response();

        Assert.assertEquals(response.getStatusCode(),400);
        System.out.println("Body :" + response.getBody().asString());
    }

    @Test
    public void postBookingBadInt() {
        String url = "https://restful-booker.herokuapp.com/booking";
        String contentType = "application/json";
        String bodyData = printBadJsonStringInt();

        Response response = RestAssured.
                given().
                contentType(contentType).
                body(bodyData).
                when().
                post(url).
                then().
                extract().
                response();

        Assert.assertEquals(response.getStatusCode(),400);
        System.out.println("Body :" + response.getBody().asString());
    }

    @Test
    public void postBookingBadMethodDel() {
        String url = urlBooking();
        String contentType = "application/json";
        String bodyData = printJsonBooking();

        Response response = RestAssured.
                given().
                contentType(contentType).
                body(bodyData).
                when().
                delete(url).
                then().
                extract().
                response();

        Assert.assertEquals(response.getStatusCode(),404);
        System.out.println("Body :" + response.getBody().asString());
    }

    @Test
    public void getBookingsDataFromJsonResponse() {
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

        Response response_get = get("https://restful-booker.herokuapp.com/booking/" + bookingid);

        System.out.println("status code: " + response_get.getStatusCode());
        System.out.println("Body :" + response.getBody().asString());

        String firstname = response_get.jsonPath().get("firstname");
        System.out.println("firstname: " + firstname);

        String lastname = response_get.jsonPath().get("lastname");
        System.out.println("lastname: " + lastname);

        int totalprice = response_get.jsonPath().getInt("totalprice");
        System.out.println("totalprice: " + totalprice);

        boolean depositpaid = response_get.jsonPath().getBoolean("depositpaid");
        System.out.println("depositpaid: " + depositpaid);

        String bookingdates = response_get.jsonPath().getString("bookingdates");
        System.out.println("bookingdates: " + bookingdates);

        String bookingdates_checkin = response_get.jsonPath().getString("bookingdates.checkin");
        System.out.println("checkin: " + bookingdates_checkin);

        String additionalneeds = response_get.jsonPath().get("additionalneeds");
        System.out.println("additionalneeds: " + additionalneeds);

        int statusCode = response_get.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

}


