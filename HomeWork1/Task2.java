package HomeWork1;


public class Task2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        System.out.println(5 + 2 / 8); // 2 / 8 = 0, 5 + 0 = 5;
        System.out.println((5 + 2) / 8); // 5 + 2 = 7, 7 / 8 = 0;
        System.out.println((5 + b++) / 8); // b возвращает значение 2 в вырожение, затем b += 1; 5 + 2 = 7; 7 / 8 = 0;
        b = 2;
        System.out.println((5 + b++) / --a); // b возвращает значение 2 в вырожение, затем b += 1; 5 + 2 = 7; a(8) -= 1, возвращает значение 7 в выражение; 7 / 7 = 1;
        a = 8;
        b = 2;
        System.out.println((5 * 2 >> b++) / --a); // b возвращает значение 2 в вырожение, затем b += 1; 5 * 2 = 10; 10 >> 2 = 2; a(8) -= 1, возвращает значение 7 в выражение; 2 / 7 = 0;
        a = 8;
        b = 2;
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a); // b возвращает значение 2 в вырожение, затем b += 1; 22 * 2 = 44; 44 >> 2 = 11; 5 + 7 = 12; 12 > 20 = false; a(8) -= 1, возвращает значение 7 в выражение; 11 / 7 = 1;
        //System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a); boolean / int error
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119); // 6 - 2 = 4; 4 > 3 = true; 12 * 12 = 144; 144 <= 119 = false; true && false = false;
        System.out.println(true && false); // true && false = false;
    }
}
