package lacture13functionstringquestion.stringQuestions;

import java.util.Scanner;

public class Sum2Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int firstDigit = n.charAt(0) - '0';
        int lastDigit = n.charAt(n.length() - 1) - '0';
        System.out.println("Addition of first and last Digit" + firstDigit + lastDigit);
        // System.out.println("Addition of first and last Digit", firstDigit -
        // lastDigit);
        // System.out.println("Addition of first and last Digit" + firstDigit /
        // lastDigit);
        // System.out.println("Addition of first and last Digit" + firstDigit *
        // lastDigit);
    }

}
