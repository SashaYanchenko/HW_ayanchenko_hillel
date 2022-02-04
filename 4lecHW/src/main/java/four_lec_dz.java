import java.util.Scanner;

public class four_lec_dz {

    public static void main(String[] args) {
        Scanner sc_main = new Scanner(System.in);
        int i = sc_main.nextInt();
        switch (i) {
            case 1:
                TaskOne();
                break;
            case 2:
                TaskTwo();
                break;
            case 3:
                TaskThree();
                break;
            case 4:
                TaskFour();
                break;
            case 5:
                TaskFive();
                break;
            case 6:
                TaskSix();
                break;
            case 7:
                TaskSeven();
                break;
            case 8:
                TaskEight();
                break;
            case 9:
                TaskNine();
                break;
        }


    }

    public static void TaskOne() {
        double sm;
        double inch;
        System.out.println("Введи sm (sm > inch) или inch (inch > sm)");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        switch (s) {
            case "sm":
                System.out.println("Введите количество сантиметров");
                sm = sc.nextDouble();
                if (sm < 1) {
                    System.out.println("Введите положительное число");
                }
                inch = sm / 2.54;
                System.out.println("Это будет " + inch + " дюймов");
                sc.close();
                break;
            case "inch":
                System.out.println("Введите количество дюймов");
                inch = sc.nextDouble();
                if (inch < 1) {
                    System.out.println("Введите положительное число");
                }
                sm = inch * 2.54;
                System.out.println("Это будет " + sm + " сантиметров");
                sc.close();
                break;
        }
    }

    public static void TaskTwo() {
        int grn;
        double result;
        System.out.println("Введите сумму хохлобаксов");
        Scanner sc = new Scanner(System.in);
        grn = sc.nextInt();
        if (grn < 1) {
            System.out.println("Введите положительное число");
        }
        result = grn / 28;
        System.out.println("Вася заработал " + result + " евро");
        sc.close();
    }

    public static void TaskThree() {
        int x;
        int dec;
        int nat;
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x < 10 || x > 99) {
            System.out.println("Введите положительное двузначное число");
        }
        dec = x / 10;
        nat = x % 10;
        System.out.println(nat + " " + dec);
        sc.close();

    }

    public static void TaskFour() {
        int x;
        int dec;
        int nat;
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x < 10 || x > 99) {
            System.out.println("Введите положительное двузначное число");
        }
        dec = x / 10;
        nat = x % 10;
        System.out.println(dec * 10 + " + " + nat);
        sc.close();

    }

    public static void TaskFive() {
        int x;
        int dec;
        int nat;
        int result;
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x < 10 || x > 99) {
            System.out.println("Введите положительное двузначное число");
        }
        dec = x / 10;
        nat = x % 10;
        result = dec + nat;
        System.out.println("Вес = " + result);
        sc.close();

    }

    public static void TaskSix() {
        int x;
        int s1;
        int s2;
        int even = 0;
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x > 99 || x < 10) {
            System.out.println("Введите двузначное число");
            System.exit(0);
        }
        s1 = x / 10;
        s2 = x % 10;
        if (s1 % 2 == 0) {
            even++;
        }
        if (s2 % 2 == 0) {
            even++;
        }
        System.out.println("Степень четности = " + even);
        sc.close();
    }

    public static void TaskSeven() {
        int x;
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x > 0) {
            System.out.println("Положительное");
        } else if (x < 0) {
            System.out.println("Отрицательное");
        } else if (x == 0) {
            System.out.println("Ноль");
        }
        sc.close();
    }

    public static void TaskEight() {
        int x;
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x / 100 >= 1) {
            System.out.println(x - 1);
        } else {
            System.out.println("Введите положительное двузначное число");
        }
        sc.close();
    }

    public static void TaskNine() {
        int x;
        int dec;
        int nat;
        int mult;
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x < 10 || x > 99) {
            System.out.println("Введите положительное двузначное число");
        }
        dec = x / 10;
        nat = x % 10;
        mult = dec * nat;
        if (mult > x) {
            System.out.println(mult);
        } else {
            System.out.println(x);
        }
        sc.close();
    }
}
