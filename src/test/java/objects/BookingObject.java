package objects;

import com.solidfire.gson.Gson;
import objects.Booking;
import objects.BookingLombokObject;
import org.junit.jupiter.api.Test;


public class BookingObject extends datas.Faker {


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
        BookingSecondObject b3 = new BookingSecondObject("2022-02-01", "2022-02-01");
        Gson json = new Gson();
        String booking3 = json.toJson(b3);


        Booking b = new Booking("Jozef", "Nowakowski", 123, true, booking3,  "Lunch" );
        Gson json2 = new Gson();
        String booking1 = json2.toJson(b);
        System.out.println(booking1);
     }

    @Test
    public String getBookingDates() {
        BookingSecondObject b2 = new BookingSecondObject("2022-02-01", "2022-02-01");
        Gson json = new Gson();
        return json.toJson(b2);
    }

    @Test
    public void getPojoFromJson() {
        String jsonText = "{\"checkin\":\"2024-02-01\",\"checkout\":\"2024-04-04\"}";
        Gson gson = new Gson();
        BookingSecondObject jb = gson.fromJson(jsonText, BookingSecondObject.class);
        System.out.println(jb.checkin + " " + jb.checkout);
    }

     @Test
    public void getNewBookingJson(){
         Booking b = new Booking("Jozef", "Nowakowski", 123, true, getBookingDates(),  "Lunch" );
         Gson json2 = new Gson();
         String booking1 = json2.toJson(b);
         System.out.println(booking1);
     }

     @Test
    public void getAndSetBookingLombok(){
         BookingLombokObject bl = new BookingLombokObject("Jozef", "Nowakowski", 123, true, "2033-02-06", "2033-01-01",  "Lunch" );
         bl.setFirstname("LombokName");
         Gson blJson = new Gson();
         String blJ = blJson.toJson(bl);
         System.out.println(blJ);
     }



}
