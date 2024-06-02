package lacture4;

import java.util.Scanner;

public class LtoR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int ans = 0;
        for (int N = L; N <= R; N++) {
            for (int i = N; i > 0; i /= 10) {
                ans += i % 10;
            }
        }
        System.out.println(ans);
    }
}
