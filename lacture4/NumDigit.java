package lacture4;

import java.util.Scanner;

public class NumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0; 

        for (int i = n; i > 0; i /= 10) {
            count += 1;
        }
        System.out.println(count);
    }
    
}
