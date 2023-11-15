import PGdPUtility.ArrayUtility;
import PGdPUtility.MathUtility;
import PGdPUtility.StringUtility;
public class Test {
    public static void main (String[] args) {
        int[] array = {5, 29 , 3, 1, 0, 3, 2, 5 ,6 ,9};
        ArrayUtility.sortNumbersSmallestFirst(array);

        // output
        System.out.println(MathUtility.root(3, 20, 0.0000001));

        //String[] split = StringUtility.splitAligned("1234.56789", 2, ' ', '.');
        //for(int i = 0; i < split.length; i++) {
        //    System.out.printf("%d == %s\n", i, split[i]);
        //}

        //System.out.printf("7^9 = %f\n7^(-3) = %f\n", MathUtility.pow(7, 9), MathUtility.pow(7, -3));
    }
}
