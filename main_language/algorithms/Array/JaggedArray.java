// are useful when we want store collections of data that have differents length.

package Array;

public class JaggedArray {
    public static void main(String[] args) {
        // jagged array are also called arrays of arrays
        int[][] jaggedArray = new int[3][];

        // when you have collections with differents size jagged arrays are useful.
        // so we have example: products of category B and all of them have a different length.
        jaggedArray[0] = new int[] { 1, 2, 3 };
        jaggedArray[1] = new int[] { 4, 5 };
        jaggedArray[2] = new int[] { 6, 7, 8, 9 };
        for (int i = 0; i < jaggedArray.length; i++) {
            // here iterate through each element in that subarray.
            for (int j = 0; j < jaggedArray[i].length; j++) {
                // write down j and we go into the i "iteration"  of current array
                System.out.println(jaggedArray[i][j]);
            } 
        }
    }
}