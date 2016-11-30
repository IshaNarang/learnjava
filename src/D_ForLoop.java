/**
 * Created by mqf504 on 11/29/16.
 */
public class D_ForLoop {
    public static void main(String[] args){

//        2 semi colons divide for loop in 3 () -> sections. The first section is executed before the loops start (means, before the
//        inside statement is printed in this case)

        for(int i=0;i<5;i++){
            System.out.println("Hello");

        }

//        Replacement of println is printf - used as below
//        %d is replaced by the argument given after comma in printf bracket - if it is integer
//        %b for boolean and so on

        for(int i=0;i<5;i++){

            System.out.printf("Hello %d\n", i );
        }
    }
}
