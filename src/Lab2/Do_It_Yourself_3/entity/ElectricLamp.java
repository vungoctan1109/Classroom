package Lab2.Do_It_Yourself_3.entity;

public class ElectricLamp {
    private boolean status;

    public ElectricLamp() {

    }

    public void turnOff() {
        status = false;
    }

    public void turnOn() {
        status = true;
    }
}
