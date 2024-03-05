package com.vivek.patterns;

import java.util.stream.IntStream;

public class RectanglePattern {
    public static void main(String[] args) {
        int rows = 7;
        int starCount = 20;

//        printRectanglePattern(rows,starCount);
        printRectanglePatternAlternate(rows,starCount);

    }

    /**
     * This method will print star in rectangle pattern
     *
     * For example, I want to print 3 rows with 5 start
     */
    private static void printRectanglePattern(int rows,int starCount) {
       //create a loop for rows
        for (int i = 0; i < rows; i++) {
            //create a loop that will print a single line with 5 stars
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void printRectanglePatternAlternate(int rows,int starCount) {
        IntStream.rangeClosed(1,rows).forEach((row)->System.out.println("*".repeat(starCount)));
//        IntStream.rangeClosed(1,rows).mapToObj(num->"*".repeat(starCount)).forEach(System.out::println);
    }
}
