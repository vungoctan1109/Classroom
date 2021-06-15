package Lab1.Exam_1.entity;

public class DecemberBonus {
    private double salaryCalculate(float yearExperience) {
        double salary;
        if (yearExperience < 2) {
            salary = 10000000;
        } else if (yearExperience >= 2 && yearExperience <= 5) {
            salary = 20000000;
        } else {
            salary = 30000000;
        }
        return salary;
    }


    private double bonusPercentCalculate(float yearWork) {
        double bonusPercent;
        if (yearWork < 1) {
            bonusPercent = 0.3;
        } else if (yearWork >= 1 && yearWork < 2) {
            bonusPercent = 0.5;
        } else if (yearWork >= 2 && yearWork < 5) {
            bonusPercent = 1;
        } else {
            bonusPercent = 2;
        }
        return bonusPercent;
    }


    public double decemberBonusCalculate(float yearExperience, float yearWork) {
        double salary = salaryCalculate(yearExperience);
        double bonusPercent = bonusPercentCalculate(yearWork);
        double decemberBonus = salary * bonusPercent;
        return decemberBonus;
    }
}
