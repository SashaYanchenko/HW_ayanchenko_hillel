package teach_center.community.implementation;

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

    Day(String name, int dayNumber, boolean hangoverDay) {
        this.name = name;
        this.dayNumber = dayNumber;
        this.hangoverDay = hangoverDay;
    }

    public String getName() {
        return name;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public boolean hangoverDay() {
        return hangoverDay;
    }

    @Override
    public String toString() {
        return "Day{" +
                "name='" + name + '\'' +
                ", dayNumber=" + dayNumber +
                ", hangoverDay=" + hangoverDay +
                '}';
    }
}
