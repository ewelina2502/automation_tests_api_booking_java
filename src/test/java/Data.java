public class Data extends Faker{

    public static String urlBooking() {
        return "https://restful-booker.herokuapp.com/booking";
    }

    public static String printJsonBooking() {
        String names = printFirstNameNorway();
        String lnames = printLastNameNorway();
        String needs = printNeeds();
        int generator = printGenerator();
        String date = printDate();
        String datetomorrow = String.valueOf(printTomorrow());

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

    public static String printJsonPatchbooking() {
        String names = printFirstNameNorway();
        String lnames = printLastNameNorway();

        return "{" +
                " \"firstname\": " + '"' + names + '"' + ","+
                " \"lastname\": " +  '"' + lnames + '"' +
                "}";

    }
}
