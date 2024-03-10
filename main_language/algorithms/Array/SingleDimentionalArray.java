package Array;

public class SingleDimentionalArray {
    public static void main(String[] args) {
        // declare an array
        int marks[] = new int[5];

        // assing elements to ana array:
        marks[0] =  10;
        marks[1] =  20;
        marks[2] =  30;
        marks[3] =  40;
        marks[4] =  50;

        // initialing an array;
        int[] another1 = {10, 20, 30, 40, 50};

        // for loop:
        for (int index = 0; index < marks.length; index++) {
            System.out.println(marks[index]);
        }

        // forEach loop:
        for (int another : another1) {
            System.out.println(another);
        }

    }
}