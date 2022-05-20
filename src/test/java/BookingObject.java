import com.solidfire.gson.Gson;
import org.junit.jupiter.api.Test;


public class BookingObject extends Faker {


     @Test
    public void getBooking(){
         Booking b = new Booking("Jozef", "Nowakowski", 123, true, "{checkin: 2022-02-01, checkout: 2023-01-01}",  "Lunch" );
//         b.setFirstname("Damian");
//         System.out.println("Update name: " + b.getFirstname());
         Gson json = new Gson();
         String booking1 = json.toJson(b);
         System.out.println(booking1);

     }


}

