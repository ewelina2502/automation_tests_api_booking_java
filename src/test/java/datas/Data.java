package datas;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class Data extends Faker {


    public static String urlBooking() {
        return "https://restful-booker.herokuapp.com/booking";
    }

    public static String cookies() {
        return "token=f61416de503d436";
    }

    public static String authorization() {
        return "Basic YWRtaW46cGFzc3dvcmQxMjM=";
    }

    public static String contentType() {
        return "application/json";
    }

    public static int postBookingBeforeTest() {
        String contentType = "application/json";

        Response response = RestAssured.
                given().
                contentType(contentType()).
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

    public static String printJsonBooking() {
        String names = Faker.printFirstNameNorway();
        String lnames = Faker.printLastNameNorway();
        String needs = Faker.printNeeds();
        int generator = Faker.printGenerator();
        String date = Faker.printDate();
        String datetomorrow = Faker.printTomorrow();

        return "{" +
                " \"firstname\": " + '"' + names + '"' + ","+
                " \"lastname\": " +  '"' + lnames + '"' + "," +
                " \"totalprice\": "  + generator + "," +
                " \"depositpaid\": \"true\"," +
                " \"bookingdates\":"  +
                " { \"checkin\": " + '"' + date + '"'+ "," +
                " \"checkout\": " + '"' + datetomorrow + '"' + "}," +
                " \"additionalneeds\": " + '"' + needs + '"' +
                "}";
    }

    public static String printJsonPutBooking() {
        String names = Faker.printFirstNameNorway();
        String lnames = Faker.printLastNameNorway();
        String needs = Faker.printNeeds();
        int generator = Faker.printGenerator();
        String date = Faker.printDate();
        String datetomorrow = String.valueOf(Faker.printTomorrow());

        return "{" +
                " \"firstname\": " +  '"' + names + "up" +'"' + "," +
                " \"lastname\": " +  '"' + lnames + '"' + "," +
                " \"totalprice\": "  + generator + "," +
                " \"depositpaid\": \"true\"," +
                " \"bookingdates\":"  +
                " { \"checkin\": " + '"' + date + '"'+ "," +
                " \"checkout\": " + '"' + datetomorrow + '"' + "}," +
                " \"additionalneeds\": " + '"' + needs + '"' +
                "}";
    }

    public static String printJsonPatchbooking() {
        String names = Faker.printUuid();
        String lnames = Faker.printSpecjalSign();

        return "{" +
                " \"firstname\": " + '"' + names + '"' + ","+
                " \"lastname\": " +  '"' + lnames + '"' +
                "}";
    }

    public static String printBadJsonStringInt() {
        return "{" +
                " \"firstname\":  \"John\"," +
                " \"lastname\":  \"Badminton\"," +
                " \"totalprice\":  \"true\"," +
                " \"depositpaid\": \"true\"," +
                " \"bookingdates\":"  +
                " { \"checkin\":  \"2022-01-14\"," +
                " \"checkout\":  \"2022-01-15\"," +
                " \"additionalneeds\":  \"Lunch\"," +
                "}";
    }

    public static String printBadJsonBoolean() {
        return "{" +
                " \"firstname\":  \"John\"," +
                " \"lastname\":  \"Badminton\"," +
                " \"totalprice\":  \"true\"," +
                " \"depositpaid\": \"bug\"," +
                " \"bookingdates\":"  +
                " { \"checkin\":  \"2022-01-14\"," +
                " \"checkout\":  \"2022-01-15\"," +
                " \"additionalneeds\":  \"Lunch\"," +
                "}";
    }

    public static String printAssertJsonBooking() {
        String lnames = Faker.printLastNameNorway();
        String needs = Faker.printNeeds();
        int generator = Faker.printGenerator();
        String date = Faker.printDate();
        String datetomorrow = Faker.printTomorrow();

        return "{" +
                " \"firstname\": \"Aldona\"," +
                " \"lastname\": " +  '"' + lnames + '"' + "," +
                " \"totalprice\": "  + generator + "," +
                " \"depositpaid\": \"true\"," +
                " \"bookingdates\":"  +
                " { \"checkin\": " + '"' + date + '"'+ "," +
                " \"checkout\": " + '"' + datetomorrow + '"' + "}," +
                " \"additionalneeds\": " + '"' + needs + '"' +
                "}";
    }

//    public static String jsonObject() {
//        objects.Booking first_booking = new objects.Booking("Adam", "Kowalski", 123, true,  "{","2022-01-28", "2022-01-28}", "Breakfast" );
//        Gson json = new Gson();
//        return json.toJson(first_booking);
//    }

}
