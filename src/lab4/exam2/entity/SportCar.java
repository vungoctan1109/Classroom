package lab4.exam2.entity;

public class SportCar extends Car{
    public void accelerate(){
        System.out.println("Sport Car is accelerating!");
        super.accelerate();
    }

    public static void main(String[] args) {
        SportCar sc = new SportCar();
        sc.accelerate();
    }
}
