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


    @Test
    public void getNewBooking(){
        BookingSecond b3 = new BookingSecond("2022-02-01", "2022-02-01");
        Gson json = new Gson();
        String booking3 = json.toJson(b3);


        Booking b = new Booking("Jozef", "Nowakowski", 123, true, booking3,  "Lunch" );
        Gson json2 = new Gson();
        String booking1 = json2.toJson(b);
        System.out.println(booking1);
     }

    @Test
    public String getBookingDates() {
        BookingSecond b2 = new BookingSecond("2022-02-01", "2022-02-01");
        Gson json = new Gson();
        return json.toJson(b2);
    }

    @Test
    public void getPojoFromJson() {
        String jsonText = "{\"checkin\":\"2024-02-01\",\"checkout\":\"2024-04-04\"}";
        Gson gson = new Gson();
        BookingSecond jb = gson.fromJson(jsonText,BookingSecond.class);
        System.out.println(jb.checkin + " " + jb.checkout);
    }

     @Test
    public void getNewBookingJson(){
         Booking b = new Booking("Jozef", "Nowakowski", 123, true, getBookingDates(),  "Lunch" );
         Gson json2 = new Gson();
         String booking1 = json2.toJson(b);
         System.out.println(booking1);
     }


}
