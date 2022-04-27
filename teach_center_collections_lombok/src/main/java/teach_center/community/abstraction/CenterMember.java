package teach_center.community.abstraction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import teach_center.community.Address;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class CenterMember {
    private String name;
    private int age;
    private Address address;
    private String email;

    public abstract void work();

    public void teachSmthNew() {
        System.out.println(getName() + " learned new formula");
    }

}
