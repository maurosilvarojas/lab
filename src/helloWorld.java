import java.util.Scanner;

//lab1 Write a simple program in Java using Eclipse IDE to print the greeting “Hello World” to the console.
public class helloWorld {
    public static void main(String[] args) {
       check(3);

    }

    private static void check(int z) {
        switch (z){
            case 1 : z=1;
                exe1();
                break;
            case 2 : z=2;
                exe2();
                break;
            case 3 : z=3;
                exe2();
                break;
            case 4: z=4;
                exe2();
                break;
            default:
                break;
        }
    }

    public static void exe2() {
        System.out.println("knock/* /n knokkkkk");
    }

    //System.out.println("A quoted String is much better  if you learn the rules of escape sequences");
       /* System.out.println(" ");
        System.out.println("Also/, /"/" represent an empty string");
        System.out.println("");
        System.out.println("Don’t forget to use /” to print /“/” on your console /n Note that there are 2 blank lines in this output.");*/

    public static void exe1() {
        System.out.println("hello World");//first

    }
}
