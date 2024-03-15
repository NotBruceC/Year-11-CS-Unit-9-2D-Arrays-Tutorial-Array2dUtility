
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    public static int[][] Printer(){
        int[][] names = new int[][]{};
        return names;
    }


    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] array) {
        int totalSum = 0;

        for (int[] row : array) {
            for (int num : row) {
                totalSum += num;
            }
        }

        return totalSum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] array){
        double avg = 0;
        int i = 0;

        for(int[] row : array){
            for(int num: row){
                avg += num;
                i++;
            }
        }

        return avg/i;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.

    public static int minimum(int[][] array){
        int smal = 1000000000;

        for(int[] row : array){
            for(int num: row){
                if(num < smal) smal = num;
            }
        }

        return smal;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.

    public static int maximum(int[][] array) {
        int smal = 0;

        for (int[] row : array) {
            for (int num : row) {
                if (num > smal) smal = num;
            }
        }

        return smal;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.

    public static int evenCountStandard(int[][] array){
        int tatertots = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) tatertots++;
            }
        }

        return tatertots;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.

    public static int evenCountEnhanced(int[][] array){
        int tatertots = 0;

        for (int[] row : array) {
            for (int num : row) {
                if (num%2 == 0) tatertots++;
            }
        }

        return tatertots;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

    public static boolean allPositive(int[][] array){
        for(int[] row : array) {
            for(int num : row) {
                if(num<0) return false;
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.

    public static int[] rowSums(int[][] array){
        int totalElements = 0;
        int[] tatertots = new int[array.length];
        int i = 0;

        for (int[] row : array) {
            int rowSum = 0;
            for (int num : row) {
                rowSum += num;
            }
            tatertots[i] = rowSum;
            i++;
        }

        return tatertots;

    }



    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.

    public static int[] colSums(int[][] array) {
        int numRows = array.length;
        int numCols = array[0].length;
        int[] colSumszz = new int[numCols];

        for (int j = 0; j < numCols; j++) {
            int sum = 0;
            for (int i = 0; i < numRows; i++) {
                sum += array[i][j];
            }
            colSumszz[j] = sum;
        }

        return colSumszz;
    }

}
