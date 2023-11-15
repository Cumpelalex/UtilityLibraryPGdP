package PGdPUtility;

import java.text.DecimalFormat;

public class MathUtility {
// helper

// power
    public static double pow(double base, int exponent) {
        // calculate the power of base^exponent
        if(exponent == 0) return 1;
        double result = 1;

        if(exponent > 0) {
            for (int i = 0; exponent - i > 0; i++) {
                result *= base;
            }
        }
        else { // exponent < 0
            for(int i = 0; exponent + i < 0; i++) {
                result /= base;
            }
        }

        return result;
    }

// root
    public static void sqrt(double n) {
    // this is the code used in the homework
    if(n < 0) {
        System.out.println("Keine negativen Wurzeln!");
        return;
    }

    System.out.printf("Wurzel aus %s\n\n", n);

    // calculates the result up to 2 digits after the point (without rounding)
    // first convert the double to a string
    // information from StackOverflow: https://stackoverflow.com/questions/16098046/how-do-i-print-a-double-value-without-scientific-notation-using-java
    DecimalFormat convert = new DecimalFormat("#");
    convert.setMaximumFractionDigits(100);
    convert.setMaximumIntegerDigits(100);
    String number = convert.format(n);


    // now split the number into groups of two digits each
    // we first need to determine the position of the point
    int pointIndex = -1;
    for(int i = 0; i < number.length(); i++) {
        if(number.charAt(i) == '.') {
            // found the point
            pointIndex = i;
            break;
        }
    }
    if (pointIndex == -1) {
        // no point in the string
        pointIndex = number.length();
    }

    // add a 0 to the front of the number if the number of digits is uneven
    if((pointIndex & 1) != 0) {
        number = '0' + number;
        pointIndex++;
    }
    // ensure there are exactly for digits after the decimal point
    int numOfZerosToAdd = 4 - (number.length() - pointIndex - 1);
    if(numOfZerosToAdd < 0 ) {
        // remove some places
        number = number.substring(0, number.length() + numOfZerosToAdd);
    }
    for(int i = 0; i < numOfZerosToAdd; i++) {
        number += '0';
    }


    // now split the number based on the point
    int numberOfSubstrings = number.length() - 1; // minus 1 because of the decimal point
    numberOfSubstrings /= 2;
    String split[] = new String[numberOfSubstrings];
    for(int i = 0; i < numberOfSubstrings; i++) {
        int offset = 0;
        if(i * 2 >= pointIndex) offset = 1;
        split[i] = number.substring(i * 2 + offset, i * 2 + 2 + offset);
    }

    // now performe the calculations
    String result = "";
    long subtrahend = 1;
    int currentSubStr = 0;
    // convert the substring to a number
    long rest = Long.parseLong(split[currentSubStr]);
    while((rest != 0 || currentSubStr +1 < numberOfSubstrings) && result.length() - (pointIndex / 2) < 5) {
        // check if a decimal point hase to be added
        if(currentSubStr == pointIndex / 2) result += '.';
        // subtract until subtrahend > rest
        System.out.println();
        System.out.println(rest);
        System.out.println("--------");


        int digitResult = 0;
        while(subtrahend <= rest) {
            System.out.print('-');
            System.out.println(subtrahend);
            rest -= subtrahend;
            digitResult++;
            subtrahend += 2;
        }
        System.out.println("--------");
        System.out.printf("Rest: %d\n", rest);

        // add the resulting digit to the output
        result += Long.toString(digitResult);

        // calculate the new subtrahend
        String resultWithoutDecimalPoint = result.replace(".", "");
        long currentResult = Long.parseLong(resultWithoutDecimalPoint);
        String newSubtrahend = Long.toString(2 * currentResult) + '1';
        subtrahend = Long.parseLong(newSubtrahend);

        // now calculate the new rest
        currentSubStr++;
        if(currentSubStr < numberOfSubstrings) {
            String newRest = Long.toString(rest);
            newRest += split[currentSubStr];
            rest = Long.parseLong(newRest);
        }


        System.out.printf("neue Ergebnis Ziffer: %d\n", digitResult);
    }

    // successfully calculated the sqrt!
    System.out.printf("Ergebnis: %s\n", result);
}
    public static double root(int degree, double value, double precision) {
        // this calculates the nth root of the base
        // source: https://www.sanfoundry.com/java-program-nth-root-algorithm/
        if(value < 0) return -1; // error base is less than 0

        if(value == 0) return 0;

        double x1 = value;
        double x2 = value / degree;
        while (MathUtility.abs(x1 - x2) > precision) {
            x1 = x2;
            x2 = ((degree - 1.0) * x2 + value / MathUtility.pow(x2, degree - 1)) / degree;
        }
        return x2;
    }
// rounded devision
    public static int roundUp(int a, int b) {
        // calculates a / b but always rounds up
        if(a%b == 0) return a/b;

        a += b-(a%b);

        return a/b;
    }
    public static double abs(double x) {
        if(x < 0) x *= -1;
        return x;
    }
}
