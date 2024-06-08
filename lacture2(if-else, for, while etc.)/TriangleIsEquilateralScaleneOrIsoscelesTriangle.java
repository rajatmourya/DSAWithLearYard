package Lacture2;

import java.util.Scanner;

public class TriangleIsEquilateralScaleneOrIsoscelesTriangle {

//    Write a Java program to input sides of a triangle and check whether a triangle is equilateral, scalene or isosceles triangle.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstSide = sc.nextInt();
        int secondSide = sc.nextInt();
        int thirdSide = sc.nextInt();

        if( firstSide == secondSide && secondSide == thirdSide){
            System.out.println("The triangle is Equilateral Triangle");
        } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
            System.out.println("The triangle is Isosceles Triangle");
        }else {
            System.out.println("A triangle is Scalene Triangle");
        }
    }
}
