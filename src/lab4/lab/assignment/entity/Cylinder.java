package lab4.lab.assignment.entity;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume() {
        double area = super.getArea();
        double volume = area * height;
        return volume;
    }

    public double getArea() {
        double radius = super.getRadius();
        double area = 2 * 3.14 * radius * height;
        return area;
    }

    @Override
    public String toString() {

        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
