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
//        System.out.println(qus.powerOfNumber(num,13));
//        int[] fact = qus.factorsOfTheNumber(num);
//        for(int e: fact){
//            if(e != 0){
//                System.out.print(e + " ");
//            }
//        }
//        System.out.println(qus.factorial(num));
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        System.out.println(qus.lcm(num1,num2));

        Questions2 qus2 = new Questions2();
//        System.out.println(qus2.armstrongNumber(num));
        System.out.println(qus2.perfectNumbers(num));

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

    public int[] factorsOfTheNumber(int num){
        int j = 0;
        int[] ans = new int[num/2+1];
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                ans[j] = i;
                j+=1;
            }
        }
        ans[j] = num;
        return ans;
    }

    public int factorial(int num){
        int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans *= i;
        }
        return ans;
    }

    public int lcm(int num1, int num2){
        int max = (num1 > num2) ? num1 : num2;
        int i = max;
        int lcm = 1;
        while (true){
            if (i % num1 == 0 && i % num2 == 0){
                lcm = i;
                break;
            }
            i += max;
        }
        return lcm;
    }


}

class Questions2 {

    public boolean armstrongNumber(int num){
        int len = Integer.toString(num).length();
        int n = num;
        int ans = 0;
        while (num > 0){
            ans += Math.pow((num%10),len);
            num /= 10;
        }
        return ans == n ?true:false;
    }

    public boolean perfectNumbers(int num){
        int ans = 0;
        int i = 1;
        while (i <= num / 2){
            if(num % i == 0){
                ans += i;
            }
            i += 1;
        }
        return ans == num ? true : false;
    }


}