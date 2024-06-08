package lacture4;

import java.util.Scanner;

public class NumberPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number of Rows: ");
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
        int rows = 6;
        int cols = 5;
//        NumberPatterns1.squareNumberPatternsP1(rows,cols);
//        NumberPatterns1.squareNumberPatternsP2(rows,cols);
//        NumberPatterns1.squareNumberPatternsP3(rows,rows);
//        NumberPatterns1.squareNumberPatternsP4(5,5);
//        NumberPatterns1.squareNumberPatternsP5(5,5);
//        NumberPatterns1.squareNumberPatternsP6(5,5);
//        NumberPatterns1.squareNumberPatternsP7(5,5);

//                                  Number Patterns 2

//        NumberPatterns2.numericSquarePatternsP1(5,5);
//        NumberPatterns2.numericSquarePatternsP2(5,5);
//        NumberPatterns2.numericSquarePatternsP3(5,5);
//        NumberPatterns2.numericSquarePatternsP4(5,5);
//        NumberPatterns2.numericSquarePatternsP5(5,5);
//        NumberPatterns2.numericSquarePatternsP6(5,5);

        //


    }
}

class NumberPatterns1 {

    public static void squareNumberPatternsP1(int rows, int cols) {
//        Pattern 1: Print 1, 0 number pattern at alternate rows
//        Write a program to print 0s and 1s at alternate rows.
//               if input is :                               output is:
//                rows = 6                                       11111
//                cols = 5                                       00000
//                                                               11111
//                                                               00000
//                                                               11111
//                                                               00000

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 == 0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();

        }



    }

    public static void squareNumberPatternsP2(int rows, int cols) {
//        Pattern 2: Print 1, 0 number pattern at alternate columns.
//        Write a program to print 0s and 1s at alternate columns.
//                   Input:                                             Output:
//                 rows = 6                                               01010
//                 cols = 5                                               01010
//                                                                        01010
//                                                                        01010
//                                                                        01010
//                                                                        01010

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j % 2 == 0){
                    System.out.print("0");
                }else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }

    }

    public static void squareNumberPatternsP3(int rows, int cols) {
//        Pattern 3: Print box number pattern of 1s and 0s.
//        Write a program to print 0s and 1s at alternate columns.
//                   Input:                                             Output:
//                 rows = 6                                               11111
//                 cols = 5                                               10001
//                                                                        10001
//                                                                        10001
//                                                                        10001
//                                                                        11111

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows-1 || j == 0 || j == cols-1){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void squareNumberPatternsP4(int rows, int cols) {
//        Pattern 4: Print chessboard number pattern with 1 and 0
//        Write a program to print 0s and 1s at alternate columns.
//                   Input:                                             Output:
//                 rows = 5                                               10101
//                 cols = 5                                               01010
//                                                                        10101
//                                                                        01010
//                                                                        10101

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i+j) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void squareNumberPatternsP5(int rows, int cols) {
//        Pattern 5: Print box number pattern with plus in center
//        Write a program to print 0s and 1s at alternate columns.
//                   Input:                                             Output:
//                 rows = 5                                               11011
//                 cols = 5                                               11011
//                                                                        00000
//                                                                        11011
//                                                                        11011


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == rows/2 || j == cols/2){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    public static void squareNumberPatternsP6(int rows, int cols) {
//        Pattern 6: Print box number pattern of 1 and 0 with cross center
//        Write a program to print 0s and 1s at alternate columns.
//                   Input:                                             Output:
//                 rows = 5                                               10001
//                 cols = 5                                               01010
//                                                                        00100
//                                                                        01010
//                                                                        10001

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == j || i+j == rows+1){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void squareNumberPatternsP7(int rows, int cols) {
//        Pattern 7: Print circle box number pattern with 1 and 0
//        Write a program to print 0s and 1s at alternate columns.
//                   Input:                                             Output:
//                 rows = 5                                               01110
//                 cols = 5                                               10001
//                                                                        10001
//                                                                        10001
//                                                                        01110

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (((i == 1 || i == rows) && (j > 1 && j < cols)) || ((j == 1 || j == cols) && (i != 1 && i != rows))){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


}
