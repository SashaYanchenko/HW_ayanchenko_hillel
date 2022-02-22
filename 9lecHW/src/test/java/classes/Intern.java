package classes;

import java.util.Objects;

public class Intern extends Candidate {

    public String mentor;
    public String company;
    public int salary;

    public Intern() {

    }

    public Intern(String name, String location, int courses, String mentor, String company, int salary) {
        super(name, location, courses);
        this.mentor = mentor;
        this.company = company;
        this.salary = salary;
    }

    public void learnNewMaterial() {
        System.out.println(name + " умеет учиться!");
    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", courses=" + courses +
                ", mentor='" + mentor + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Intern intern = (Intern) o;
        return salary == intern.salary && Objects.equals(mentor, intern.mentor) && Objects.equals(company, intern.company);
    }

}
