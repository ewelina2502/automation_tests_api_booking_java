import com.solidfire.gson.Gson;

public class BookingObject extends Faker {

    public static  void main(String[] args) {

        Booking first_booking = new Booking("Adam", "Kowalski", 123, true, "2022-01-28", "2022-01-28", "Breakfast" );
//        first_booking.info();
        Gson json = new Gson();
        String response = json.toJson(first_booking);
        System.out.println(response);



//        System.out.println("Drugi: ");
//        Booking second_booking = new Booking(printFirstNameFaker(), printLastNameFaker(), printGenerator(), true, printDate(), printTomorrow(), printNeeds());
//        second_booking.info();

     }
}