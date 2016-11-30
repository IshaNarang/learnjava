import java.util.Scanner;

/**
 * Created by mqf504 on 11/29/16.
 */
public class F_GettingUserInput {
    public static void main(String[] args){
//        syntax to create a new scanner object and injecting created system scanner input
        Scanner getinput = new Scanner(System.in);

        // Output the prompt
        System.out.println("Please enter your name");

        // Wait for user to enter text
        String text = getinput.nextLine();

        // Output the user entered data
        System.out.println("My name is "+ text);

        // Ask use to enter a number
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int value = input.nextInt();
        System.out.println("My ajge is  "+ value);

        // Ask use to enter a float
        Scanner enterdouble = new Scanner(System.in);
        System.out.println("Please enter a floating number");
        double mydouble = enterdouble.nextDouble();
        System.out.println("My number is  "+ mydouble);

    }
}
