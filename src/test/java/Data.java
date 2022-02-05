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

    public static String printJsonBooking() {
        String names = printFirstNameNorway();
        String lnames = printLastNameNorway();
        String needs = printNeeds();
        int generator = printGenerator();
        String date = printDate();
        String datetomorrow = printTomorrow();

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
        String names = printFirstNameNorway();
        String lnames = printLastNameNorway();
        String needs = printNeeds();
        int generator = printGenerator();
        String date = printDate();
        String datetomorrow = String.valueOf(printTomorrow());

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
        String names = printUuid();
        String lnames = printLastNameNorway();

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

}
