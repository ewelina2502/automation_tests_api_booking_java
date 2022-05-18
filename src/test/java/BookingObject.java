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
         Booking b = new Booking("Jozef", "Nowakowski", 123, true, "{", "2023-01-01", "2023-01-01", "Lunch" );
         b.getFirstname();
         System.out.println(b.getFirstname());
         b.setFirstname("Damian");
         System.out.println("Update name: " + b.getFirstname());
         Gson json = new Gson();
         String response_b = json.toJson(b);
         System.out.println(response_b);


     }

    @Test
    public void getBokingDates(){
        BookingDates bd = new BookingDates("2023-01-01", "2023-01-01");
        Gson json = new Gson();
        String resposne_bd = json.toJson(bd);
        System.out.println(resposne_bd);
    }


    @Test
    public void getNewBookingObject(){


    }


}

