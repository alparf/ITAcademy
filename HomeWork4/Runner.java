package HomeWork4;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Test method: add(item)");
        DataContainer<Number> example = new DataContainer<>(new Integer[] {1, 2, 3, null, null, null});
        System.out.println(example);
        System.out.println("add(777) return: " + example.add(777));
        System.out.println(example);
        System.out.println();
        example = new DataContainer<>(new Integer[] {1, 2, 3, null, null, null});
        System.out.println(example);
        System.out.println("add(null) return: " + example.add(null));
        System.out.println(example);
        System.out.println();
        example = new DataContainer<>(new Integer[] {1, null, 3, null, null, null});
        System.out.println(example);
        System.out.println("add(777) return: " + example.add(777));
        System.out.println(example);
        System.out.println();
        example = new DataContainer<>(new Integer[] {1, 2, 3});
        System.out.println(example);
        System.out.println("add(777) return: " + example.add(777));
        System.out.println(example);
        System.out.println("\nTest method: get(index)");
        example = new DataContainer<>(new Integer[] {});
        example.add(9999);
        System.out.println(example);
        System.out.println("get(0) return: " + example.get(0));
        System.out.println("get(1) return: " + example.get(1));
        System.out.println("\nTest method: delete(index)");
        example = new DataContainer<>(new Integer[] {1, 2, 3, 777});
        System.out.println(example);
        System.out.println("delete(3) return: " + example.delete(3));
        System.out.println(example);
        System.out.println();
        example = new DataContainer<>(new Integer[] {1, 2, 3, 777});
        System.out.println(example);
        System.out.println("delete(9) return: " + example.delete(9));
        System.out.println(example);
        System.out.println();
        example = new DataContainer<>(new Integer[] {1, 2, 3, 777});
        System.out.println(example);
        System.out.println("delete(2) return: " + example.delete(2));
        System.out.println(example);
        System.out.println("\nTest method: delete(item)");
        example = new DataContainer<>(new Integer[] {1, 2, 3, 777});
        System.out.println(example);
        System.out.println("delete(777) return: "+ example.delete(new Integer(777)));
        System.out.println(example);
        System.out.println();
        example = new DataContainer<>(new Integer[] {1, 2, 3, 777});
        System.out.println(example);
        System.out.println("delete(111) return: " + example.delete(new Integer(111)));
        System.out.println(example);
        System.out.println();
        example = new DataContainer<>(new Integer[] {1, 2, 3, 777, 3});
        System.out.println(example);
        System.out.println("delete(3) return: " + example.delete(new Integer(3)));
        System.out.println(example);
        System.out.println("\nTest comparator: ");
        example = new DataContainer<>(new Integer[] {1, 2, 3, 777, 3});
        System.out.println(example);
        example.sort((o1, o2) -> {
            return (int) (o2.doubleValue() - o1.doubleValue());
        });
        System.out.println(example);
        System.out.println();
        System.out.println("\nTest static sort: ");
        DataContainer<Integer> exampleStatic = new DataContainer<>(new Integer[] {1, 2, 3, 777, 3});
        System.out.println(exampleStatic);
        DataContainer.sort(exampleStatic);
        System.out.println(exampleStatic);
        System.out.println("\nTest static comparator: ");
        exampleStatic = new DataContainer<>(new Integer[] {1, 2, 3, 777, 3});
        System.out.println(exampleStatic);
        DataContainer.sort(exampleStatic, (o1, o2) -> {
            return o2 - o1;
        });
        System.out.println(exampleStatic);
        System.out.println("\nTest iterable: ");
        exampleStatic = new DataContainer<>(new Integer[] {1, 2, 3, 777, 3});
        for (Integer item: exampleStatic) {
            System.out.print(item + " ");
        }
    }
}

