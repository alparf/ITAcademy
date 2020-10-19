package HomeWork4;

public class Runner {
    public static void main(String[] args) {
        System.out.println("sample №1: ");
        DataContainer<Integer> test = new DataContainer<>(new Integer[] {1, 2, 3, null, null, null});
        System.out.println(test);
        System.out.println("add(777) index: " + test.add(777));
        System.out.println(test);
        System.out.println("\nsample №2: ");
        test = new DataContainer<>(new Integer[] {1, 2, 3, null, null, null});
        System.out.println(test);
        System.out.println("add(null) index: " + test.add(null));
        System.out.println(test);
        System.out.println("\nsample №3: ");
        test = new DataContainer<>(new Integer[] {1, null, 3, null, null, null});
        System.out.println(test);
        System.out.println("add(777) index: " + test.add(777));
        System.out.println(test);
        //
    }
}
