import java.util.Scanner;

public class dop_HomeWork {

    public static void main(String[] args) {
        double xf1 = 0, xf2 = 0, xc1 = 0, xc2 = 0, yf1 = 0, yf2 = 0, yc1 = 0, yc2 = -0, xs, ys;
        String result;
        boolean s = true;

        System.out.println("Вводи 8 цифр по очереди через один пробел");
        System.out.println("Первые 4 цифры это координаты леса(х1 у1 х2 у2)");
        System.out.println("Вторые 4 цифры это координаты клетки с овцами(х3 у3 х4 у4)");
        System.out.println("Расставляйте точки как на примере ниже");
        System.out.println("Вот пример ввода: 2 2 8 8 4 4 6 6");
        System.out.println("________*");
        System.out.println("|  ___* |");
        System.out.println("| |   | |");
        System.out.println("| *___| |");
        System.out.println("*_______|");
        System.out.println("Вводите свои координаты");
        Scanner sc = new Scanner(System.in);
        while (s == true) {
            xf1 = sc.nextDouble();
            yf1 = sc.nextDouble();
            xf2 = sc.nextDouble();
            yf2 = sc.nextDouble();
            xc1 = sc.nextDouble();
            yc1 = sc.nextDouble();
            xc2 = sc.nextDouble();
            yc2 = sc.nextDouble();
            if (xc1 <= xf1 || xc2 >= xf2 || yc1 <= yf1 || yc2 >= yf2 || xc2 <= xc1 || yc2 <= yc1) {
                System.out.println("Клетка должны быть окружена лесом");
                continue;
            }
            break;
        }

        System.out.println("Вводи координаты которые тебе интересны");
        System.out.println("(тоже через пробел как и в начале)");
        xs = sc.nextDouble();
        ys = sc.nextDouble();
        if (xs >= xc1 && xs <= xc2 && ys >= yc1 && ys <= yc2) {
            result = "овца";
        } else if (xs >= xf1 && xs <= xf2 && ys >= yf1 && ys <= yf2) {
            result = "волк";
        } else {
            result = "пусто";
        }

        sc.close();

        System.out.println("На этой ячейке " + result);


    }
}
