package ru.mirea.task4.matrix;

public class MatrixTester {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(4, 2);
        m1.fillMatrix();
        Matrix m2 = new Matrix(2, 3);
        m2.fillMatrix();
        Matrix m3;

        System.out.println("\nMatrix1 multiplication by matrix2:");
        if (Matrix.isMultiplied(m1, m2)) {
            m3 = m1.multiplyByMatrix(m2);
            m3.printMatrix();
        } else {
            System.out.println("Error, wrong size of the matrix");
        }

        System.out.println("\nMatrix2 multiplication by number -7.3:");
        m2.multiplyByNumber(-7.3);
        m2.printMatrix();

        System.out.println("\nMatrix1 addition to matrix 1:");
        if (Matrix.isEqualSize(m1, m1)) {
            m1.addMatrix(m1);
            m1.printMatrix();
        } else {
            System.out.println("Error, wrong size of the matrix");
        }
    }
}
