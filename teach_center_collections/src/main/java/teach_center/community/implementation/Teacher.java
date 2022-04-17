package teach_center.community.implementation;

import teach_center.community.abstraction.CenterMember;

import java.util.Objects;

public class Teacher extends CenterMember {

    private String faculty;
    private String academicTitle;

    public Teacher(String name, int age, String email, String faculty, String academicTitle) {
        super(name, age, email);
        this.faculty = faculty;
        this.academicTitle = academicTitle;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    @Override
    public void work() {
        System.out.println(getName() + " всегда читает свои пары");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(faculty, teacher.faculty) && Objects.equals(academicTitle, teacher.academicTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculty, academicTitle);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "faculty='" + faculty + '\'' +
                ", academicTitle='" + academicTitle + '\'' +
                '}';
    }

}
