package lab2.doityourself3.entity;

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
