import exceprions.WrongPasswordException;
import exceprions.WrongLoginException;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        regUser();

    }

    public static void regUser() {
        Scanner scanner = new Scanner(System.in);
        int logLowLine;
        int passLowLine;
        int passExclaimMark;
        boolean loginResult = false;
        boolean passResult = false;
        boolean passConfirmResult = false;
        try {
            System.out.println("REGISTRATION");
            System.out.println("Tip: Your login should be less than 20 signs length and contain '_' sign");
            System.out.print("Login: ");
            String login = scanner.nextLine();
            if (login.length() == 0) {
                throw new WrongLoginException("WrongLoginException", "Fill in the login field");
            }
            if (login.length() > 20) {
                throw new WrongLoginException("WrongLoginException", "More than 20 signs");
            }
            logLowLine = 0;
            for (int i = 0; i < login.length(); i++) {
                if (login.charAt(i) == '_') {
                    logLowLine++;
                }
            }
            if (logLowLine == 0) {
                throw new WrongLoginException("WrongLoginException", "Your login should contain '_' sign");
            }
            loginResult = true;
            System.out.println("Tip: Your password should be less than 20 signs length and contain '_' sign and '!' sign");
            System.out.print("Password: ");
            String password = scanner.nextLine();
            if (password.length() == 0) {
                throw new WrongPasswordException("WrongPasswordException", "Fill in the password field");
            }
            if (password.length() > 20) {
                throw new WrongPasswordException("WrongPasswordException", "More than 20 signs");
            }
            passLowLine = 0;
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) == '_') {
                    passLowLine++;
                }
            }
            passExclaimMark = 0;
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) == '!') {
                    passExclaimMark++;
                }
            }
            if (passLowLine == 0 && passExclaimMark == 0) {
                throw new WrongPasswordException("WrongPasswordException", "Your password should contain '_' sign and '!' sign");
            } else if (passLowLine == 0 && passExclaimMark != 0) {
                throw new WrongPasswordException("WrongPasswordException", "Your password should contain '_' sign");
            } else if (passLowLine != 0 && passExclaimMark == 0) {
                throw new WrongPasswordException("WrongPasswordException", "Your password should contain '!' sign");
            }
            passResult = true;
            System.out.print("Confirmation password: ");
            String confirmPassword = scanner.nextLine();
            if (confirmPassword.equals(password)) {
                System.out.println("Confirm password matches with your password");
            } else {
                throw new WrongPasswordException("WrongPasswordException", "Conform password should match with password!");
            }
            passConfirmResult = true;
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage() + " - " + e.getTitle());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage() + " - " + e.getTitle());
        } finally {
            if (loginResult && passResult && passConfirmResult) {
                System.out.println("Success!");
            } else {
                System.out.println("Try one more time!");
            }
        }
    }
}
