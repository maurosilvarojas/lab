import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.Scanner;


public class week2 {
    public static void main(String[] args) {

        exe1();
    }

    private static void exe2() {
    }

    private static void exe1() {
        /*        Write a program that inputs a series of positive integers from the user and then displays
        the sum of the positive integers. The user has to enter -1 to end the input series. Use a while loop.*/
        Scanner newScaner = new Scanner(System.in);
        int x,counter= 0;
        System.out.println("Insert Numbers: ");
        x=newScaner.nextInt();

        do {
            counter=x+counter;
            System.out.println("Insert Numbers: ");
            x=newScaner.nextInt();
        }while (x!=-1);
        System.out.println("Total Sum: " + counter);
    }



}
