package lab2.doityourself2;

import lab2.doityourself2.entity.Temperature;

public class MainThread {
    public static void main(String[] args) {
        //Initializing Temperature object.
        Temperature temperature = new Temperature();

        //Assign values of C temperature to the object at a temperature of 25 degrees.
        temperature.setCTemp(25);

        //Display to screen F and Kelvin temperature, respectively.
        System.out.printf("F Temperature: %.2f°F", temperature.getFTemp());
        System.out.printf("\nK Temperature: %.2f°K", temperature.getKTemp());
    }
}
