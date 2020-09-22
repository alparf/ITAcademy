package HomeWork1;

public class Task1 {
    private static void printResult(int a, int b) {
        int result = a & b;
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        System.out.println("a & b = " + result);
        System.out.println(binA + " & " + binB + " = " + Integer.toBinaryString(result));
        result = a | b;
        System.out.println("a | b = " + result);
        System.out.println(binA + " | " + binB + " = " + Integer.toBinaryString(result));
        result = a ^ b;
        System.out.println("a ^ b = " + result);
        System.out.println(binA + " ^ " + binB + " = " + Integer.toBinaryString(result));
        result = ~ a;
        System.out.println("~ a = " + result);
        System.out.println("~ " + binA + " = " + Integer.toBinaryString(result));
        result = a >> 2;
        System.out.println("a >> 2 = " + result);
        System.out.println(binA + " >> 3 = " + Integer.toBinaryString(result));
        result = b << 2;
        System.out.println("b << 2 = " + result);
        System.out.println(binB + " << 3 = " + Integer.toBinaryString(result));
        result = a >>> 2;
        System.out.println("a >>> 2 = " + result);
        System.out.println(binA + " >>> 3 = " + Integer.toBinaryString(result));
    }
    public static void main(String[] args) {
        printResult(42, 15);
        System.out.println();
        printResult(-42, -15);
    }
}
