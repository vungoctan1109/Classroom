package lab4.lab.assignment;

import lab4.lab.assignment.entity.Circle;
import lab4.lab.assignment.entity.Cylinder;

public class MainThread {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(4);
        cylinder.setRadius(5);
        System.out.printf("Area of cylinder: %f", cylinder.getArea());
        System.out.printf("\nVolume of cylinder: %f", cylinder.getVolume());
    }
}
