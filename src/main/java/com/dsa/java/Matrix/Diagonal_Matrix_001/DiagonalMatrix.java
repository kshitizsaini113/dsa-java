package com.dsa.java.Matrix.Diagonal_Matrix_001;

public class DiagonalMatrix {

    int[] matrix;

    void createDiagonalMatrix(int n) {
        matrix = new int[n];
    }

    void set(int i, int j, int element) {
        if(i==j) {
            matrix[i] = element;
        } else if(element!=0) {
            System.out.println("Can't set a non zero element to the index : (" + i + ", " + j + ")");
        }
    }

    int get(int i, int j) {
        if(i==j) {
            return matrix[i];
        } else {
            return 0;
        }
    }

    void printMatrix() {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                if(i==j) {
                    System.out.print(matrix[i] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DiagonalMatrix diagonalMatrix = new DiagonalMatrix();

        diagonalMatrix.createDiagonalMatrix(5);
        diagonalMatrix.set(0, 0, 5);
        diagonalMatrix.set(1, 1, 2);
        diagonalMatrix.set(2, 2, 1);
        diagonalMatrix.set(3, 3, 3);
        diagonalMatrix.set(4, 4, 7);
        diagonalMatrix.set(1, 4, 0);
        diagonalMatrix.set(3, 2, 1);
        diagonalMatrix.printMatrix();
    }
}
