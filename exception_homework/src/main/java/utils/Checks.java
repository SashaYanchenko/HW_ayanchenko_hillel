package utils;
import exceprions.WrongPasswordException;
import exceprions.WrongLoginException;

import java.util.Scanner;

public class Checks {
    static Scanner scanner = new Scanner(System.in);
    public static boolean CheckLogin (boolean result) throws WrongLoginException {
        String login = scanner.nextLine();
        if (login.length() == 0) {
            throw new WrongLoginException("WrongLoginException", "Fill in the login field");
        }
        if (login.length() > 20) {
            throw new WrongLoginException("WrongLoginException", "More than 20 signs");
        }
         int logLowLine = 0;
        if (login.contains("_")) {
            logLowLine++;
        }
        if (logLowLine == 0) {
            throw new WrongLoginException("WrongLoginException", "Your login should contain '_' sign");
        }
        return result = true;
    }

    public static boolean CheckPassword(boolean result) throws WrongPasswordException {
        String password = scanner.nextLine();
        if (password.length() == 0) {
            throw new WrongPasswordException("WrongPasswordException", "Fill in the password field");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("WrongPasswordException", "More than 20 signs");
        }
        int passLowLine = 0;
        if (password.contains("_")) {
            passLowLine++;
        }
        int passExclaimMark = 0;
        if (password.contains("!")) {
            passExclaimMark++;
        }
        if (passLowLine == 0 && passExclaimMark == 0) {
            throw new WrongPasswordException("WrongPasswordException", "Your password should contain '_' sign and '!' sign");
        } else if (passLowLine == 0 && passExclaimMark != 0) {
            throw new WrongPasswordException("WrongPasswordException", "Your password should contain '_' sign");
        } else if (passLowLine != 0 && passExclaimMark == 0) {
            throw new WrongPasswordException("WrongPasswordException", "Your password should contain '!' sign");
        }
        System.out.print("Confirmation password: ");
        String confirmPassword = scanner.nextLine();
        if (confirmPassword.equals(password)) {
            System.out.println("Confirm password matches with your password");
        } else {
            throw new WrongPasswordException("WrongPasswordException", "Conform password should match with password!");
        }
        return result = true;
    }
}