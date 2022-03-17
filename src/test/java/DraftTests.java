import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.get;

public class DraftTests {

    @Test
    public void getBookingsReturnList() {
        Response response = get(Data.urlBooking());
        System.out.println("Body :" + response.getBody().asString());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

        List<Object> bookingId = response.jsonPath().getList("bookingid");
        System.out.println("List of Ids: " + bookingId);
    }


}




