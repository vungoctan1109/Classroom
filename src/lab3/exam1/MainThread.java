package lab3.exam1;

public class MainThread {
    public static void main(String[] args) {
        String names[];
        int ages[];
        ages = new int[5];
        System.out.println(ages.length);
        System.out.println(ages[5]);
        System.out.println(ages[2]);
        ages[2] = 102;
        System.out.println(ages[2]);
    }
}
