import java.util.Scanner;

public class loop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = 0;
        boolean result = true;
        while (result == true) {
            x = sc.nextInt();
            if (x < 4) {
                System.out.println("Размер матрицы должен быть больше 3");
                continue;
            }
            result = false;
        }

        System.out.println();
        System.out.println("_____________________________________");
        System.out.println();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println();



        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 || i == x - 1 || j == 0 || j == x - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println();



        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 || j == 0 || i + j == x - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println();



        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == x - 1 || j == 0 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println();



        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == x - 1 || j == x - 1 || i + j == x - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println();



        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 || j == x - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println();



        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j || i + j == x - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println();



        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 || i == j && i < x / 2 || i + j == x - 1 && j > x / 2 - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println();



        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == x - 1 || i == j && i > x / 2 - 1 || i + j == x - 1  && j < x / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println();




    }
}
