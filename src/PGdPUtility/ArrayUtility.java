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


}
