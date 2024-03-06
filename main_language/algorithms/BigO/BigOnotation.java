package BigO;

public class BigOnotation {
    // O(n)
    public static void foo(int[] array) {
        // BigO notation will always drop constants.
        int sum = 0;
        int product = 1;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for(int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + ", " + product);
    }
    // O(n + a); array more size.
    public static void printPairs(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j< array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
    // O(a.b) a = size, size multiplied by b
    public static void printUnorderedPairs(int[] arrayA, int[] arrayB) {
        for(int i= 0; i< arrayA.length; i++) {
            for(int j = 0; j< arrayB.length; j++) {
                for(int k = 0; k < 100000; k++) {
                    System.out.println(arrayA[i] + ", " + arrayB[j]);
                }
            }
        }
    }
}