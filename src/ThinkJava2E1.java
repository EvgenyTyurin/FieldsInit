/*

    Think Java Chapter 2 Exercise 1: Show default class fields initialization
    by Evgeny Tyurin
*/

public class ThinkJava2E1 {

    /* Uninitialized fields */
    static int testInt;
    static char testChar;

    /* Run point */
    public static void main(String[] args) {
        System.out.println("Uninitialized class field int  = " + testInt);
        System.out.println("Uninitialized class field char = " + testChar);
    }

}
