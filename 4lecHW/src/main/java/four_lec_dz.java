import java.util.Scanner;

public class four_lec_dz {

    public static void main(String[] args) {
        Scanner sc_main = new Scanner(System.in);
        int i = sc_main.nextInt();
        switch (i) {
            case 1:
                TASK1();
                break;
            case 2:
                TASK2();
                break;
            case 3:
                TASK3();
                break;
            case 4:
                TASK4();
                break;
            case 5:
                TASK5();
                break;
            case 6:
                TASK6();
                break;
            case 7:
                TASK7();
                break;
            case 8:
                TASK8();
                break;
            case 9:
                TASK9();
                break;
        }


    }

    public static void TASK1() {
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

    public static void TASK2() {
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

    public static void TASK3() {
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

    }

    public static void TASK4() {
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

    }

    public static void TASK5() {
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

    }

    public static void TASK6() {
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

    public static void TASK7() {
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

    public static void TASK8() {
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

    public static void TASK9() {
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
