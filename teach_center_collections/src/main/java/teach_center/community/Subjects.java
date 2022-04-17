package teach_center.community;

public class Subjects {

    private String title;
    private int hours;

    public Subjects() {
    }

    public Subjects(String title, int hours) {
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
