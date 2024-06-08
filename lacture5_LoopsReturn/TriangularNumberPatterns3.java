package lacture5_LoopsReturn;

public class TriangularNumberPatterns3 {

    public static void TriangularNumberPatterns3P1(int n){
//                                      Pattern 1

//                   Input:                                                     Output:
//                    n = 5                                                         1
//                                                                                  10
//                                                                                  101
//                                                                                  1010
//                                                                                  10101

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j%2 == 0){
                    System.out.print("0");
                }else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }

    }

    public static void TriangularNumberPatterns3P2(int n){
//                                      Pattern 1

//                   Input:                                                     Output:
//                    n = 5                                                         1
//                                                                                  00
//                                                                                  111
//                                                                                  0000
//                                                                                  11111

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%2 == 0){
                    System.out.print("0");
                }else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }

    }

    public static void TriangularNumberPatterns3P3(int n){
//                                      Pattern 1

//                   Input:                                                     Output:
//                    n = 5                                                         1
//                                                                                  01
//                                                                                  010
//                                                                                  1010
//                                                                                  10101
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                k++;
                if (k % 2 == 1){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }

    public static void TriangularNumberPatterns3P4(int n){
//                                      Pattern 1

//                   Input:                                                     Output:
//                    n = 5                                                         1
//                                                                                  11
//                                                                                  101
//                                                                                  1001
//                                                                                  11111

        for (int i = 1; i <= n; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                k++;
                if (j == 1 || j == i || i == n){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }

}
