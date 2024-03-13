package Array;
// problem: Requiring client to provide capacity does not implement API!
// solve: How to grow and shrink array?


public class ResizingArray {
    public static void main(String[] args) {
        int[] arrayUtil = { 10, 20, 30 };
        printArray(arrayUtil);
        int[] originalArray = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("the size of original array - " + originalArray.length);
        int[] resizedArray = resize(originalArray, 10);
        System.out.println("the rezied array is - " +  resizedArray.length);
    }
    // need copy the whole array to a new.
    private static void  printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // after created array we can´t really resize this array to this capacity.
    public static int[] resize(int[] array, int capacity) {
        // what we really do is create a temporary array.
        int[] temp = new int[capacity];
        // Copy elements from the original array to the temporary array
        for(int i = 0; i < array.length; i++) {
            // we iterate every element of our original array.
            // take index simply copy the value from our original array.
            temp[i] = array[i];
        }
        // our original array variable will point to this temporary array.
        array = temp;
        return array;
    }
}