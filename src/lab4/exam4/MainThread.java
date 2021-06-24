package lab4.exam4;

import lab4.exam4.entity.Car;
import lab4.exam4.entity.LuxuryCar;

public class MainThread {
    public static void main(String[] args) {
        Car c = new LuxuryCar();
        c.accelerate();
        ((LuxuryCar) c).service();
    }
}
