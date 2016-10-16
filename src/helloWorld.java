import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//lab1 Write a simple program in Java using Eclipse IDE to print the greeting “Hello World” to the console.
public class helloWorld {
    public static void main(String[] args) {
       check(11);

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
                exe3();
                break;
            case 4: z=4;
                exe4();
                break;
            case 5: z=5;
                exe5();
                break;
            case 6: z=6;
                exe6();
                break;
            case 7 : z=7;
                exe7();
                break;
            case 8 : z=8;
                exe8();
                break;
            case 9 : z=9;
                exe9();
                break;
            case 10 : z=10;
                exe10();
                break;
            case 11 : z=11;
                exe11();
                break;
            default:
                break;
        }
    }

    private static void exe11() {
        /*Write a program that generates a random integer in the range 0 to 99
        inclusive, and then tests and reports whether it is even or odd. [Hint:
        Use Random Class in Java API]*/
        int x;
        Random rdNum = new Random();
        x=rdNum.nextInt(100);
        System.out.println("The random number is :"+x);
    }

    private static void exe10() {
        /*Write a program that reads three names from the user and prints them
        in the ascending order of their lengths.*/
        String[] names= new String[3];
        String[] namesASC= new String[3];

        int var;

        Scanner newScan  = new Scanner(System.in);//new scanner
        for (int i=0; i<names.length; i++)//loop  gathering data
        {
            System.out.println("Insert name:"+(i+1));
            names[i]=newScan.nextLine();
            var=names[i].length();
            System.out.println(var);
        }
        int A = names[0].length();
        int B = names[1].length();
        int C = names[2].length();

        if ((A>B)&&(A>C)&&(B>C)){
            namesASC[0] = names[2];
            namesASC[1] = names[1];
            namesASC[2] = names[0];
        }
        else if ((A>B)&&(A>C)&&(B<C)){
            namesASC[0] = names[2];
            namesASC[1] = names[0];
            namesASC[2] = names[1];
        }
        else if((A>B)&&(A<C)){
            namesASC[0] = names[1];
            namesASC[1] = names[0];
            namesASC[2] = names[2];
        }
        else if ((A<B)&&(B>C)&&(A>C)){
            namesASC[0] = names[1];
            namesASC[1] = names[2];
            namesASC[2] = names[0];
        }
        else if((A<B)&&(B>C)&&(A<C)){
            namesASC[0] = names[0];
            namesASC[1] = names[2];
            namesASC[2] = names[1];
        }
        else if ((A<B)&&(B<C))
            namesASC[0] = names[0];
            namesASC[1] = names[1];
            namesASC[2] = names[2];


        /*if (names[0].length() > names[1].length()) {
            if (names[0].length() > names[2].length()) {
                if (names[1].length() > names[2].length()) {
                    namesASC[0] = names[2];
                    namesASC[1] = names[1];
                    namesASC[2] = names[0];
                }
                else
                    namesASC[0] = names[1];
                    namesASC[1] = names[2];
                    namesASC[2] = names[0];
            }
            else
                namesASC[0] = names[1];
                namesASC[1] = names[0];
                namesASC[2] = names[2];
        }
        else if (names[1].length()>names[2].length()){
            if (names[0].length()>names[2].length()){
                namesASC[0] = names[2];
                namesASC[1] = names[0];
                namesASC[2] = names[1];
            }
            else
                namesASC[0] = names[0];
                namesASC[1] = names[2];
                namesASC[2] = names[1];
        }
        else {
            namesASC[0] = names[0];
            namesASC[1] = names[1];
            namesASC[2] = names[2];
        }*/
        for (int i=0; i<namesASC.length; i++)
        {
            System.out.println("");
            System.out.println(namesASC[i]);
        }

    }

    private static void exe9() {
        /*Write a program that prompts the user to enter a number within the
        range of 1 through 10. The program should display the Roman
        numeral version of that number. If the number is outside the range of
        1-10, the program should display an error message.*/
        int z;
        Scanner newScan  = new Scanner(System.in);
        System.out.println("Insert integer Number between 1-10");
        z=newScan.nextInt();
        switch (z) {
            case 1:
                z = 1;
                System.out.println("The Roman numeral version of " + z + " is I ");
                break;
            case 2:
                z = 2;
                System.out.println("The Roman numeral version of " + z + " is II ");
                break;
            case 3:
                z = 3;
                System.out.println("The Roman numeral version of " + z + " is III ");
                break;
            case 4:
                z = 4;
                System.out.println("The Roman numeral version of " + z + " is IV ");
                break;
            case 5:
                z = 5;
                System.out.println("The Roman numeral version of " + z + " is V ");
            case 6:
                z = 6;
                System.out.println("The Roman numeral version of " + z + " is VI ");
                break;
            case 7:
                z = 7;
                System.out.println("The Roman numeral version of " + z + " is VII ");
                break;
            case 8:
                z = 8;
                System.out.println("The Roman numeral version of " + z + " is VIII ");
                break;
            case 9:
                z = 9;
                System.out.println("The Roman numeral version of " + z + " is IX ");
                break;
            case 10:
                z = 10;
                System.out.println("The Roman numeral version of " + z + " is X ");
                break;
            default:
                System.out.println("You have provided a number out of range");
                exe9();
                break;
        }

    }

    private static void exe8() {
       /* Write a program that has variables to hold three test scores. The
        program should ask the user to enter three test scores. The program
        should display the average of the test scores and the letter grade that is
        assigned for the test score average. Use the grading scheme in the
        following table:
        Test Score Average Letter Grade
        90-100 A
        80-89 B
        70-79 C
        60-69 D
        Below 60 F*/
        int[] scores= new int[3];
        int total=0;
        double avg;
        String gradeLetter="";


        Scanner newScan  = new Scanner(System.in);
        for (int i=0; i<scores.length; i++)//reading input
        {
            System.out.println("Insert Score :"+(i+1));
            scores[i]=newScan.nextInt();
            if (scores[i]>100||scores[i]<0){
               System.out.println("Number out of range");
               exe8();
            }

            total=total+scores[i];
        }
        avg=total/scores.length;
        if (avg<60){
            gradeLetter="F";
        }else if (avg>=60) {
            if (avg >= 70) {
                if (avg >= 80) {
                    if (avg >= 90) {
                        gradeLetter = "A";
                    }
                    else gradeLetter="B";

                }else
                    gradeLetter = "C";
            }else
                gradeLetter="D";
        }

        System.out.println("\nThe average score is:"+avg+"\nFinal Grade:"+ gradeLetter );




    }



    private static void exe7() {
/*        7. Write a program that reads three integers and prints them in ascending
        order.*/
        int[] numbers= new int[3];
        int var=0;

        Scanner newScan  = new Scanner(System.in);
        for (int i=0; i<numbers.length; i++)
        {
            System.out.println("Insert number:"+i);
            numbers[i]=newScan.nextInt();

            if (var < numbers[i]){
                var=numbers[i];
            }
         }
        Arrays.sort(numbers);
        System.out.println("\nThe Numbers in ascending order are: \n");
        for (int i=0; i<numbers.length; i++)
        {
              System.out.println(numbers[i]);
        }
    }

    private static void exe6() {
        /*Write a program that reads three integers from the console and
        prints the largest of the three integers.*/
        int[] numbers= new int[3];
        int var=0;

        Scanner newScan  = new Scanner(System.in);
        for (int i=0; i<numbers.length; i++)
        {
            System.out.println("Insert number:"+i);
            numbers[i]=newScan.nextInt();

            if (var < numbers[i]){
                var=numbers[i];
            }
        }

       System.out.println("The largest number of the three is : " +var);

    }

    private static void exe5() {
/*        Write a program using dialog boxes that asks the user to enter the name of his or her favorite city. Use a String to store the input.
        The program should then display the following:
        a. The number of characters in the city name
        b. The name of the city in all uppercase letters
        c. The name of the city in all lower case letters
        d. The first character in the name of the city*/
        Scanner newScan  = new Scanner(System.in);
        String city;
        city = JOptionPane.showInputDialog("Insert your favorite city");
        System.out.println("a. The number of characters in the city name :" + city.length());
        System.out.println("b. The name of the city in all uppercase letters: " + city.toUpperCase());
        System.out.println("c. The name of the city in all lower case letters: " + city.toLowerCase());
        System.out.println("d. The first character in the name of the city: " + city.charAt(0));


    }

    private static void exe4() {
       // Write a Java program that asks/reads your name using a dialog box and prints “Hello Your Name” on a message dialog.
        Scanner newScan  = new Scanner(System.in);
        String name;
        name = JOptionPane.showInputDialog("Insert your name");
        JOptionPane.showMessageDialog(null,"hello , "+name);

    }

    private static void exe3() {
        //Write a program that accepts a temperature in Farenheit from a user in the console and converts it to
        // Celsius by subtracting 32 from the Farenheit value and multiplying the result by 5/9. Display both values on the console.
        Scanner newScan  = new Scanner(System.in);
        System.out.println("Insert temperature in Farenheit :");
        double x = newScan.nextDouble();
        x=((x-32)*(5))/(9);
        System.out.println("The temperature un celsius is : "+x);
    }

    public static void exe2() {
//        Write a Java program that prints the following lines on the console:
//        A “quoted” String is much better
//        if you learn the rules of escape sequences.”

//        Also, “” represents an empty string

//        Don’t forget to use \” to print “” on your console
//        Note that there are 2 blank lines in this output.

          System.out.println("A \2 quoted  \" String is much better \nif you learn the rules of escape sequences");
          System.out.println(" ");
          System.out.println("Also, \"\" represent an empty string");
          System.out.println("");
          System.out.println("Don’t forget to use \\\" to print \"\" on your console \nNote that there are 2 blank lines in this output.");
    }

    public static void exe1() {
        //Write a simple program in Java using Eclipse IDE to print the greeting “Hello World” to the console.
        System.out.println("hello World");//first

    }
}
