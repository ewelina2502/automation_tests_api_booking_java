import com.solidfire.gson.Gson;
import org.junit.jupiter.api.Test;


public class BookingObject extends Faker {

    @Test
    public void addNewBooking() {

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

     @Test
    public void getBooking(){
         Booking b = new Booking("Jozef", "Nowakowki", 123, true, "{", "2023-01-01", "2023-01-01", "Lunch" );
         b.getFirstname();
         System.out.println(b.getFirstname());
         b.setFirstname("Damian");
         System.out.println(b.getFirstname());


     }
}