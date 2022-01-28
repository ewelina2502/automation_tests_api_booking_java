import java.time.LocalDate;

public class BookingObject extends Faker {

    public static void main(String[] args) {

     /* Booking bookingObject = new Booking();
        bookingObject.firstname = "John";
        bookingObject.lastname = "Kowalski";
        bookingObject.totalprice = 123;
        bookingObject.depositpaid = true;
        bookingObject.checkin = "2022-01-13";
        bookingObject.checkout = "2022-01-14";
        bookingObject.additionalneeds = "Lunch";
        bookingObject.info();  */

        Booking second_booking = new Booking("Thomas", "Obiektowy", 111, true, "2021-02-20", "2021-03-30", "Lunch");
        Booking third_booking = new Booking("Bob", "Been", 123, true, "2021-06-03", "2021-07-13", "Dinner");
        Booking fourth_booking = new Booking(printFirstNameNorway(), printLastNameNorway(), printGenerator(), true, printDate(), String.valueOf(printTomorrow()), printNeeds());


        second_booking.info();
        third_booking.info();
        fourth_booking.info();
    }
}