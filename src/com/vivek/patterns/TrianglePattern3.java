package com.vivek.patterns;

public class TrianglePattern3 {
    public static void main(String[] args) {
        TrianglePattern3 tp3 = new TrianglePattern3();
        tp3.printStarTrianglePattern(10, 1);
        tp3.printNumberTrianglePattern(10,5);
    }

    public void printStarTrianglePattern(int rows, int startCount){
        int totalStar = rows * 2 - 1;
        int mid = totalStar / 2;

        StringBuilder sb = new StringBuilder(" ".repeat(totalStar));
        sb.insert(mid, "*");
        System.out.println(sb);
        for (int i = 1; i <rows ; i++) {
            sb.setCharAt(sb.indexOf("*") - 1,'*');
            sb.setCharAt(sb.lastIndexOf("*") + 1,'*');
            System.out.println(sb);
        }
    }

    public void printNumberTrianglePattern(int rows, int startCount){

        int totalStar = rows * 2 - 1;

        StringBuilder sb = new StringBuilder("*".repeat(totalStar));
        System.out.println(sb);
        for (int i = 1; i <rows ; i++) {
            sb.setCharAt(sb.indexOf("*"),' ');
            sb.setCharAt(sb.lastIndexOf("*"),' ');
            System.out.println(sb);
        }
    }
}
