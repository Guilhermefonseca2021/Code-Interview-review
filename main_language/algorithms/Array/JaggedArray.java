// are useful when we want store collections of data that have differents length.

package Array;

public class JaggedArray {
    public static void main(String[] args) {
        // jagged array are also called arrays of arrays
        int[][] jaggedArray = new int[3][];

        jaggedArray[0] = new int[] { 1, 2, 3 };
        jaggedArray[1] = new int[] { 4, 5 };
        jaggedArray[2] = new int[] { 6, 7, 8, 9 };
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.println(jaggedArray[i][j]);
            }
        }
    }
}