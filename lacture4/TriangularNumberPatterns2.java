package lacture4;

public class TriangularNumberPatterns2 {

    public static void TriangularNumberPatterns2P1(int n){
//                                      Pattern 1

//                   Input:                                                     Output:
//                    n = 5                                                         1
//                                                                                  21
//                                                                                  321
//                                                                                  4321
//                                                                                  54321

        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void TriangularNumberPatterns2P1_2(int n){
//                                      Pattern 1.2

//                   Input:                                                     Output:
//                    n = 5                                                     54321
//                                                                              4321
//                                                                              321
//                                                                              21
//                                                                              1

        for (int i = n; i >= 1; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void TriangularNumberPatterns2P2(int n){
//                                      Pattern 2

//                   Input:                                                     Output:
//                    n = 5                                                     5
//                                                                              54
//                                                                              543
//                                                                              5432
//                                                                              54321

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void TriangularNumberPatterns2P2_2(int n){
//                                      Pattern 2.2

//                   Input:                                                     Output:
//                    n = 5                                                     54321
//                                                                              5432
//                                                                              543
//                                                                              54
//                                                                              5

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void TriangularNumberPatterns2P3(int n){
//                                      Pattern 3

//                   Input:                                                     Output:
//                    n = 5                                                     5
//                                                                              45
//                                                                              345
//                                                                              2345
//                                                                              12345

        for (int i = 0; i < n; i++) {
            for (int j = n-i; j <= n  ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void TriangularNumberPatterns2P3_2(int n){
//                                      Pattern 3.2

//                   Input:                                                     Output:
//                    n = 5                                                     12345
//                                                                              2345
//                                                                              345
//                                                                              45
//                                                                              5

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n  ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void TriangularNumberPatterns2P4(int n){
//                                      Pattern 4

//                   Input:                                                     Output:
//                    n = 5                                                       1
//                                                                                23
//                                                                                345
//                                                                                4567
//                                                                                56789

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i+1  ; j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }

    }

    public static void TriangularNumberPatterns2P4_2(int n){
//                                      Pattern 4.2

//                   Input:                                                     Output:
//                    n = 5                                                       56789
//                                                                                4567
//                                                                                345
//                                                                                23
//                                                                                1

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }

    }

    public static void TriangularNumberPatterns2P5(int n){
//                                      Pattern 5

//                   Input:                                                     Output:
//                    n = 5                                                       13579
//                                                                                3579
//                                                                                579
//                                                                                79
//                                                                                9

        for (int i = 1; i <= n; i++) {
            int temp = i*2 - 1;
            for (int j = i; j <= n ; j++ , temp += 2) {
                System.out.print(temp);
            }
            System.out.println();
        }

    }

    public static void TriangularNumberPatterns2P5_2(int n){
//                                      Pattern 5.2

//                   Input:                                                     Output:
//                    n = 5                                                         9
//                                                                                  79
//                                                                                  579
//                                                                                  3579
//                                                                                  13579

        for (int i = n; i >= 1; i--) {
            int temp = i*2 - 1;
            for (int j = i; j <= n ; j++ , temp += 2) {
                System.out.print(temp);
            }
            System.out.println();
        }

    }


}
