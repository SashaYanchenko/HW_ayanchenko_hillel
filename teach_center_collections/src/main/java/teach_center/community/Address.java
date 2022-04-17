package teach_center.community;

public class Address {

    private String city;
    private String street;
    private int houseNumber;
    private int flourNumber;
    private int flatNumber;

    public Address() {
    }

    public Address(String city, String street, int houseNumber, int flourNumber, int flatNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flourNumber = flourNumber;
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", flourNumber=" + flourNumber +
                ", flatNumber=" + flatNumber +
                '}';
    }

}
