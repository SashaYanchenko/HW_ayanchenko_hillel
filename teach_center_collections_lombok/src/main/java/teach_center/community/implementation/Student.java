package teach_center.community.implementation;

import lombok.*;
import teach_center.community.Address;
import teach_center.community.Subjects;
import teach_center.community.abstraction.CenterMember;
import teach_center.community.abstraction.Subject;

import java.util.Set;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class Student extends CenterMember {

    private Subjects[] subject;
    private int yearOfStudy;
    private String formOfEducation;
    private Day[] visitingDays;
    private Set<Subject> subjects;

    public Student(String name, int age, String email, Subjects[] subject, int yearOfStudy, String formOfEducation, Day[] visitingDays, Set<Subject> subjects, Address address) {
        super(name, age, address, email);
        this.subject = subject;
        this.yearOfStudy = yearOfStudy;
        this.formOfEducation = formOfEducation;
        this.visitingDays = visitingDays;
        this.subjects = subjects;
    }

    @Override
    public void work() {
        System.out.println(getName() + " всегда делает свое дз");
    }

}

