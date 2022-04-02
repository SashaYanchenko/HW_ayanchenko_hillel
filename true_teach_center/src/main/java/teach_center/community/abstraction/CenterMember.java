package teach_center.community.abstraction;

import teach_center.community.Address;
import teach_center.community.Subject;

public abstract class CenterMember {
    private String name;
    private int age;
    private Address address;
    private String email;
    private Subject subject;

    public CenterMember(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public Subject getSubject() {
        return subject;
    }

    public abstract void work();

    public void teachSmthNew() {
        System.out.println(getName() + " learned new formula");
    }

    @Override
    public String toString() {
        return "CenterMember{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", subject=" + subject +
                '}';
    }
}
