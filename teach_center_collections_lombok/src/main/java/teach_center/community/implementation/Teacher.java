package teach_center.community.implementation;

import lombok.*;
import teach_center.community.Address;
import teach_center.community.abstraction.CenterMember;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class Teacher extends CenterMember {

    private String faculty;
    private String academicTitle;

    public Teacher(String name, int age, String email, String faculty, String academicTitle, Address address) {
        super(name, age, address, email);
        this.faculty = faculty;
        this.academicTitle = academicTitle;
    }

    @Override
    public void work() {
        System.out.println(getName() + " всегда читает свои пары");
    }
}
