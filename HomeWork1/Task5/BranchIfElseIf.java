package HomeWork1.Task5;

import java.util.Scanner;

public class BranchIfElseIf {
    public static void main(String[] args) {
        final String VASYA = "Вася";
        final String ANASTASIYA = "Анастасия";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(VASYA.equalsIgnoreCase(name)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if (ANASTASIYA.equalsIgnoreCase(name)) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
