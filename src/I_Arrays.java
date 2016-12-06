/**
 * Created by mqf504 on 11/29/16.
 */

public class I_Arrays {
    public static void main(String[] args){

        // Using Array
        int[]  values;
        values = new int[4];

        values[0] = 1;
        values[1] = 2;
        values[2] = 3;
        values[3] = 4;

        for(int i=0;i<values.length;i++){
            System.out.println(values[i]);
        }
        System.out.println("\n");

        // Declaring Arrays directly with values
        String[] arrvalues = {"apple","mango","banana","orange","pear"};

        for(int i=0;i<arrvalues.length;i++){
            System.out.println(arrvalues[i]);
        }
        System.out.println("\n");

        // Another way to iterate through array
        String[] vegetables = {"potato","onion","tomato","cabbage","cauliflower"};
        for(String vegetable :vegetables ){
            System.out.println(vegetable);
        }

        // By default array is initialized to null
        String[] texts;
        texts = new String[2];
        System.out.println("Default value of array - " + texts[0]);

        String[] data;
        data = new String[2]; // since we dont know how long a string could be, texts will just allocate memory for 2 string references and nor strings

        data[0] = "my data"; // here we allocate memory to 0 reference of data array

    }
}
