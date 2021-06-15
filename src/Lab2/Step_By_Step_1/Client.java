package Lab2.Step_By_Step_1;

import Lab2.Step_By_Step_1.entity.Student;

public class Client {
    public static void main(String[] args) {
        Student studentA;
        Student studentB;
        studentA = new Student();
        studentB = new Student(1, "Nguyen Van A", true);

        studentB.printInfo();

        studentB.setName("Nguyen Van B");
        studentB.printInfo();
    }
}
