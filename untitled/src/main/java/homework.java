import java.util.Scanner;

public class homework {

    public static void main(String[] args) {
        System.out.println("Введите номер задачи");
        System.out.println("Задачи: loop1-loop4 или arr1-arr3");
        Scanner sc = new Scanner(System.in);
        String task = sc.next();
        switch (task) {
            case "loop1":
                loopOne();

            case "loop2":
                loopTwo();

            case "loop3":
                loopTree();

            case "loop4":
                loopFour();

            case "arr1":
                arrOne();

            case "arr2":
                arrTwo();

            case "arr3":
                arrThree();
        }
        sc.close();
    }


    public static void loopOne() {
        int x = 0;
        boolean result = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи размерность массива");
        while (result == true) {
            x = sc.nextInt();
            if (x < 1) {
                continue;
            }
            result = false;
        }
        int arr[] = new int[x];
        System.out.println("Теперь давай заполним массив числами");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Вот четырехзначные числа из твоего массива");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 999 && arr[i] < 10000) {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }


    public static void loopTwo() {
        int x = 0;
        boolean result = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи размерность массива");
        while (result == true) {
            x = sc.nextInt();
            if (x < 1) {
                continue;
            }
            result = false;
        }
        int arr[] = new int[x];
        System.out.println("Теперь давай заполним массив числами");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Вот все неотрицательные числа из твоего массива");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
            }
        }
        sc.close();

    }


    public static void loopTree() {
        int result = 1;
        System.out.println("Введи чиисло");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Факториал твоего числа равен " + result);
        sc.close();

    }

    public static void loopFour() {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        for (n = sc.nextInt(); n != 0; n /= 10) {
            sum += (n % 10);
        }
        System.out.println("Сумма всех цифр числа, что ты ввел будет " + sum);
        sc.close();
    }


    public static void arrOne() {
        int[] arr = new int[10];
        int num = 2;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
            num += 2;
        }
        System.out.println("Вывод массива горизонтально");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Вывод массива вертикально");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    public static void arrTwo() {
        int[] arr = new int[50];
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
            num += 2;
        }
        System.out.println("Вывод чисел массива по порядку");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Вывод чисел массива по порядку");
        for (int i = arr.length - 1; i != -1; i--) {
            System.out.print(arr[i] + " ");
        }

    }


    public static void arrThree() {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        double avg1, avg2;
        System.out.println("Первый массив");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 5);
            sum1 += arr1[i];
            System.out.print(arr1[i]);
        }
        System.out.println();
        System.out.println("Второй массив");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 5);
            sum2 += arr2[i];
            System.out.print(arr2[i]);
        }
        avg1 = sum1 / 5;
        avg2 = sum2 / 5;
        System.out.println();
        if (avg1 > avg2) {
            System.out.println("Среднее значение первого массива больше: " + avg1);
        } else if (avg2 > avg1) {
            System.out.println("Среднее значение второго массива больше: "+ avg2);
        } else {
            System.out.println("Средние значения массивов одинаковые: " + avg1);
        }
    }
}
