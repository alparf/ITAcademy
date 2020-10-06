package HomeWork2.Task1;

public class Task15 {
    private static void print(int x, int y) {
        for (int i = 1; i < 11; i++) {
            for (int j = x; j < y; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(2,6);
        System.out.println();
        print(6,10);
    }
}
