/**
 * Created by mqf504 on 11/30/16.
 */

    class Person {

        // Instance Variables (Data or state)

        String name;
        int age;


        // Class Can contain
        // 1. Data / Instance variables
        // 2. Subroutines

        }



// if the class is public - The name of file must match with the name of the class .

public class K_ClassesAndObjects {
    public static void main(String[] args) {

        // created a variable person1 of type Person (which is person class)
        //new Person() - object created for person1 variable
        Person person1 = new Person();
        {
            person1.name = "John";
            person1.age = 20;
        }

        Person person2 = new Person();
        {
            person2.name = "Bob";
            person2.age = 25;
        }

        System.out.println(person1.name);
        System.out.println(Math.abs(93));

        System.out.println(35 % 3);

        K_ClassesAndObjects myClass = new K_ClassesAndObjects();
        int[] nums= {1,2,3,4};
        myClass.firstLast6(nums);
    }

    public boolean firstLast6(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if ((nums[i]) == 6) {
                    return true;
                }
            }

            if (i == nums.length) {
                if ((nums[i]) == 6) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
