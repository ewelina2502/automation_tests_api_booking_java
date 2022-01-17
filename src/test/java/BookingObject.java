public class BookingObject {

    public static void main(String[] args) {

        Booking bookingObject = new Booking();
        bookingObject.firstname = "John";
        bookingObject.lastname = "Kowalski";
        bookingObject.totalprice = 123;
        bookingObject.depositpaid = true;
        bookingObject.checkin = "2022-01-13";
        bookingObject.checkout = "2022-01-14";
        bookingObject.additionalneeds = "Lunch";
        bookingObject.info();


        Booking secondBooking = new Booking("Ryszard", "Bukuje", 111, true, "2021=02-20", "2021-03-30", "Lunch");
        secondBooking.info();

    }
}