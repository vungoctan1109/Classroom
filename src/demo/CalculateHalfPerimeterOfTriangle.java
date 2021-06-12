package demo;
//Lab 1.2

import demo.entity.HalfPerimeterOfTriangle;

import java.util.Scanner;

import java.lang.Math;

public class CalculateHalfPerimeterOfTriangle {
    public static void main(String[] args) {
        HalfPerimeterOfTriangle halfPerimeterOfTriangle = new HalfPerimeterOfTriangle();
        Scanner scanner = new Scanner(System.in);
        double triangle[] = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Nhập cạnh thứ %d của tam giác: ", i + 1);
            triangle[i] = scanner.nextDouble();
            if (triangle[i] <= 0) {
                System.out.println("Độ dài một cạnh tam giác không thể nhỏ hơn hoặc bằng 0");
                break;
            }
        }
        if (Math.abs(triangle[0] - triangle[1]) < triangle[2] && triangle[2] < (triangle[0] + triangle[1])) {
            System.out.printf("Nửa chu vi của tam giác có 3 cạnh bằng %.1f, %.1f, %.1f là %.1f", triangle[0], triangle[1], triangle[2], halfPerimeterOfTriangle.calculateHalfPerimeterOfTriangle(triangle[0], triangle[1], triangle[2]));
        } else {
            System.out.println("Tổng hai cạnh của một tam giác luôn phải lớn hơn cạnh còn lại (Theo bất đẳng thức tam giác)");
        }
    }
}

