package Array;
// problem: Requiring client to provide capacity does not implement API!
// solve: How to grow and shrink array?


public class ResizingArray {
    // need copy the whole array to a new.
    private static void  resize(int[] array, int oldSize, int amount ) {
        int new_size = oldSize + amount;
        int[] newArray = new int[new_size];

    }
    public static void resizingArrayStackOfStrings(String[] args) {
        int arraySize = 50;
        System.out.println(arraySize);
        int[] myArray = new int[arraySize];
    // inserting first N items takes times proportional to 1 + 2 +... + N
        resize(myArray, 50, 100);
    }
}
