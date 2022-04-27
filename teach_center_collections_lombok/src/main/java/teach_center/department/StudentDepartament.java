package teach_center.department;

import teach_center.community.abstraction.CenterMember;

public class StudentDepartament {
    private CenterMember[] department;

    public StudentDepartament(int quantity) {
        this.department = new CenterMember[quantity];
    }

    public void addStudent (CenterMember centerMember) {
        for (int i = 0; i < department.length; i++) {
            if (department[i] == null) {
                department[i] = centerMember;
                System.out.println(centerMember + " WELCOME TO THE CLUB BODY!!");
                return;
            } else {
                System.out.println(centerMember + " ne dostoen");
            }
        }

    }

}
