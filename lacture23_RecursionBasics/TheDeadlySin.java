package lacture23_RecursionBasics;

import java.util.Scanner;

public class TheDeadlySin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int m = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(theDeadlySinHelper(m,b));
        }
    }

    static int theDeadlySinHelper(int n, int m){
        if (n == m || n == 0 || m == 0)
            return n + m;
        if (n < m) {
            int temp = n;
            n = m;
            m = temp;
        }
        n %= m;
        if (n == 0)
            n = m;
        return theDeadlySinHelper(n, m);
    }
}
