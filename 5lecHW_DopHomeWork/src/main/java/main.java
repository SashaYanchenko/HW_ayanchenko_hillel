import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String task = sc.next();
        switch (task) {
            case "arr1":
                arrOne();

            case "arr2":
                arrTwo();

            case "arr3":
                arrTree();

        }
        sc.close();
    }

    public static void arrOne() {
        System.out.println("Введи размерность массива");
        Scanner sc = new Scanner(System.in);
        boolean result = true;
        int n1 = 0;
        while (result == true) {
            n1 = sc.nextInt();
            if (n1 < 2 || n1 > 100) {
                System.out.println("Введи размерность массива");
                continue;
            }
            break;
        }
        int arr[][] = new int[n1][n1];
        System.out.println("Теперь давайзаполним твой массив");
        for (int i = 0; i < n1; i++) {
            System.out.println("Строка № " + (i + 1));
            for (int j = 0; j < n1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int x = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = i + 1; j < n1; j++) {
                if (arr[i][j] == arr[j][i]) {
                    continue;
                } else {
                    x++;
                }
            }
        }
        if (x == 0) {
            System.out.println("Ваша матрица симметрична относительно главной диагонали");
        } else {
            System.out.println("Ваша матрица несимметрична относительно главной диагонали");
            System.out.println("Вот количество несовпавших элементов: " + x);
        }
        sc.close();
    }

    public static void arrTwo() {
        System.out.println("Введи размерность массива");
        Scanner sc = new Scanner(System.in);
        boolean result = true;
        int n = 0;
        int m = 0;
        while (result == true) {
            System.out.print("i = ");
            n = sc.nextInt();
            System.out.print("j = ");
            m = sc.nextInt();
            if (n < 2 || m < 2) {
                System.out.println("Введи размерность массива");
                continue;
            }
            break;
        }
        int x = 0;
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = x;
                    x++;

                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    arr[i][j] = x;
                    x++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
        sc.close();

    }

    public static void arrTree() {
        System.out.println("Введи размерность массива");
        Scanner sc = new Scanner(System.in);
        boolean result = true;
        int n3 = 0;
        while (result == true) {
            n3 = sc.nextInt();
            if (n3 < 3 || n3 > 30) {
                System.out.println("Введи размерность массива");
                continue;
            }
            break;
        }
        int arr[][] = new int[n3][n3];
        for (int i = 0; i < n3; i++) {
            for (int j = 0; j < n3; j++) {
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                } else if (j > i){
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < n3; i++) {
            for (int j = 0; j < n3; j++) {
                if (arr[i][j] == 0) {
                    System.out.printf("%3s ", " ");
                } else {
                    System.out.printf("%3d ", arr[i][j]);
                }
            }
            System.out.println();
        }
    }
}
