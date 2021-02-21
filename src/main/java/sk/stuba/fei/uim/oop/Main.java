package sk.stuba.fei.uim.oop;

public class Main {

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

    public static void main(String[] args) {
        printHelloWorld();
        testCompareTwoInts();
    }
}
