package teach_center.community;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String city;
    private String street;
    private int houseNumber;
    private int flourNumber;
    private int flatNumber;

}
