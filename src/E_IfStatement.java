/**
 * Created by mqf504 on 11/29/16.
 */
public class E_IfStatement {
    public static void main(String[] args) {

        boolean cond = 3 > 5;
//        System.out.println(cond);
        System.out.printf("Boolean Result of Condition is %b", cond);
        int myInt = 10;

        if (myInt == 4){
            System.out.printf("\n%s", myInt + " is equal to 4");

        } else if(myInt > 4) {
            System.out.printf("\n%s", myInt +" is greater than 4");

        }
        else {
            System.out.printf("\n%s", myInt+" is less than 4");
        }


        E_IfStatement a = new E_IfStatement();
        a.myMethod();
    }

//     you can not call a non static method from static one - Since main is a static method and myMethod is non static , there are two ways to call
//    it from main - either make your method static or create an instance of main method and call it using that instance.

    public void myMethod() {
        int n = 10;

        for(int i=0;i<n;i++){
            if (i == 6){
                System.out.println("\ni is equal to 6, Breaking the loop");
                break;
            }
            System.out.printf("\nLooping %d ",i);
        }

    }
}
