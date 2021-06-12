package demo;


import demo.entity.HelperClass;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("Hello World");
        HelperClass calculator = new HelperClass();
        int a = 5;
        int b = 10;
        int c = 11;
        int r = 8;
        System.out.printf("Trung binh cong 3 so %d, %d, %d la %.2f", a, b, c, calculator.tinhTbc(a, b, c));
        System.out.printf("\nChu vi hinh tron co duong kinh %d la %.2f", r, calculator.tinhChuvi(r));
    }
}

