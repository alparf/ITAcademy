package HomeWork1.Task5;

import java.util.Scanner;

public class BranchIf {
    public static void main(String[] args) {
        final String VASYA = "ВАСЯ";
        final String ANASTASIYA = "АНАСТАСИЯ";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(VASYA.equalsIgnoreCase(name)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
            return;
        }
        if(ANASTASIYA.equalsIgnoreCase(name)) {
            System.out.println("Я тебя так долго ждал");
            return;
        }
        System.out.println("Добрый день, а вы кто?");
    }
}
