/**
 * Created by mqf504 on 12/15/16.
 */

class Human {
    String name;
    int age;

    void speak(){
        System.out.println(""+name+" speaks English");
    }

    int calculateYearsToRetirement(){
        return (65 - age);
    }
}


public class M_GettersAndSetters {
    public static void main(String[] args) {

        Human human1 = new Human();
        {
            human1.name = "John";
            human1.age = 40;

            human1.speak();;
            int years = human1.calculateYearsToRetirement();

            System.out.println("Years to Retirement :"+ years);
        }

    }

}
