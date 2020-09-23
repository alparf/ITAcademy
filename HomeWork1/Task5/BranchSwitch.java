package HomeWork1.Task5;

import java.util.Scanner;

public class BranchSwitch {
    public static void main(String[] args) {
        final String VASYA = "ВАСЯ";
        final String ANASTASIYA = "АНАСТАСИЯ";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        switch (name.toUpperCase()) {
            case VASYA: {
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            }
            case ANASTASIYA: {
                System.out.println("Я тебя так долго ждал");
                break;
            }
            default: {
                System.out.println("Добрый день, а вы кто?");
                break;
            }
        }
    }
}
