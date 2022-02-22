package classes;

import java.util.Objects;

public class Employee {
    public String name;
    public String gender;
    public int age;
    public String position;
    public int exp;

    public Employee() {
    }

    public Employee(String name, String gender, int age, String position, int exp) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.position = position;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", exp=" + exp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && exp == employee.exp && Objects.equals(name, employee.name) && Objects.equals(gender, employee.gender) && Objects.equals(position, employee.position);
    }

}
