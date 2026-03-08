package com.gla.method.Level3;
import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        int[][] transpose = new int[3][3];

        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
                matrix[i][j] = (int)(Math.random()*10);

        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("Transpose Matrix:");

        for (int i=0;i<3;i++) {

            for (int j=0;j<3;j++)
                System.out.print(transpose[i][j]+" ");

            System.out.println();
        }
    }
}
