/**
 * Created by mqf504 on 12/15/16.
 */
class Robot {
    public void speak(String text){
        System.out.println(text);
    }

    public void height(double height){
        System.out.println("My height is "+ height);
    }

    public void move(int distance,String direction){
        System.out.println("I am moving "+distance+" meters in "+direction +" direction");
    }
}
public class N_MethodsParameters {

    public static void main(String args[]) {
        Robot sam = new Robot();
        {
            String greeting = "Hello, My name is Sam";
            sam.speak(greeting);
            sam.height(6.2);
            sam.move(5,"South");
        }
    }


}
