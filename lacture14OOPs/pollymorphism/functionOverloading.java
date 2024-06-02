package lacture14OOPs.pollymorphism;

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
    Couple(int first, int second){
        this.first = first;
        this.second = second;
    }

    //    Methods
    String convertToString() {
        return "[" + first + ", " + second + "]";
    }

    boolean equals(Couple c){

        return first == c.first && second == c.second;
    }

//    function overloading
    int multiply() {
        return first * second;
    }

    int multiply(int first, int second){
        return first * second;
    }

    Couple multiply(int num) {
        return new Couple(num * first, num * second);
    }
    Couple multiply(Couple c) {
        return new Couple(first * c.first, second * c.second);
    }

}

public class functionOverloading {
    public static void main(String[] args) {
        Couple c = new Couple(15,10);
        Couple c1 = new Couple(24,27);
        System.out.println(c.multiply());
        System.out.println(c.multiply(24,27));
        System.out.println(c.multiply(21).convertToString());
        System.out.println(c.multiply(c1).convertToString());

    }
}
