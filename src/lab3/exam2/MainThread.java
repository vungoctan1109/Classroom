package lab3.exam2;

public class MainThread {
    public static void main(String[] args) {
        String name = "Learn Java By Example";
        System.out.println(name.length());
        System.out.println(name.equals("learn"));
        System.out.println(name.equals("Learn Java By Example"));
        System.out.println(name.equalsIgnoreCase("learn java BY EXAMPLE"));
        String words[] = name.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
