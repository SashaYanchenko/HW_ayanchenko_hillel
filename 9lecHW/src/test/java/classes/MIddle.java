package classes;

import java.util.Objects;

public class MIddle extends Junior{
    final int SALARY_COEF = 8;
    boolean teach;

    public MIddle() {

    }

    public MIddle(String name, String location, int courses, String mentor, String company, int salary, int exp, boolean teach) {
        super(name, location, courses, mentor, company, salary, exp);
        this.teach = teach;
    }

    @Override
    public int getSalary() {
        if (teach == true) {
            return exp * SALARY_COEF + 500;
        } else {
            return exp * SALARY_COEF;
        }
    }

    @Override
    public String toString() {
        return "MIddle{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", courses=" + courses +
                ", mentor='" + mentor + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", exp=" + exp +
                ", SALARY_COEF=" + SALARY_COEF +
                ", teach=" + teach +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MIddle mIddle = (MIddle) o;
        return SALARY_COEF == mIddle.SALARY_COEF && teach == mIddle.teach;
    }

}
