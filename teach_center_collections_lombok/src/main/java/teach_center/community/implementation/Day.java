package teach_center.community.implementation;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public enum Day {
    MONDAY("Monday", 1,true),
    TUESDAY("Tuesday", 2,true),
    WEDNESDAY("Wednesday", 3,false),
    THURSDAY("Thursday", 4,false),
    FRIDAY("Friday", 5,false),
    SATURDAY("Saturday", 6,false),
    SUNDAY("Sunday", 7,false);

    private String name;
    private int dayNumber;
    private boolean hangoverDay;

}
