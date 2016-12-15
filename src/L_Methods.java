/**
 * Created by mqf504 on 12/12/16.
 */

    class Man {
        String name;
        int age;

        void speak() {
        System.out.println("My name : "+ name );
            System.out.println("My Age : "+ age );
        }
        }

public class L_Methods {
    public static void main(String[] args) {

        Man man1 = new Man();
        {
            man1.name = "John";
            man1.age = 24;
            man1.speak();
        }
    }

}

