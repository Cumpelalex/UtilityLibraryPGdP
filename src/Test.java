import PGdPUtility.ArrayUtility;

public class Test {
    public static void main (String[] args) {
        int[] array = {5, 29 , 3, 1, 0, 3, 2, 5 ,6 ,9};
        ArrayUtility.sortNumbersSmallestFirst(array);

        // output
        System.out.print("Output = {");
        ArrayUtility.printArray(array, ',');
        System.out.print("}\n");
        System.out.printf("Min: %d, Max: %d\n", ArrayUtility.min(array), ArrayUtility.max(array));
        System.out.printf("Index of 9: %d\n", ArrayUtility.findElement(array, 9));
        System.out.printf("Index of 2: %d\n", ArrayUtility.findElement(array, 2));
        System.out.printf("Index of 0: %d\n", ArrayUtility.findElement(array, 0));
    }
}
