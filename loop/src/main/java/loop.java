public class loop {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("_____________________________________");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println();

//        Вывод ^
//        * * * * * * * * * *
//        * * * * * * * * * *
//        * * * * * * * * * *
//        * * * * * * * * * *
//        * * * * * * * * * *
//        * * * * * * * * * *
//        * * * * * * * * * *
//        * * * * * * * * * *
//        * * * * * * * * * *
//        * * * * * * * * * *


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || i == 9 || j == 0 || j == 9) {
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

//        Вывод ^
//        * * * * * * * * * *
//        *                 *
//        *                 *
//        *                 *
//        *                 *
//        *                 *
//        *                 *
//        *                 *
//        *                 *
//        * * * * * * * * * *


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || j == 0 || i + j == 9) {
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

//        Вывод ^
//        * * * * * * * * * *
//        *               *
//        *             *
//        *           *
//        *         *
//        *       *
//        *     *
//        *   *
//        * *
//        *


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 9 || j == 0 || i == j) {
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

//        Вывод ^
//        *
//        * *
//        *   *
//        *     *
//        *       *
//        *         *
//        *           *
//        *             *
//        *               *
//        * * * * * * * * * *


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 9|| j == 9 || i + j == 9) {
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

//        Вывод ^
//                          *
//                        * *
//                      *   *
//                    *     *
//                  *       *
//                *         *
//              *           *
//            *             *
//          *               *
//        * * * * * * * * * *


        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (i == 0 || j == 9 || i == j) {
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

//        Вывод ^
//        * * * * * * * * * *
//          *               *
//            *             *
//              *           *
//                *         *
//                  *       *
//                    *     *
//                      *   *
//                        * *
//                          *


        for (int i =0; i < 10; i++) {
            for (int j =0; j < 10; j++) {
                if (i == j || i +j == 9) {
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


//        Вывод ^
//        *                 *
//          *             *
//            *         *
//              *     *
//                * *
//                * *
//              *     *
//            *         *
//          *             *
//        *                 *


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || i == j && i < 5 || i + j == 9 && j > 4) {
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

//        Вывод ^
//        * * * * * * * * * *
//          *             *
//            *         *
//              *     *
//                * *
//
//
//
//
//


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 9 || i == j && i > 4 || i + j == 9 && j < 5) {
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


//        Вывод ^
//
//
//
//
//
//        * *
//      *     *
//    *         *
//  *             *
//* * * * * * * * * *



    }
}
