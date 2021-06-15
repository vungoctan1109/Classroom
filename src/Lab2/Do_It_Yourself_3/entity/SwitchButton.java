package Lab2.Do_It_Yourself_3.entity;

public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    public SwitchButton() {

    }

    public void connectToLamp(ElectricLamp electricLamp) {
        this.lamp = electricLamp;
    }

    public void switchOff() {
        lamp.turnOff();
    }

    public void switchOn() {
        lamp.turnOn();
    }
}
