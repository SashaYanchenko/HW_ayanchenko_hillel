package teach_center.community.implementation;

public class LearningProcess {
    public static String goToTheUniver(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("We should go to the UNIVER!");
                break;
            default:
                System.out.println("It is weekend!!!!");
                break;
        }
        return null;
    }

    public static void lectureDay(Student student) {
        Day[] days = student.getVisitingDays();
        if (days != null) {
            for (int i = 0; i < days.length; i++) {
                if (Day.MONDAY.equals(days[i])||Day.TUESDAY.equals(days[i])||Day.WEDNESDAY.equals(days[i])) {
                    System.out.println("Student on this day has lecture (" + days[i] + ")");
                } else {
                    System.out.println("Student on this day has practise (" + days[i] + ")");
                }
            }
        }
    }
}
