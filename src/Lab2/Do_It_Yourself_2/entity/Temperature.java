package Lab2.Do_It_Yourself_2.entity;

public class Temperature {
    private double cTemp;

    public Temperature() {

    }

    public Temperature(double c) {
        this.cTemp = c;
    }

    public double getCTemp() {
        return cTemp;
    }

    public void setCTemp(double c) {
        this.cTemp = c;
    }

    public double getFTemp() {
        double fTemp = (cTemp * 1.8) + 32;
        return fTemp;
    }

    public double getKTemp() {
        double kTemp = cTemp + 273.15;
        return kTemp;
    }

}
