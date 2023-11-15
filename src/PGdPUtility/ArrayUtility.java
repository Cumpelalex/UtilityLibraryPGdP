package PGdPUtility;

// this is a simple utilityclass for handeling arrays
public class ArrayUtility {
// Find element in Array
    public static char max(char[] array) {
    // return the minimal element of the array
    char max = Character.MIN_VALUE;
    for(int i = 0; i < array.length; i++) {
        if(array[i] > max) max = array[i];
    }

    return max;
}
    public static int max(int[] array) {
        // return the minimal element of the array
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) max = array[i];
        }

        return max;
    }
    public static long max(long[] array) {
        // return the minimal element of the array
        long max = Long.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) max = array[i];
        }

        return max;
    }
    public static char min(char[] array) {
        // return the minimal element of the array
        char min = Character.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) min = array[i];
        }

        return min;
    }
    public static int min(int[] array) {
        // return the minimal element of the array
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) min = array[i];
        }

        return min;
    }
    public static long min(long[] array) {
        // return the minimal element of the array
        long min = Long.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) min = array[i];
        }

        return min;
    }
    public static int findElement(char[] array, char element) {
        // return the first index of the element
        for(int i = 0; i < array.length; i++) {
            if(array[i] == element) return i;
        }
        // element is not in the array
        return -1;
    }
    public static int findElement(int[] array, int element) {
        // return the first index of the element
        for(int i = 0; i < array.length; i++) {
            if(array[i] == element) return i;
        }
        // element is not in the array
        return -1;
    }
    public static int findElement(long[] array, long element) {
        // return the first index of the element
        for(int i = 0; i < array.length; i++) {
            if(array[i] == element) return i;
        }
        // element is not in the array
        return -1;
    }

// Sorting functions
    public static void sortNumbersSmallestFirst(char[] array) {
        // sort an array according so that the biggest number is first
        if(array.length <= 1) {
            // there is nothing to sort
            return;
        }

        // create a buffer for the result
        boolean sorted = false;
        while(!sorted) {
            // soted will be disabled if a thing had to be changed
            // if nothing had to be changed the array must be in order
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                // swap two numbers if they are not sorted
                if (array[i] > array[i + 1]) {
                    // swap the numbers
                    char buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                    // this array might not jet be sorted
                    sorted = false;
                }
            }
        }
    }
    public static void sortNumbersSmallestFirst(int[] array) {
        // sort an array according so that the biggest number is first
        if(array.length <= 1) {
            // there is nothing to sort
            return;
        }

        // create a buffer for the result
        boolean sorted = false;
        while(!sorted) {
            // soted will be disabled if a thing had to be changed
            // if nothing had to be changed the array must be in order
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                // swap two numbers if they are not sorted
                if (array[i] > array[i + 1]) {
                    // swap the numbers
                    int buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                    // this array might not jet be sorted
                    sorted = false;
                }
            }
        }
    }
    public static void sortNumbersSmallestFirst(long[] array) {
        // sort an array according so that the biggest number is first
        if(array.length <= 1) {
            // there is nothing to sort
            return;
        }

        // create a buffer for the result
        boolean sorted = false;
        while(!sorted) {
            // soted will be disabled if a thing had to be changed
            // if nothing had to be changed the array must be in order
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                // swap two numbers if they are not sorted
                if (array[i] > array[i + 1]) {
                    // swap the numbers
                    long buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                    // this array might not jet be sorted
                    sorted = false;
                }
            }
        }
    }
    public static void sortNumbersBiggestFirst(char[] array) {
        // sort an array according so that the biggest number is first
        if(array.length <= 1) {
            // there is nothing to sort
            return;
        }

        // create a buffer for the result
        boolean sorted = false;
        while(!sorted) {
            // soted will be disabled if a thing had to be changed
            // if nothing had to be changed the array must be in order
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                // swap two numbers if they are not sorted
                if (array[i] < array[i + 1]) {
                    // swap the numbers
                    char buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                    // this array might not jet be sorted
                    sorted = false;
                }
            }
        }
    }
    public static void sortNumbersBiggestFirst(int[] array) {
        // sort an array according so that the biggest number is first
        if(array.length <= 1) {
            // there is nothing to sort
            return;
        }

        // create a buffer for the result
        boolean sorted = false;
        while(!sorted) {
            // soted will be disabled if a thing had to be changed
            // if nothing had to be changed the array must be in order
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                // swap two numbers if they are not sorted
                if (array[i] < array[i + 1]) {
                    // swap the numbers
                    int buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                    // this array might not jet be sorted
                    sorted = false;
                }
            }
        }
    }
    public static void sortNumbersBiggestFirst(long[] array) {
        // sort an array according so that the biggest number is first
        if(array.length <= 1) {
            // there is nothing to sort
            return;
        }

        // create a buffer for the result
        boolean sorted = false;
        while(!sorted) {
            // soted will be disabled if a thing had to be changed
            // if nothing had to be changed the array must be in order
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                // swap two numbers if they are not sorted
                if (array[i] < array[i + 1]) {
                    // swap the numbers
                    long buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                    // this array might not jet be sorted
                    sorted = false;
                }
            }
        }
    }

