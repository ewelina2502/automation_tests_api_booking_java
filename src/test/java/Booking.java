import com.fasterxml.jackson.core.type.TypeReference;
import com.google.gson.Gson;
import io.restassured.mapper.ObjectMapper;

import java.util.Map;

public class Booking {

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private String bookingdates;
    private String checkin;
    private String checkout;
    private String additionalneeds;

      public Booking() {
            }

    public Booking (String firstname, String lastname, int totalprice, boolean depositpaid, String bookingdates, String checkin, String checkout, String additionalneeds) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.totalprice = totalprice;
            this.depositpaid = depositpaid;
            this.bookingdates = bookingdates;
            this.checkin = checkin;
            this.checkout = checkout;
            this.additionalneeds = additionalneeds;
      }

    @Override
    public String toString() {
        return "Booking{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", totalprice=" + totalprice +
                ", depositpaid=" + depositpaid +
                ", bookingdates='" + bookingdates + '\'' +
                ", checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                ", additionalneeds='" + additionalneeds + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(String bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public void info() {
           System.out.println("firstname: " + firstname);
           System.out.println("lastname: " + lastname);
           System.out.println("totalprice: " + totalprice);
           System.out.println("depositpaid: " + depositpaid);
           System.out.println("bookingdates:" + bookingdates);
           System.out.println("checkin: " + checkin);
           System.out.println("checkout: " + checkout);
           System.out.println("additionalneeds: " + additionalneeds);
      }

}