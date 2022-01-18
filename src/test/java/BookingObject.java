
public class BookingObject extends Faker {

    public static void main(String[] args) {

        Booking second_booking = new Booking(printFirstNameFaker(), printLastNameFaker(), printGenerator(), true, printDate(), printTomorrow(), printNeeds());
        second_booking.info();

     }
}