package teach_center.community;

public class Subject {

    private String title;
    private int hours;

    public Subject() {

    }

    public Subject(String title, int hours) {
        this.title = title;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "title='" + title + '\'' +
                ", hours=" + hours +
                '}';
    }
}
