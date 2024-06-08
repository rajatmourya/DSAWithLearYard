package lacture4;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number between 1 to 7: ");
//        int n = sc.nextInt();
        int n = 6;
        Problems.problem1(2);
        Problems.problem2(17,25);
        Problems.problem3(17);
        Problems.problem4('E');

    }
}

class Problems {

    public static void problem1(int Day){
//        Write a  program to input week number(1-7) and print day of week name using switch case. Assume 1 is equivalent for Monday and 7 for Tuesday.
        switch (Day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Enter the valid number");
        }
    }

    public static void problem2(int first, int Second){
//        Write a  program to input two numbers from user and find maximum between two numbers using switch case.
        switch ((first > Second)? 1:2){
            case 1:
                System.out.println(first);
                break;
            case 2:
                System.out.println(Second);
        }
    }

    public static void problem3(int n){
//        Write a C++ program to input number from user and check whether the number is even or odd using switch case.       switch ((first > Second)? 1:2){
            switch ((n%2 == 0)? 0:1){
                case 0:
                    System.out.println("Even Number");
                    break;
                case 1:
                    System.out.println("Odd Number");
                    break;

        }
    }

    public static void problem4(char vowel){
//        Write a program to input vowels and print any word starting from that letter using switch case.
        switch (vowel){
            case 'a':
                System.out.println("apple");
                break;
            case 'e':
                System.out.println("email");
                break;
            case 'i':
                System.out.println("issue");
                break;
            case 'o':
                System.out.println("orange");
                break;
            case 'u':
                System.out.println("uttar pradesh");
                break;
            case 'A':
                System.out.println("Atemoya");
                break;
            case 'E':
                System.out.println("Egg fruit");
                break;
            case 'I':
                System.out.println("Ice Cream");
                break;
            case 'O':
                System.out.println("Olive");
                break;
            case 'U':
                System.out.println("Ugli fruit");
                break;
            default:
                System.out.println("enter vowels");
                break;
        }
    }

}