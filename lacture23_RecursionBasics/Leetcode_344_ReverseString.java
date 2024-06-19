package lacture23_RecursionBasics;

import java.util.Scanner;

public class Leetcode_344_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Character in the Array:");
        int n = sc.nextInt();
        System.out.println("Enter the Character of the Array: ");
        String ss = sc.next();
        if (ss.length() == n) {
            char[] s = ss.toCharArray();
//        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
            char[] ans = new Solution1().reverseString(s);
            for (char e : ans) {
                System.out.print(e + " ");
            }
        } else {
            System.out.println("you Entered more then " + n + " Charters");
        }
    }
}

class Solution1 {
    public char[] reverseString(char[] s) {
        reverseStringHelper(s,0,s.length-1);
        return s;
    }

    void reverseStringHelper(char[] s,int start,int last){
        if(start == last || start > last)  return;
        char temp = s[start];
        s[start] = s[last];
        s[last] = temp;
        reverseStringHelper(s,start+1,last-1);
    }
}