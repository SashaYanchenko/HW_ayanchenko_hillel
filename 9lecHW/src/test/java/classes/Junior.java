package classes;

public class Junior extends Intern{
    final int SALARY_COEF = 4;
    public int exp;

    public Junior() {

    }

    public Junior(String name, String location, int courses, String mentor, String company, int salary, int exp) {
        super(name, location, courses, mentor, company, salary);
        this.exp = exp;
    }

    public int getSalary() {
        return exp * SALARY_COEF;
    }

    @Override
    public String toString() {
        return "Junior{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", courses=" + courses +
                ", mentor='" + mentor + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", SALARY_COEF=" + SALARY_COEF +
                ", exp=" + exp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Junior junior = (Junior) o;
        return SALARY_COEF == junior.SALARY_COEF && exp == junior.exp;
    }

}
