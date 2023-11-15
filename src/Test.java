import PGdPUtility.ArrayUtility;
import PGdPUtility.MathUtility;
import PGdPUtility.StringUtility;
public class Test {
    public static void main (String[] args) {
        int[] array = {5, 29 , 3, 1, 0, 3, 2, 5 ,6 ,9};
        ArrayUtility.sortNumbersSmallestFirst(array);

        // output
        for(int i = 0; i <= 25; i++) {
            System.out.println(MathUtility.fak((long)i));
        }

        System.out.println();
        char[][] split = ArrayUtility.splitAligned(new char[] {'a', 'b', 'c', 'd', 'e', 'f'}, 3, ' ', 'a');
        for(int i = 0; i < split.length; i++) {
            for(int a = 0; a < split[i].length; a++) {
                System.out.print(split[i][a]);
                System.out.print(", ");
            }
            System.out.println();
        }

        System.out.println();
        int[][] s2 = ArrayUtility.splitAt(new int[] {1, 2, 3, 4, 5, 6, 7}, 2);
        ArrayUtility.printArray(s2);
        //String[] split = StringUtility.splitAligned("1234.56789", 2, ' ', '.');
        //for(int i = 0; i < split.length; i++) {
        //    System.out.printf("%d == %s\n", i, split[i]);
        //}

        //System.out.printf("7^9 = %f\n7^(-3) = %f\n", MathUtility.pow(7, 9), MathUtility.pow(7, -3));
    }
}
