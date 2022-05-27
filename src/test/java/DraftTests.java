import datas.Data;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DraftTests extends datas.Data {

    @Test
    public void postAndDeleteBooking() {
        String url_delete = urlBooking() + "/" + postBookingBeforeTest();

        Response response_delete = RestAssured.
                given().
                contentType(contentType()).
                header("Authorization", authorization()).
                header("Cookie", cookies()).
                when().
                delete(url_delete).
                then().
                extract().
                response();

        Assert.assertEquals(response_delete.getStatusCode(),201);
        System.out.println("status: " + response_delete.getBody().asString());

        int statusCode = response_delete.getStatusCode();

        for (int i = 0; i <1; i++) {
            if (statusCode == 201) {
                System.out.println("STATUS CODE IS CORRECT");
            } else {
                System.out.println("STATUS CODE IS NOT CORRECT");
            }

        }
    }

}




