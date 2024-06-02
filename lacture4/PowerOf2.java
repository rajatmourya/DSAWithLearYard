package lacture4;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (;n % 2 == 0; n /= 2);
        if(n == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    
}
