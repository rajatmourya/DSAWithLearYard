package Lacture2;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
			int currPowOfTen = 1;
            
            ArrayList<Integer> ans = new ArrayList<Integer>();
            while (n > 0) {
                int temp = n % 10;
                n /= 10;
                if(temp > 0){
                    ans.add(temp*currPowOfTen);
                }
                currPowOfTen *= 10;
            }
            System.out.println(ans.size());
			for(int i : ans) {
				System.out.print(i + " ");
			}
			System.out.println();
        }
        sc.close();
    }
}
