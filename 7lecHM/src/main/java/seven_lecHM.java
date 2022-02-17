import java.util.Random;
import java.util.Scanner;


public class seven_lecHM {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int num = getNumber();
        switch (num) {
            case 1 -> taskOne();
            case 2 -> taskTwo();
            case 3 -> taskThree();
        }
    }

    public static void taskOne() {
        print("Введите строку с которой будем работать");
        String s = getString();
        print("Вот последний символ: ");
        printLastChar(s);
        print("Давайте проверим, заканчивается ли наша строка на подстроку, которую ты введешь");
        String ends = getString();
        ifEndsWith(s, ends);
        print("Давайте теперь проверим, начинается ли наша строка на подстроку, которую ты введешь");
        String starts = getString();
        ifStartsWith(s, starts);
        print("Давай посмотрим если введеная тобой подстрока в нашей строке");
        String contains = getString();
        ifStringContain(s, contains);
        print("Давай теперь найдем положение введеной тобой подстроки");
        String search = getString();
        searchForString(s, search);
        print("Вот строка, с которой мы работаем. Какие буквы ты хочешь в ней заменить?");
        print(s);
        char original = getOriginalChar();
        char newChar = getNewChar();
        replaceOfChars(s, original, newChar);
        upperCaseString(s);
        lowerCaseString(s);
        print("Давай теперь обрежем нашу строку");
        print("Нужно ввести два индекса, с которого и по какой будет обрезаться строка");
        print("Помни, что мы начинаем считать с 0");
        int ind1 = getNumber();
        int ind2 = getNumber();
        cutTheSting(s, ind1, ind2);
    }

    public static void taskTwo() {
        String[] arrSurname = {"Иванов", "Петров", "Саныч", "Карен", "Саша", "Демьян", "Кирил", "Леонард", "Шелдон", "Онуфрий"};
        String[] arrMark = {"1", "2", "3", "4", "5"};
        String[] arrSubject = {"Математика", "Информатика", "Литература", "Физ-ра", "Астрономия", "Физика", "Англтйский", "Труды"};
        int n = getNumber();
        String[][] arrTable = getArray(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    arrTable[i][j] = getRandSurname(arrSurname);
                }
                if (j == 1) {
                    arrTable[i][j] = getRandMark(arrMark);
                }
                if (j == 2) {
                    arrTable[i][j] = getRandSubject(arrSubject);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    printSurname(arrTable[i][j]);
                }
                if (j == 1) {
                    printMark(arrTable[i][j]);
                }
                if (j == 2) {
                    printSubject(arrTable[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void taskThree() {
        String s = getString();
        String[] arr = getArraySplit(s);
        int diff = 1;
        int minI;
        int[] minDiff = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int n = 0; n < arr[i].length() - 1; n++) {
                if (arr[i].charAt(n) != (arr[i].charAt(n + 1))) {
                    diff++;
                }
            }
            minDiff[i] = diff;
            diff = 1;
        }
        minI = minDiff[0];
        for (int i = 0; i < minDiff.length; i++)
            if (minDiff[i] < minI) {
                minI = minDiff[i];
            }
        System.out.println(arr[minI]);
    }

    public static int getNumber() {
        System.out.println("Введите число");
        int x;
        while (true) {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                return x;
            }
            System.out.println("Ошибка! Давай попробуем еще раз");
        }
    }

    public static String getString() {
        System.out.println("Введите строку: ");
        String s;
        scanner.nextLine();
        while (true) {
            if (scanner.hasNextLine()) {
                s = scanner.nextLine();
                return s.trim();
            }
            System.out.println("Ошибка! Давай попробуем еще раз");
        }
    }

    public static char getOriginalChar() {
        System.out.println("Введи букву, которую будем менять");
        char s;
        while (true) {
            if (scanner.hasNextLine()) {
                s = scanner.nextLine().charAt(0);
                return s;
            }
            System.out.println("Ошибка! Давай попробуем еще раз");
        }
    }

    public static char getNewChar() {
        System.out.println("Введи новую букву");
        char s;
        while (true) {
            if (scanner.hasNextLine()) {
                s = scanner.nextLine().charAt(0);
                return s;
            }
            System.out.println("Ошибка! Давай попробуем еще раз");
        }
    }

    public static void print(String x) {
        System.out.println(x);
    }

    public static void printLastChar(String x) {
        int l = x.length() - 1;
        System.out.println(x.charAt(l));
    }

    public static void ifEndsWith(String s, String s1) {
        if (s.endsWith(s1)) {
            print("Правда, наша строка заканчивается на " + s1);
        } else {
            print("Неправда, нету такой подстроки в конце нашей строки");
        }
    }

    public static void ifStartsWith(String s, String s1) {
        if (s.startsWith(s1)) {
            print("Правда, наша строка начинается на " + s1);
        } else {
            print("Неправда, нету такой подстроки в начале нашей строки");
        }
    }

    public static void ifStringContain(String s, String s1) {
        if (s.contains(s1)) {
            print("Правда, такая подстрока есть в нашей строке");
        } else {
            print("Неправда, нету такой подстроки в нашей строке");
        }
    }

    public static void searchForString(String s, String s1) {
        int x;
        x = s.indexOf(s1);
        System.out.println(x);
    }

    public static void replaceOfChars(String s1, char c1, char c2) {
        String s2;
        s2 = s1.replace(c1, c2);
        System.out.println("Вот новая строка: " + s2);
    }

    public static void upperCaseString(String s) {
        s = s.toUpperCase();
        System.out.println("Вот наша строка в верхнем регистре " + s);
    }

    public static void lowerCaseString(String s) {
        s = s.toLowerCase();
        System.out.println("Вот наша строка в нижнем регистре " + s);
    }

    public static void cutTheSting(String s, int x1, int x2) {
        String s1;
        s1 = s.substring(x1, x2);
        System.out.println("Вот, что у нас вышло: " + s1);
    }

    public static String[][] getArray(int x) {
        return new String[x][3];
    }

    public static String getRandSurname(String[] x) {
        String s;
        s = (x[random.nextInt(x.length)]);
        return s;
    }

    public static String getRandMark(String[] x) {
        String s;
        s = (x[random.nextInt(x.length)]);
        return s;
    }

    public static String getRandSubject(String[] x) {
        String s;
        s = (x[random.nextInt(x.length)]);
        return s;
    }

    public static void printSurname(String x) {
        System.out.printf("Студент %-15s", x);
    }

    public static void printMark(String x) {
        System.out.printf("получил %-3s", x);
    }

    public static void printSubject(String x) {
        System.out.printf("по %-10s", x);
    }

    public static String[] getArraySplit(String s) {
        String[] arr = s.split(" ");
        return arr;
    }


}
