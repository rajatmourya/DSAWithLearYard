package lacture14OOPs.encapsulation;


class Car{
    String make;
    String model;
    int kmDriven;

    String stringFormate() {
        return make + ' ' + model + ' ' + "( " + kmDriven + " )";
    }

    void turnOn() {
        System.out.println("Your" + model + "is turned on now");
    }

    void turnOff() {
        System.out.println("Your" + model + "is turned off now");
    }

    void moveForword() {
        System.out.println("Going forword in full speed");
        kmDriven += 2;
    }

    void moveBackword() {
        System.out.println("Going backword carefully");
        kmDriven += 1;
    }
}

public class CarClass {
    public static void main(String[] args) {
        Car amanCreta = new Car();
        amanCreta.make = "Hyndai";
        amanCreta.model = "Creta";
        amanCreta.kmDriven = 38000;

        System.out.println(amanCreta.model);
        System.out.println(amanCreta.stringFormate());
        amanCreta.turnOn();
        amanCreta.turnOff();
        amanCreta.moveForword();
        amanCreta.moveBackword();
    }
}
