package Lab1.Exam_1;
// Lab 1

import Lab1.Exam_1.entity.DecemberBonus;

import java.util.Scanner;

public class DecemberBonusCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecemberBonus decemberBonus = new DecemberBonus();
        System.out.print("Please enter the number of years of experience: ");
        float yearExperience = scanner.nextFloat();
        System.out.print("Please enter the number of years working for the company: ");
        float yearWork = scanner.nextFloat();
        System.out.printf("Your December Bonus is: %.1f", decemberBonus.decemberBonusCalculate(yearExperience, yearWork));
    }
}
