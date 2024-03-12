package com.vivek.patterns;

public class TrianglePattern2 {
    public static void main(String[] args) {
        TrianglePattern2 tp2 = new TrianglePattern2();
        tp2.printStarTrianglePattern(5, 5);
        tp2.printNumberTrianglePattern(5,5);
    }

    public void printStarTrianglePattern(int rows, int startCount){

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < startCount; j++) {
                System.out.print("*");
            }
            System.out.println();
            startCount--;

        }
    }

    public void printNumberTrianglePattern(int rows, int startCount){

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < startCount; j++) {
                System.out.print(j+1);
            }
            System.out.println();
            startCount--;

        }
    }
}
