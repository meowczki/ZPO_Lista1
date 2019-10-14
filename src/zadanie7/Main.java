package zadanie7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arrayA[][] = new int[4][4];
        int arrayB[][] = new int[4][4];
        int arrayC[][] = new int[4][4];


        for (int row = 0; row < arrayA.length; row++) {
            for (int col = 0; col < 3; col++) {
                if (col < 3) {
                    arrayA[col][col + 1] = 1;
                } else {
                    arrayA[row][row] = 0;
                }
            }
        }

        for (int row = 0; row < arrayB.length; row++) {
            for (int col = 0; col < arrayB[row].length; col++) {
                if (col == 1) {
                    arrayB[row][col] = 1;
                } else {
                    arrayB[row][col] = 0;

                }
            }
        }

        for (int row = 0; row < arrayC.length; row++) {
            for (int col = 0; col < arrayC[row].length; col++) {
                if (col == row) {
                    arrayC[row][col] = 1;
                } else {
                    arrayC[row][col] = 0;

                }
            }
        }
        for (int[] row : arrayA){
            System.out.println(Arrays.toString(row));

        }
        System.out.println();

        for (int[] row : arrayB){
            System.out.println(Arrays.toString(row));

        }
        System.out.println();

        for (int[] row : arrayC){
            System.out.println(Arrays.toString(row));

        }


    }
}
