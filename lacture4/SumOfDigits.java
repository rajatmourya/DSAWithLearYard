package lacture4;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0; 

        for (int i = n; i > 0; i /=10) {
            ans += i%10;
        }
        ans = addDigits(n);
        System.out.println(ans);
    }
    public static int addDigits(int num) {
        int ans = 0; 
        for (int i = num; i > 0; i /=10) {
            ans += i%10;
            
        }
        return(ans);
    }
}
