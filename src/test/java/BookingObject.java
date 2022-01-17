
public class BookingObject extends Faker {

    public static void main(String[] args) {
/*
        Booking bookingObject = new Booking();
        bookingObject.firstname = "John";
        bookingObject.lastname = "Kowalski";
        bookingObject.totalprice = 123;
        bookingObject.depositpaid = true;
        bookingObject.checkin = "2022-01-13";
        bookingObject.checkout = "2022-01-14";
        bookingObject.additionalneeds = "Lunch";
        bookingObject.info(); */

        Booking second_booking = new Booking(printFirstNameFaker(), printLastNameFaker(), printGenerator(), true, printDate(), "2029-12-30", printNeeds());
        second_booking.info();

    }
}