package teach_center.demo;

import teach_center.community.Address;
import teach_center.community.Subject;
import teach_center.community.implementation.Student;
import teach_center.community.implementation.Teacher;
import teach_center.department.StudentDepartament;

public class Demo {

    public static void main(String[] args) {
        StudentDepartament departament = new StudentDepartament(10);
        Teacher teacher = new Teacher("Ivav Pypkov", 43, "ivanich@daideneg.com", "PhysMat", "Rector");
        teacher.setAddress(new Address("Kyiv", "Peace avenu", 23, 32, 4));

        Subject[] subjects = {new Subject("tet", 10), new Subject("fwe",15)};
        Student student1 = new Student("fdw", 19, "fwfw", subjects, 3, "denna");

        departament.addStudent(student1);

    }

}
