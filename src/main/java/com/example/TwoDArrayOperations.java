package com.example;

public class TwoDArrayOperations {

    public static void main(String[] args) {
        int[][] array = { { 1, 2 }, { 3, 4 } };
        System.out.println(array);
        // Exercise 1: Initialize and Print a 2D Array
        // TODO: Initialize a 2D array of integers and print its contents in a matrix
        // form.
    }

    // Exercise 2: Find the Maximum Value in a 2D Array
    public static int findMaximumValue(int[][] array) {
        int maxValue = array[0][0];

        for (int[] row : array) {
            for (int element : row) {
                if (element > maxValue) {
                    maxValue = element;
                }
            }
        }
        // TODO: Implement the logic to find the maximum value in the 2D array.
        return maxValue; // Placeholder return value
    }
    // int maxValue = array[0][0];

    // for (int i = 0; i < array.length; i++) {
    // for (int j = 0; j < array[i].length; j++) {
    // if (array[i][j] > maxValue) {
    // maxValue = array[i][j];
    // }
    // }
    // }

    // return maxValue;
    // }

    // Exercise 3: Check for a Specific Value in a 2D Array
    public static boolean containsValue(int[][] array, int value) {
        for (int[] row : array) {
            for (int element : row) {
                if (element == value) {
                    return true;
                }
            }
        }
        // TODO: Implement the logic to check if the 2D array contains the specified
        // value.
        return false; // Placeholder return value
    }
    // for (int i = 0; i < array.length; i++) {
    // for (int j = 0; j < array[i].length; j++) {
    // if (array[i][j] == value) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // Exercise 4: Calculate the Average of All Elements in a 2D Array
    public static double calculateAverage(int[][] array) {
        int sum = 0;
        int howManyNumbers = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
                howManyNumbers++;
            }
        }

        // TODO: Implement the logic to calculate the average of all elements in the 2D
        // array.
        return sum / howManyNumbers; // Placeholder return value
    }

    // Exercise 5: Sum of Diagonal Elements in a 2D Array
    public static int sumDiagonal(int[][] array) {
        int sum = 0;
        int j = array.length;

        for (int i = 0; i < j; i++) {
            sum += array[i][i] + array[i][j - 1 - i];
        }

        // TODO: Calculate and return the sum of diagonal elements in the 2D array.
        return sum / 2; // Placeholder return value
    }

    // Exercise 6: Flatten a 2D Array into 1D Array
    public static int[] flattenArray(int[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                counter += 1;

            }
        }
        int counter2 = 0;
        int[] flattenArray = new int[counter];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                flattenArray[counter2] = array[i][j];
                counter2++;
            }
        }
        // TODO: Implement the logic to flatten the 2D array into a 1D array.
        return flattenArray; // Placeholder return value
    }
}
