package PGdPUtility;

public class StringUtility {
    public static String[] split(String data, char pointToSplit) {
        // this function will split a string on all points specified
        // this will remove the pointToSplit
        int numPointsToPlit = 1;
        for(int i = 0; i < data.length(); i++) {
            if(data.charAt(i) == pointToSplit) numPointsToPlit++;
        }

        // create the results array and initialize it
        String[] results = new String[numPointsToPlit];
        for(int i = 0; i < results.length; i++) results[i] = "";

        // split the string
        int currentResult = 0;
        for(int i = 0; i < data.length(); i++) {
            if(data.charAt(i) == pointToSplit) currentResult++;
            else results[currentResult] += data.charAt(i);
        }

        return results;
    }
    public static String[] splitAligned(String data, int blockSize, char padding, char pointToSplit) {
        // padding will be added if the block would otherwise be less than blockSize
        // data the string to split
        // toAlign the char to align with
        // blockSize how long each block is

        // split the string along the character to align
        String[] split = StringUtility.split(data, pointToSplit);
        String firstHalve = split[0];
        String secondHalve = "";
        if(split.length > 1) secondHalve = split[1];

        // create the output string
        int numBlocksFirst = MathUtility.roundUp(firstHalve.length(), blockSize);
        int numPaddingFirst = blockSize - (firstHalve.length() % blockSize);
        if (numPaddingFirst == blockSize) numPaddingFirst = 0; // ensure to not fill an entire block with padding
        int numBlocksSecond = MathUtility.roundUp(secondHalve.length(), blockSize);
        int numPaddingLast = blockSize - (secondHalve.length() % blockSize);
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
                else if(index >= data.length()) numPaddingLast--;
                else {
                    if(data.charAt(index) == pointToSplit) index++;
                    result[i][a] = data.charAt(index);
                    index++;
                }
            }
        }

        // convert the result to strings
        String[] finalResults = new String[result.length];
        for(int i = 0; i < result.length; i++) {
            finalResults[i] = "";
            for(int a = 0; a < result[i].length; a++) {
                finalResults[i] += result[i][a];
            }
        }
        return finalResults;
    }
    public static int find(String data, char element) {
        for(int i = 0; i < data.length(); i++) {
            if(data.charAt(i) == element) return i;
        }
        // unable to locate the element
        return -1;
    }

}
