package teach_center.demo;

import teach_center.community.Address;
import teach_center.community.Subjects;
import teach_center.community.abstraction.Subject;
import teach_center.community.implementation.Day;
import teach_center.community.implementation.Student;
import teach_center.community.implementation.Teacher;
import teach_center.department.StudentDepartament;

import java.util.HashSet;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        StudentDepartament departament = new StudentDepartament(10);
        Teacher teacher = new Teacher("Ivav Pypkov", 43,"ivanich@daideneg.com","PhysMat","Rector");
        teacher.setAddress(new Address("Kyiv", "Peace acenu", 23 , 32, 4));


        Subjects[] subjects = {new Subjects("tet", 10), new Subjects("fwe",15)};
        Day[] days = {Day.MONDAY, Day.SUNDAY};
        Set<Subject> subjectSet = new HashSet<>();
        subjectSet.add(new Subject("Sports"));
        subjectSet.add(new Subject("Language"));
        subjectSet.add(new Subject("History"));
        subjectSet.add(new Subject("Math"));
        Student student = new Student("fdw", 19, "fwfw", subjects, 3, "denna", days, subjectSet);

        System.out.println(student);


    }

}
