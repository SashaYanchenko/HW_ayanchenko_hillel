import exceprions.WrongPasswordException;
import exceprions.WrongLoginException;

import static utils.Checks.CheckLogin;
import static utils.Checks.CheckPassword;

public class Demo {
    public static void main(String[] args) {
        regUser();

    }

    public static void regUser() {
        boolean loginResult = false;
        boolean passResult = false;
        try {
            System.out.println("REGISTRATION");
            System.out.println("Tip: Your login should be less than 20 signs length and contain '_' sign");
            System.out.print("Login: ");
            CheckLogin(loginResult);
            System.out.println("Tip: Your password should be less than 20 signs length and contain '_' sign and '!' sign");
            System.out.print("Password: ");
            CheckPassword(passResult);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage() + " - " + e.getTitle());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage() + " - " + e.getTitle());
        } finally {
            if (loginResult && passResult) {
                System.out.println("Success!");
            } else {
                System.out.println("Try one more time!");
            }
        }
    }
}
