package Lab2.Step_By_Step_2;

import Lab2.Step_By_Step_2.entity.Battery;
import Lab2.Step_By_Step_2.entity.FlashLamp;

public class MainThread {
    public static void main(String[] args) {
        Battery battery = new Battery();
        FlashLamp flashLamp = new FlashLamp();
        battery.setEnergy(50);
        flashLamp.setBattery(battery);
        for (int i = 0; i < 10; i++) {
            flashLamp.turnOn();
            flashLamp.turnOff();
        }
        System.out.printf("The remaining battery power is: %d", flashLamp.getBatteryInfo());
    }
}