// Output functions
    public static  void printArray(int[] array) {
    for(int i = 0; i < array.length; i++) {
        System.out.print(array[i]);

        // print the separator if (only if it is not the last element)
        if(i < array.length - 1) {
            System.out.print(", ");
        }
    }
}
    public static  void printArray(int[] array, char separator) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            // print the seperator if (only if it is not the last element)
            if(i < array.length - 1) {
                System.out.print(separator);
                System.out.print(' ');
            }
        }
    }
    public static void printArray(int[][] array) {
        printArray(array, ',');
    }
    public static void printArray(int[][] array, char seperator) {
        System.out.print("{\n");
        for(int i = 0; i < array.length; i++) {
            System.out.print("\t{");
            printArray(array[i], seperator);
            System.out.println("}");
        }
        System.out.println("}\n");
    }
    public static  void printArray(char[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            // print the separator if (only if it is not the last element)
            if(i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }
    public static  void printArray(char[] array, char separator) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            // print the seperator if (only if it is not the last element)
            if(i < array.length - 1) {
                System.out.print(separator);
                System.out.print(' ');
            }
        }
    }
    public static void printArray(char[][] array) {
        printArray(array, ',');
    }
    public static void printArray(char[][] array, char seperator) {
        System.out.print("{\n");
        for(int i = 0; i < array.length; i++) {
            System.out.print("\t{");
            printArray(array[i], seperator);
            System.out.println("}");
        }
        System.out.println("}\n");
    }

    // miscellaneous
    public static char[] resize(char[] array, int newSize) {
    // create an array of the new size and copy the data from the original array to the new one
    char[] newArray = new char[newSize];

    // fill the new array with data
    // if the original array hase more data, than the new array can hold it will be discarded
    for(int i = 0; i < newSize; i++) {
        if(i < array.length) {
            // use the data stored in the original array
            newArray[i] = array[i];
        }
        else {
            // fill the rest with 0
            newArray[i] = 0;
        }
    }

    return newArray;
}
    public static int[] resize(int[] array, int newSize) {
        // create an array of the new size and copy the data from the original array to the new one
        int[] newArray = new int[newSize];

        // fill the new array with data
        // if the original array hase more data, than the new array can hold it will be discarded
        for(int i = 0; i < newSize; i++) {
            if(i < array.length) {
                // use the data stored in the original array
                newArray[i] = array[i];
            }
            else {
                // fill the rest with 0
                newArray[i] = 0;
            }
        }

        return newArray;
    }
    public static long[] resize(long[] array, int newSize) {
        // create an array of the new size and copy the data from the original array to the new one
        long[] newArray = new long[newSize];

        // fill the new array with data
        // if the original array hase more data, than the new array can hold it will be discarded
        for(int i = 0; i < newSize; i++) {
            if(i < array.length) {
                // use the data stored in the original array
                newArray[i] = array[i];
            }
            else {
                // fill the rest with 0
                newArray[i] = 0;
            }
        }

        return newArray;
    }
    public static boolean[] resize(boolean[] array, int newSize) {
        // create an array of the new size and copy the data from the original array to the new one
        boolean[] newArray = new boolean[newSize];

        // fill the new array with data
        // if the original array hase more data, than the new array can hold it will be discarded
        for(int i = 0; i < newSize; i++) {
            if(i < array.length) {
                // use the data stored in the original array
                newArray[i] = array[i];
            }
            else {
                // fill the rest with false
                newArray[i] = false;
            }
        }

        return newArray;
    }
    public static float[] resize(float[] array, int newSize) {
        // create an array of the new size and copy the data from the original array to the new one
        float[] newArray = new float[newSize];

        // fill the new array with data
        // if the original array hase more data, than the new array can hold it will be discarded
        for(int i = 0; i < newSize; i++) {
            if(i < array.length) {
                // use the data stored in the original array
                newArray[i] = array[i];
            }
            else {
                // fill the rest with 0
                newArray[i] = 0;
            }
        }

        return newArray;
    }
    public static double[] resize(double[] array, int newSize) {
        // create an array of the new size and copy the data from the original array to the new one
        double[] newArray = new double[newSize];

        // fill the new array with data
        // if the original array hase more data, than the new array can hold it will be discarded
        for(int i = 0; i < newSize; i++) {
            if(i < array.length) {
                // use the data stored in the original array
                newArray[i] = array[i];
            }
            else {
                // fill the rest with 0
                newArray[i] = 0;
            }
        }

        return newArray;
    }

    public static char[][] splitAt(char[] array, int index) {
        // [0, index[ [index, array.length[
        if(index <= 0)  return null; // error

        int length1 = index;
        int length2 = array.length - index;

        char[][] split = new char[2][];
        split[0] = new char[length1];
        split[1] = new char[length2];

        for(int i = 0; i < array.length; i++) {
            if(i < index) split[0][i] = array[i];
            else split[1][i-index] = array[i];
        }

        return split;
    }
    public static int[][] splitAt(int[] array, int index) {
        // [0, index[ [index, array.length[
        if(index <= 0)  return null; // error

        int length1 = index;
        int length2 = array.length - index;

        int[][] split = new int[2][];
        split[0] = new int[length1];
        split[1] = new int[length2];

        for(int i = 0; i < array.length; i++) {
            if(i < index) split[0][i] = array[i];
            else split[1][i-index] = array[i];
        }

        return split;
    }
    public static long[][] splitAt(long[] array, int index) {
        // [0, index[ [index, array.length[
        if(index <= 0)  return null; // error

        int length1 = index;
        int length2 = array.length - index;

        long[][] split = new long[2][];
        split[0] = new long[length1];
        split[1] = new long[length2];

        for(int i = 0; i < array.length; i++) {
            if(i < index) split[0][i] = array[i];
            else split[1][i-index] = array[i];
        }

        return split;
    }
    public static char[][] split(char[] data, char pointToSplit) {
        // this function will split a string on all points specified
        // this will remove the pointToSplit
        int numPointsToPlit = 0;
        for(int i = 0; i < data.length; i++) {
            if(data[i] == pointToSplit) numPointsToPlit++;
        }

        // create the results array and initialize it
        char[][] results = new char[numPointsToPlit + 1][];
        // determine how long each segment is
        int index = 0;
        int indexResult = 0;
        for(int i = 0; index < data.length; i++) {
            if(data[i] == pointToSplit || index == data.length-1) {
                results[indexResult] = new char[i++];
                indexResult++;
                i = 0;
            }
            index++;
        }


        // split the array
        index = 0;
        int currentResult = 0;
        for(int i = 0; index < data.length; i++) {
            if(i >= results[currentResult].length) {
                currentResult++;
                i = -1;
            }
            else results[currentResult][i] = data[index];
            index++;
        }

        return results;
    }
    public static char[][] splitAligned(char[] data, int blockSize, char padding, char pointToSplit) {
        // padding will be added if the block would otherwise be less than blockSize
        // data the string to split
        // toAlign the char to align with
        // blockSize how long each block is

        // split the string along the character to align
        char[][] split = split(data, pointToSplit);
        char[] firstHalve = split[0];
        char[] secondHalve = new char[0];
        if(split.length > 1) secondHalve = split[1];

        // create the output string
        int numBlocksFirst = MathUtility.roundUp(firstHalve.length, blockSize);
        int numPaddingFirst = blockSize - (firstHalve.length % blockSize);
        if (numPaddingFirst == blockSize) numPaddingFirst = 0; // ensure to not fill an entire block with padding
        int numBlocksSecond = MathUtility.roundUp(secondHalve.length, blockSize);
        int numPaddingLast = blockSize - (secondHalve.length % blockSize);
        if (numPaddingLast == blockSize) numPaddingLast = 0; // ensure to not fill an entire block with padding
        char[][] result = new char[numBlocksFirst + numBlocksSecond][blockSize];
        // initialize all strings with certain length
        for(int i = 0; i < result.length; i++) {
            for(int a = 0; a < blockSize; a++) {
                result[i][a] = padding;
            }
        }


        // populate the result with the first blocks
        int index = 0;
        for(int i = 0; i < result.length; i++) {
            for(int a = 0; a < result[i].length; a++) {
                if(numPaddingFirst > 0) numPaddingFirst--;
                else if(index >= data.length) numPaddingLast--;
                else {
                    if(data[index] == pointToSplit) index++;
                    result[i][a] = data[index];
                    index++;
                }
            }
        }

        return result;
    }
}
