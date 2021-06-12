package demo.entity;

public class DecemberBonus {
    public double decemberBonusCalculate(double yearExperience, double yearWork) {
        double salary;
        double decemberBonus;
        if (yearExperience < 2) {
            salary = 10000000;
        } else if (yearExperience >= 2 && yearExperience <= 5) {
            salary = 20000000;
        } else {
            salary = 30000000;
        }
        if (yearWork < 1) {
            decemberBonus = 0.3 * salary;
        } else if (yearWork >= 1 && yearWork < 2) {
            decemberBonus = 0.5 * salary;
        } else if (yearWork >= 1 && yearWork < 5) {
            decemberBonus = salary;
        } else {
            decemberBonus = 2 * salary;
        }
        return decemberBonus;
    }
}
