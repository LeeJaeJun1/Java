package week4;

import java.util.Scanner;

class Car{
    private String model;
    private String color;
    private int year;

    Car() {
        this(null,null,0);
    }
    Car(String model) {
        this(model, null, 0);
    }
    Car(String model, String color) {
        this(model,color,0);
    }
    Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    void printInfor() {
        System.out.println(model + " " + color + " " + year);
    }
}
public class week4_1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("MC20");
        Car car3 = new Car("MC20", "white");
        Car car4 = new Car("MC20", "red", 2021);

        car1.printInfor();
        car2.printInfor();
        car3.printInfor();
        car4.printInfor();
    }
}
