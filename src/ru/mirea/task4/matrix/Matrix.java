package ru.mirea.task4.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    private int columns;
    private int lines;
    private double[][] matrixArr;

    public Matrix(int lines, int columns) {
        this.columns = columns;
        this.lines = lines;
        this.matrixArr = new double[lines][columns];
    }

    public void fillMatrix() {
        System.out.println("Enter " + this.lines + " lines with " + this.columns + " elements: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lines; i++) {
            this.matrixArr[i] =  Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        }
    }

    public void addMatrix(Matrix matrix) {
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.matrixArr[i][j] += matrix.matrixArr[i][j];
            }
        }
    }

    public void multiplyByNumber(double number) {
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.matrixArr[i][j] *= number;
            }
        }
    }

    public Matrix multiplyByMatrix(Matrix matrix) {
        Matrix newMatrix = new Matrix(this.lines, matrix.columns);
        for (int i = 0; i < newMatrix.lines; i++) {
            for (int j = 0; j < newMatrix.columns; j++) {
                
                double value = 0;

                for (int k = 0; k < matrix.lines; k++) {
                    value += this.matrixArr[i][k] * matrix.matrixArr[k][j];
                }
                newMatrix.matrixArr[i][j] = value;
            }
        }
        return newMatrix;
    }

    static public boolean isMultiplied(Matrix matrix1, Matrix matrix2) {
        return matrix1.columns == matrix2.lines;
    }

    static public boolean isEqualSize(Matrix matrix1, Matrix matrix2) {
        return (matrix1.lines == matrix2.lines || matrix1.columns == matrix2.columns);
    }

    public void printMatrix() {
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.printf("%7.1f\t", matrixArr[i][j]);
            }
            System.out.println();
        }
    }
}
