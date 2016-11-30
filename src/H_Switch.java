import java.util.Scanner;

/**
 * Created by mqf504 on 11/29/16.
 */
public class H_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first num ");
        int num1 =scanner.nextInt();
        System.out.println("Please enter second num ");
        int num2 =scanner.nextInt();

        System.out.println("Please enter the operation you want to perform");
//        Scanner scanner2 = new Scanner(System.in);
        String myoperation = scanner.next();

        switch (myoperation){
            case "add": {
                int mynum = num1 + num2;
                System.out.println(mynum);
                break;
            }

            case "sub": {
                int mynum = num1 - num2;
                System.out.println(mynum);
                break;
            }

            case "mul": {
                int mynum = num1*num2;
                System.out.println(mynum);
                break;
            }

            case "div": {
                float mynum = num2/num1;
                System.out.println(mynum);
                break;
            }
            default:
                System.out.println("Operation Not Found");
                break;

        }

    }
}
