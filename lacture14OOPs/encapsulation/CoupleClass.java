package lacture14OOPs.encapsulation;

class Couple{
//    properties
    int first;
    int second;

//    by default constructor initialize the value or all variable 0

//    constructor
     Couple() {
        System.out.println("hello");
        first = -1;
        second = -1;

    }

//    parameterized constructor
    Couple(int f, int s){
         first = f;
         second = s;
    }


//    Methods
    String convertToString() {
        return "[" + first + ", " + second + "]";
    }

    boolean equals(Couple c){
        return first == c.first && second == c.second;
    }
}

public class CoupleClass {
    public static void main(String[] args) {
        Couple c1 = new Couple();
        c1.first = 5;
        c1.second = 10;
        System.out.println(c1);
        System.out.println(c1.convertToString());

        Couple c2 = new Couple(5,101);
        System.out.println(c2.convertToString());
        System.out.println(c1.equals(c2));

//        When you will not provide ny value to the variables tht time default constructor call and that time value of the variable by default 0
        Couple c3 = new Couple();
        System.out.println(c3.convertToString());

    }
}
