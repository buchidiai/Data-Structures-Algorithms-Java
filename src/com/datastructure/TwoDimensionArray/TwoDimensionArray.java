package com.datastructure.TwoDimensionArray;

public class TwoDimensionArray {
    //Two dimension array
    public static void main(String[] args) {
        int[][] data = new int[3][3];
        //1st row
        data[0][0] = 1;
        data[0][1] = 2;
        data[0][2] = 5;
        //2nd row
        data[1][0] = 5;
        data[1][1] = 8;
        data[1][2] = 12;
        //3rd row
        data[2][0] = 0;
        data[2][1] = 0;
        data[2][2] = 0;

        int row = 1;
        for (int i = 0; i < data.length; i++) {
            System.out.println("Row " + row  + "\t");
            row++;
            for (int j = 0; j < data.length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
