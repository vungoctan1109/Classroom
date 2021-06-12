package demo;
// Lab 1

import demo.entity.DecemberBonus;

import java.util.Scanner;

public class DecemberBonusCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecemberBonus decemberBonus = new DecemberBonus();
        System.out.print("Please enter the number of years of experience: ");
        double yearExperience = scanner.nextDouble();
        System.out.print("Please enter the number of years working for the company: ");
        double yearWork = scanner.nextDouble();
        System.out.printf("Your December Bonus is: %.1f", decemberBonus.decemberBonusCalculate(yearExperience, yearWork));
    }
}
