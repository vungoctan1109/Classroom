package lab2.stepbystep2.entity;

public class Battery {
    private int energy;

    public Battery() {
        energy = 100;
    }

    public void setEnergy(int value) {
        energy = value;
    }

    public int getEnergy() {
        return energy;
    }

    public void decreaseEnergy() {
        energy--;
    }

}
