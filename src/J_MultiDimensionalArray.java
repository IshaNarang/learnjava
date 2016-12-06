/**
 * Created by mqf504 on 11/30/16.
 */
public class J_MultiDimensionalArray {

    public static void main(String[] args) {

        int[][] arrMulti = {
                {3, 5, 6, 5, 7, 8},
                {2, 4},
                {11, 12, 13, 14}

        };
        // printing a multi dimensional array

        String[][] arrMultiStr;
        arrMultiStr = new String[2][4];

        System.out.print("\n"+arrMulti[0][1]);

        System.out.print("\n" + arrMultiStr[0][1]);

        arrMultiStr[0][2] = "Hello ";
        System.out.print("\n" + arrMultiStr[0][3]);

        // Iterate through Multi dimensional array

        for (int row=0;row<arrMulti.length;row++){
            for(int col=0;col<arrMulti[row].length;col++){
                System.out.print(arrMulti[row][col] + "\t");
            }
            System.out.println();
        }

        // create a multi dimensional array with initialising just rows and later defining columns

        String[][] arrRows;

        arrRows = new String[3][];

        arrRows[0] = new String[3];

        arrRows[0][2] = "This is 2nd column of 0th Row";

        System.out.println(arrRows[2]);

        System.out.println("\n" + arrRows[0][2]);


    }
}
