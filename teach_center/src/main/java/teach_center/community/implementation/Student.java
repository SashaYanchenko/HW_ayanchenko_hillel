package teach_center.community.implementation;

import teach_center.community.Subject;
import teach_center.community.abstraction.CenterMember;

import java.util.Objects;

public class Student extends CenterMember {

    private Subject [] subject;
    private int yearOfStudy;
    private String formOfEducation;

    public Student() {

    }

    public Student(String name, int age, String email, Subject[] subject, int yearOfStudy, String formOfEducation) {
        super(name, age, email);
        this.subject = subject;
        this.yearOfStudy = yearOfStudy;
        this.formOfEducation = formOfEducation;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setFormOfEducation(String formOfEducation) {
        this.formOfEducation = formOfEducation;
    }

    public void setSubject(Subject[] subject) {
        this.subject = subject;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public String getFormOfEducation() {
        return formOfEducation;
    }

    public Subject[] getSubject() {
        return subject;
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
                "yearOfStudy=" + yearOfStudy +
                ", formOfEducation='" + formOfEducation + '\'' +
                '}';
    }
}
