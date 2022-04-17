package teach_center.community.implementation;

import teach_center.community.Subjects;
import teach_center.community.abstraction.CenterMember;
import teach_center.community.abstraction.Subject;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public class Student extends CenterMember {

    private Subjects[] subject;
    private int yearOfStudy;
    private String formOfEducation;
    private Day[] visitingDays;
    private Set<Subject> subjects;

    public Student(String name, int age, String email, Subjects[] subject, int yearOfStudy, String formOfEducation, Day[] visitingDays, Set<Subject> subjects) {
        super(name, age, email);
        this.subject = subject;
        this.yearOfStudy = yearOfStudy;
        this.formOfEducation = formOfEducation;
        this.visitingDays = visitingDays;
        this.subjects = subjects;
    }

    public void setSubject(Subjects[] subject) {
        this.subject = subject;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setFormOfEducation(String formOfEducation) {
        this.formOfEducation = formOfEducation;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public String getFormOfEducation() {
        return formOfEducation;
    }

    public Subjects[] getSubject() {
        return subject;
    }

    public Day[] getVisitingDays() {
        return visitingDays;
    }

    @Override
    public void work() {
        System.out.println(getName() + " всегда делает свое дз");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return yearOfStudy == student.yearOfStudy && Objects.equals(formOfEducation, student.formOfEducation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfStudy, formOfEducation);
    }

    @Override
    public String toString() {
        return "Student{" +
                "subject=" + Arrays.toString(subject) +
                ", yearOfStudy=" + yearOfStudy +
                ", formOfEducation='" + formOfEducation + '\'' +
                ", visitingDays=" + Arrays.toString(visitingDays) +
                ", subjects=" + subjects +
                '}';
    }
}

