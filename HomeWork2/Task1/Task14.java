package HomeWork2.Task1;

public class Task14 {
    public static void main(String[] args) {
        long a = 1;
        do {
            a *= 3;
        } while ( (a * 3) > a);
        System.out.println(a);
        System.out.println(a * 3);
    }
}
