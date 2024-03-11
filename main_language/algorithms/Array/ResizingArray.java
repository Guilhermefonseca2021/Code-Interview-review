package Array;
// problem: Requiring client to provide capacity does not implement API!
// solve: How to grow and shrink array?


public class ResizingArray {
    // need copy the whole array to a new.
    private static void  printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    // after created array we can´t really resize this array to this capacity.
    public static void resize(int[] arr, int capacity) {
        // what we really do is create a tempory array.
        int[] temp = new int[capacity];
        for(int i = 0; i < arr.length; i++) {
            // we iterate every element of our original array.
            // take index simply copy the value from our original array.
            temp[i] = arr[i];
        }
        // our original array variable will point to this temporary array.
        arr = temp;
    }
    public static void main(String[] args) {
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.printArray(new int[] { 5, 1, 2, 9, 10 });

    }
}
