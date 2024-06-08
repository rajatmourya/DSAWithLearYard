package lacture5_LoopsReturn;

public class TriangularNumberPatterns1 {

    public static void TriangularNumberPatterns1P1(int n){
//                                      Pattern 1

//                   Input:                                              Output:
//                    n = 5                                                 1
//                                                                          22
//                                                                          333
//                                                                          4444
//                                                                          55555

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void TriangularNumberPatterns1P2(int n){
//                                      Pattern 2

//                   Input:                                                     Output:
//                    n = 5                                                         1
//                                                                                 22
//                                                                                333
//                                                                               4444
//                                                                              55555

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= n-i+1){
                    System.out.print(i);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void TriangularNumberPatterns1P3(int n){
//                                      Pattern 3

//                   Input:                                                     Output:
//                    n = 5                                                         55555
//                                                                                  4444
//                                                                                  333
//                                                                                  22
//                                                                                  1

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void TriangularNumberPatterns1P4(int n){
//                                      Pattern 4

//                   Input:                                                     Output:
//                    n = 5                                                         11111
//                                                                                  2222
//                                                                                  333
//                                                                                  44
//                                                                                  5

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void TriangularNumberPatterns1P4_2(int n){
//                                      Pattern 4.2

//                   Input:                                                     Output:
//                    n = 5                                                         5
//                                                                                  44
//                                                                                  333
//                                                                                  2222
//                                                                                  11111

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void TriangularNumberPatterns1P5(int n){
//                                      Pattern 5

//                   Input:                                                     Output:
//                    n = 5                                                         1
//                                                                                  12
//                                                                                  123
//                                                                                  1234
//                                                                                  12345

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void TriangularNumberPatterns1P5_2(int n){
//                                      Pattern 5.2

//                   Input:                                                     Output:
//                    n = 5                                                         12345
//                                                                                  1234
//                                                                                  123
//                                                                                  12
//                                                                                  1

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


}
