package lacture23_RecursionBasics;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character of the Array: ");
        String s = sc.next();
        System.out.println(new Solutionn().isPalindrome(s));
        System.out.println(new Solutionn().isPalindromeLowTime(s));
    }
}
//abba
class Solutionn {
    int isPalindromeLowTime(String S) {
        int start = 0, last = S.length()-1;
        int ans = 0;
        while (start <= last){
            if((start == last )|| (start + 1 ==  last) && S.charAt(start) == S.charAt(last)){
                return 1;
            }else if (S.charAt(start) == S.charAt(last)){
                start += 1;
                last -= 1;
            }else{
                return 0;
            }
        }
        return ans;
    }

    int isPalindrome(String S) {
        return isPalindromeHelper(S,0,S.length()-1);
    }

    int isPalindromeHelper(String S,int start, int last) {
        boolean temp = S.charAt(start) == S.charAt(last);
        if((start == last )|| ((start + 1 ==  last) && temp)){
            return 1;
        }else if(temp){
            return isPalindromeHelper(S,start+1,last-1);
        }else {
        return 0;
        }
    }
}
