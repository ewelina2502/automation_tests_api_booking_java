import com.solidfire.gson.Gson;
import com.solidfire.gson.internal.bind.util.ISO8601Utils;

public class BookingObject extends Faker {

    public static void main(String[] args) {

            Booking first_booking = new Booking ("Adam", "Kowalski", 123, true, "{", "2023-01-01", "2023-01-01", "Lunch");
//        first_booking.info();

            Gson json = new Gson();
            String response_first = json.toJson(first_booking);
            System.out.println(response_first);

        Booking second_booking = new Booking(printFirstNameFaker(), printLastNameFaker(), printGenerator(), true, "{",printDate(), printTomorrow() + "}", printNeeds());
//        second_booking.info();
        String response = json.toJson(second_booking);
        System.out.println(response);

     }
}