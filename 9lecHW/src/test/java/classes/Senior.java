package classes;

public final class Senior extends MIddle{
    final int SALARY_COEF = 12;

    public Senior() {

    }

    public Senior(String name, String location, int courses, String mentor, String company, int salary, int exp, boolean teach) {
        super(name, location, courses, mentor, company, salary, exp, teach);
    }

    @Override
    public int getSalary() {
        if (teach == true) {
            return exp * SALARY_COEF + 1000;
        } else {
            return exp * SALARY_COEF;
        }
    }

    @Override
    public String toString() {
        return "Senior{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", courses=" + courses +
                ", mentor='" + mentor + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", exp=" + exp +
                ", teach=" + teach +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Senior senior = (Senior) o;
        return SALARY_COEF == senior.SALARY_COEF;
    }

}
