package sk.stuba.fei.uim.oop;

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

        int[] newArray = new int[arraySize];
        for (int i = 0; i < newArray.length; i++) {
            System.out.print("Enter " + i + " value : ");
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public static void printArray(int[] arrayToPrint) {
        for(int number : arrayToPrint) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        printHelloWorld();
        testCompareTwoInts();
        int[] arrayOfInts = createSingleDimensionalArray(5);
        printArray(arrayOfInts);

    }
}
