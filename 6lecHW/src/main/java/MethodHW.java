import java.util.Scanner;

public class MethodHW {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x = getInt();
        int y = getInt();
        char op = getOperation();
        int result = calc(x, y, op);
        print(result);
    }

    public static int getInt() {
        System.out.print("Введите число: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Попробуйте еще раз");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.print("Введите операцыю: ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Попробуйте еще раз");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int x, int y, char operation) {
        int result = 0;
        switch (operation) {
            case '+' -> result = x + y;
            case '-' -> result = x - y;
            case '*' -> result = x * y;
            case '/' -> result = x / y;
            default -> {
                System.out.println("Попробуйте еще раз");
                result = calc(x, y, getOperation());
            }
        }
        return result;
    }

    public static void print(int x) {
        System.out.println(x);
    }
}
