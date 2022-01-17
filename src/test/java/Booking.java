public class Booking {

      public String firstname;
      public String lastname;
      public int totalprice;
      public boolean depositpaid;
      //    public String bookingdates;
      public String checkin;
      public String checkout;
      public String additionalneeds;

      public Booking() {
            }

      public Booking( String firstname, String lastname, int totalprice, boolean depositpaid, String checkin, String checkout, String additionalneeds) {
            }

      public void info() {
           System.out.println("firstname: " + firstname);
           System.out.println("lastname: " + lastname);
           System.out.println("totalprice: " + totalprice);
           System.out.println("depositpaid: " + depositpaid);
           System.out.println("checkin: " + checkin);
           System.out.println("checkout: " + checkout);
           System.out.println("additionalneeds: " + additionalneeds);

      }
}