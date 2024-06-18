package lacture23_RecursionBasics;

import java.util.Scanner;

public class APowerOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = sc.nextInt();
        System.out.println("Enter the Power of the Number:");
        int n = sc.nextInt();
        System.out.println(power(a,n));
        System.out.println(pow(a,n));
    }
    static int power(int a,int n){
        if(n == 0 ){
            return 1;
        }
        return a * power(a,n-1);
    }

    static int pow(int a,int n){
        if(n == 0 ) return 1;
        int perAns = pow(a,n/2);
        if(n % 2 == 0) {
            return perAns * perAns;
        }else{
            return perAns * perAns * a;
        }
    }
}
