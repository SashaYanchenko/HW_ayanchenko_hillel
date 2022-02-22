package classes;

import java.util.Objects;

public class Candidate {

    public String name;
    public String location;
    public int courses;

    public Candidate(){

    }

    public Candidate(String name, String location, int courses) {
        this.name = name;
        this.location = location;
        this.courses = courses;
    }

     public void searchForWork(){
        System.out.println("Ищу работу!");
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return courses == candidate.courses && Objects.equals(name, candidate.name) && Objects.equals(location, candidate.location);
    }

}
