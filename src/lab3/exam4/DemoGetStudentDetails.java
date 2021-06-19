package lab3.exam4;

import java.util.Scanner;

public class DemoGetStudentDetails {
    public static void main(String[] args) {
        String name;
        int age;
        float weight;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("student name: ");
        name = keyboard.nextLine();
        System.out.println("student age: ");
        age = keyboard.nextInt();
        System.out.println("weight: ");
        weight = keyboard.nextFloat();
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("weight: " + weight);
    }
}
