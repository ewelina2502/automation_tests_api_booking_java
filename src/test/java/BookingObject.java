import com.google.gson.Gson;
import io.restassured.mapper.ObjectMapper;
import org.testng.annotations.Test;



public class BookingObject extends Faker {

    public static void main(String[] args) {

        Booking first_booking = new Booking("Adam", "Kowalski", 123, true, "{", "2023-01-01", "2023-01-01", "Lunch");

        Gson json = new Gson();
        String response_first = json.toJson(first_booking);
        System.out.println(response_first);

        Booking second_booking = new Booking(printFirstNameFaker(), printLastNameFaker(), printGenerator(), true, "{", printDate(), printTomorrow() + "}", printNeeds());
        String response = json.toJson(second_booking);
        System.out.println(response);

        Booking b = new Booking();
        b.setFirstname("Even");
        b.setLastname("Brown");
        b.setTotalprice(124);
        b.setDepositpaid(false);
        b.setBookingdates("{");
        b.setCheckin("2023-01-01");
        b.setCheckout("2023-01-01");
//
//            ObjectMapper mapper = new ObjectMapper();
//            String result = mapper.writer().writeValueAsString(b);


        }

    }
