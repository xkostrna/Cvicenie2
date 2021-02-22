package sk.stuba.fei.uim.oop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final int THROW_VALUE = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void printHelloWorld() {
        System.out.println("Hello_World");
    }

    public static int compareTwoInts(int A, int B) {
        if (A == B) {
            return 0;
        }
        else {
            return (A > B) ? 1 : -1;
        }
    }

    public static void testCompareTwoInts() {
        System.out.println(compareTwoInts(6,5));
        System.out.println(compareTwoInts(5,5));
        System.out.println(compareTwoInts(5,6));
    }

    public static int[] createSingleDimensionalArray(final int arraySize) throws Exception {
        if (arraySize == THROW_VALUE) {
            throw new Exception("Wrong array size");
        }
        return new int[arraySize];
    }

    public static void fillArrayFromKeyboard(int[] arrayToFill) {
        for (int i = 0; i < arrayToFill.length; i++) {
            System.out.print("Enter " + i + " value : ");
            arrayToFill[i] = scanner.nextInt();
        }
    }

    public static void fillArrayRandomly(int[] arrayToFill) {
        for (int i = 0; i < arrayToFill.length; i++) {
            arrayToFill[i] = (int)(Math.random()*100);
        }
    }

    public static void printArray(final int[] arrayToPrint) {
        for(int number : arrayToPrint) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int[][] createTwoDimensionalArray(final int ROWS, final int COLUMNS) throws Exception {
        if (ROWS == THROW_VALUE || COLUMNS == THROW_VALUE) {
            throw new Exception("Wrong array size");
        }
        return new int[ROWS][COLUMNS];
    }

    public static void keyboardFillTwoDimArr(int[][] arrayToFill) {
        for (int i = 0; i < arrayToFill.length; i++) {
            for (int j = 0; j < arrayToFill[i].length; j++) {
                System.out.print("Add number to " + i + ". row " +j+ ". column : ");
                arrayToFill[i][j] = scanner.nextInt();
            }
        }
    }

    public static void randomFillTwoDimArr(int[][] arrayToFill) {
        for (int[] rows : arrayToFill) {
            Arrays.fill(rows, (int) (Math.random()*10));
        }
    }

    public static void printTwoDimArr(final int[][] arrayToPrint) {
        for(int[] rows : arrayToPrint) {
            System.out.println();
            for(int number : rows) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static int determinateMatrix(final int[][] arrayToCount) {
        int[][] tempArray;
        int result = 0;

        if (arrayToCount.length == 1) {
            result = arrayToCount[0][0];
            return result;
        }

        if (arrayToCount.length == 2) {
            result = ((arrayToCount[0][0] * arrayToCount[1][1]) - (arrayToCount[0][1] * arrayToCount[1][0]));
            return result;
        }

        for (int i = 0; i < arrayToCount[0].length; i++) {
            tempArray = new int[arrayToCount.length -1][arrayToCount[0].length -1];

            for (int j = 1; j < arrayToCount.length; j++) {

                for (int k = 0; k < arrayToCount[0].length; k++) {
                    if(k < i) {
                        tempArray[j-1][k] = arrayToCount[j][k];
                    }
                    else if(k > i) {
                        tempArray[j-1][k-1] = arrayToCount[j][k];
                    }
                }
            }
            result += arrayToCount[0][i] * Math.pow(-1, i) * determinateMatrix(tempArray);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        printHelloWorld();
        testCompareTwoInts();

        final int ARRAY_SIZE = 5;
        int[] keyboardArray = createSingleDimensionalArray(ARRAY_SIZE);
        fillArrayFromKeyboard(keyboardArray);
        printArray(keyboardArray);

        int[] randomArray = createSingleDimensionalArray(ARRAY_SIZE);
        fillArrayRandomly(randomArray);
        Arrays.sort(randomArray);
        printArray(randomArray);

        int[][] randomTwoDimArray = createTwoDimensionalArray(3,10);
        randomFillTwoDimArr(randomTwoDimArray);
        printTwoDimArr(randomTwoDimArray);

        int[][] keyboardTwoDimArray = createTwoDimensionalArray(3,3);
        keyboardFillTwoDimArr(keyboardTwoDimArray);
        printTwoDimArr(keyboardTwoDimArray);
        int determinantOfArray = determinateMatrix(keyboardTwoDimArray);
        System.out.println(determinantOfArray);

    }
}
