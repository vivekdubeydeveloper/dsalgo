package com.vivek.patterns;

public class TrianglePattern {
    public static void main(String[] args) {
        int rows = 10;
        int starCount = 1;

//        printTrianglePattern(rows,starCount);
        printTrianglePatternNumber(rows,starCount);
    }

    private static void printTrianglePattern(int rows,int starCount) {
        //create a loop for rows
        for (int i = 0; i < rows; i++) {
            //create a loop that will print a single line with 1 stars
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            //In each iteration star count will be increase by 1
            starCount++;
            System.out.println();
        }

    }

    private static void printTrianglePatternNumber(int rows,int starCount) {
        //create a loop for rows
        for (int i = 0; i < rows; i++) {
            //create a loop that will print a single line with 1 stars
            int begin = 1;
            for (int j = 0; j < starCount; j++) {
                System.out.print(begin);
                begin++;
            }
            //In each iteration star count will be increase by 1
            starCount++;
            System.out.println();
        }

    }
}
