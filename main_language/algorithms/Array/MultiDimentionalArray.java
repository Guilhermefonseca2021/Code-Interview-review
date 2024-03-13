package Array;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        // declaring multi-dimensional array:
        int[][] marks = new int[2][3];

        // assign multi-dimensional array:
        marks[0][0] = 10;
        marks[0][1] = 20;
        marks[0][2] = 30;
        marks[1][0] = 40;
        marks[1][1] = 50;
        marks[1][2] = 60;

        // initialing multi-dimensional array:
        int[][] another1 = {
            {10, 20, 30},
            {40, 50, 60}
        };
        System.out.println(another1);

        for (int i = 0; i <= 1; i++) { // rows
            for (int j = 0; j <= 2; j++) { //columns
                System.out.print(marks[i][j] + "/t");
            }
            System.out.println();
        }
    }
}
