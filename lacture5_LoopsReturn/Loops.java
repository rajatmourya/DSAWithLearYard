package lacture5_LoopsReturn;

import java.util.Scanner;

class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintReverseNumber printReverseNumber = new PrintReverseNumber();
        Questions1 qus = new Questions1();
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
//        System.out.println(printReverseNumber.reverse(num));
//        System.out.println(qus.palindromeOrNot(num));
        System.out.println(qus.powerOfNumber(num,13));
    }
}


class PrintReverseNumber{
    public int reverse(int num){
        int rev = 0;
        while(num > 0){
            rev = rev*10 + num%10;
            num /= 10;
        }
        return rev;
    }
}

class Questions1 {

    public boolean palindromeOrNot(int num){
        String s= String.valueOf(num);
        int f = 0;
        int r = s.length()-1;
        boolean ans = true;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(f) == s.charAt(r)){
                f++;
                r--;
            }else{
                return false;
            }
        }

        System.out.println(s);
        return ans;
    }

    public int powerOfNumber(int num, int pow){
        int ans = 1;
        while(pow > 0){
            ans *= num;
            pow--;
        }
        return ans;
    }

}