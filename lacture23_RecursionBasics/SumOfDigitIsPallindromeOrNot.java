package lacture23_RecursionBasics;

import java.util.Scanner;

public class SumOfDigitIsPallindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        System.out.println(isDigitSumPalindrome(n));
    }
    static int isDigitSumPalindrome(int n) {
        int sum = 0;
        while (n != 0){
            sum += n%10;
            n=n/10;
        }
        String temp = Integer.toString(sum);
        if(isDigitSumPalindromeHelper(temp)){
            return 1;
        }else return 0;

    }

    static boolean isDigitSumPalindromeHelper(String S) {
        int start = 0, last = S.length()-1;
        boolean ans = false;
        while (start <= last){
            if((start == last )|| (start + 1 ==  last) && S.charAt(start) == S.charAt(last)){
                return true;
            }else if (S.charAt(start) == S.charAt(last)){
                start += 1;
                last -= 1;
            }else{
                return false;
            }
        }
        return ans;
    }
}
