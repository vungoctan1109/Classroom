package Lab2.Step_By_Step_1.entity;

public class Student {
    private int id;
    private String name;
    private boolean gender;

    public Student() {
        this.id = 1;
        this.name = "noname";
        this.gender = true;
    }

    public Student(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public boolean isMale() {
        return this.gender;
    }

    public void setGender(boolean value) {
        this.gender = value;
    }

    public void printInfo(){
        System.out.println("--------------------------------------");
        System.out.println("| ID |         Name           | Male |");
        System.out.printf("| %d | %s | %b |\n", this.id, this.name, this.gender);
    }
}
