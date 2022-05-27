package objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
public class BookingLombokObject {

    public String firstname;
    public String lastname;
    public int totalprice;
    public boolean depositpaid;
    public String checkin;
    public String checkout;
    public String additionalneeds;


}
