package sk.stuba.fei.uim.oop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
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

    public static int[] createSingleDimensionalArray(int arraySize) throws Exception {
        if (arraySize == 0) {
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

    public static void printArray(int[] arrayToPrint) {
        for(int number : arrayToPrint) {
            System.out.print(number + " ");
        }
        System.out.println();
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


    }
}
