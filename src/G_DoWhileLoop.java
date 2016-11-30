import java.util.Scanner;

/**
 * Created by mqf504 on 11/29/16.
 */
public class G_DoWhileLoop {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // *********************** Using WHILE ***************************

        System.out.println("Enter a number");

        int value = myObj.nextInt();
        System.out.println("You entered "+value);

        while (value!=5){
            System.out.println("Please enter again");
            value = myObj.nextInt();
            System.out.println("You entered "+value);

        }
        System.out.printf("\n%s","Got 5, Exit!");

        //  ********************** Using DO WHILE ********************************

        // Variable value should be declared/defined out of the brackets of do other wise, we would not be able to use it in while condition because
        // its scope will only be restricted to do.

        int integer =0;
        do {
            System.out.println("Enter a number");
            integer = myObj.nextInt();


        }while(integer!=5);
        System.out.printf("\n%s","Got 5, Exit!");
    }
}
