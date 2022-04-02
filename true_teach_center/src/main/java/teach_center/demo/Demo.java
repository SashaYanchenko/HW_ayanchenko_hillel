package teach_center.demo;

import teach_center.community.Address;
import teach_center.community.implementation.Student;
import teach_center.community.implementation.Teacher;
import teach_center.department.StudentDepartament;

public class Demo {

    public static void main(String[] args) {
        StudentDepartament departament = new StudentDepartament(10);
        Teacher teacher = new Teacher("Ivav Pypkov", 43,"ivanich@daideneg.com","PhysMat","Rector");
        teacher.setAddress(new Address("Kyiv", "Peace acenu", 23 , 32, 4));

        Student student = new Student("Aram", 19, "bairaktar@v.ua",2, "dnevnaia");
        student.setAddress(new Address("Chernihiv", "Pobedu avenu", 23 , 32, 4));

        departament.addStudent(student);

    }

}
