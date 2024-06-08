package lacture4;

public class NumberPatterns2 {

    public static void numericSquarePatternsP1(int rows, int cols){
//                                      Pattern 1
//        Write a program to print 0s and 1s at alternate columns.
//                   Input:                                              Output:
//                 rows = 5                                               11111
//                 cols = 5                                               22222
//                                                                        33333
//                                                                        44444
//                                                                        55555

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void numericSquarePatternsP2(int rows, int cols){
//                                      Pattern 2
//        Write a program to print 0s and 1s at alternate columns.
//                   Input:                                              Output:
//                 rows = 5                                               12345
//                 cols = 5                                               12345
//                                                                        12345
//                                                                        12345
//                                                                        12345

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void numericSquarePatternsP3(int rows, int cols){
//                                      Pattern 3
//        Write a program to print 0s and 1s at alternate columns.
//                   Input:                                              Output:
//                 rows = 5                                               12345
//                 cols = 5                                               23456
//                                                                        34567
//                                                                        45678
//                                                                        56789
        for (int i = 0; i < rows; i++) {
            for (int j = i+1; j <= cols+i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void numericSquarePatternsP4(int rows, int cols)  {
//                                      Pattern 4
//        Write a program to print 0s and 1s at alternate columns.
//                   Input:                                              Output:
//                 rows = 5                                               1  2  3  4  5
//                 cols = 5                                               6  7  8  9 10
//                                                                        11 12 13 14 15
//                                                                        16 17 18 19 20
//                                                                         21 22 23 24 25
        int temp = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = i+1; j <= cols+i; j++) {
                System.out.print(temp + " ");
                temp += 1;
            }
            System.out.println();
        }
    }

    public static void numericSquarePatternsP5(int rows, int cols)  {
//                                      Pattern 5
//        Write a program to print 0s and 1s at alternate columns.
//                   Input:                                              Output:
//                 rows = 5                                               55555
//                 cols = 5                                               54444
//                                                                        54333
//                                                                        54322
//                                                                        54321
        for (int i = 0; i < rows; i++) {
            int temp = 5;
            for (int j = 1; j <= cols; j++) {
                System.out.print(temp);
               if(j <= i){
                   temp -= 1;
               }

            }
            System.out.println();
        }
    }

    public static void numericSquarePatternsP6(int rows, int cols)  {
//                                      Pattern 6
//        Write a program to print 0s and 1s at alternate columns.
//                   Input:                                              Output:
//                 rows = 5                                               55555
//                 cols = 5                                               44445
//                                                                        33345
//                                                                        22345
//                                                                        12345

        for (int i = rows; i > 0; i--) {
            int temp = i;
            for (int j = 1; j <= cols; j++) {
                System.out.print(temp);
                if(j >= temp){
                    temp += 1;
                }
            }
            System.out.println();
        }
    }



}
