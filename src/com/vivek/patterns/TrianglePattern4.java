package com.vivek.patterns;

import javax.sound.midi.Soundbank;

public class TrianglePattern4 {
    public static void main(String[] args) {
        TrianglePattern4 tp3 = new TrianglePattern4();
        tp3.printStarTrianglePattern(5, 1);
    }

    public void printStarTrianglePattern(int rows, int startCount){
        for(int i=0;i<rows;i++){
            for (int j = 0; j <startCount ; j++) {
                System.out.print("*");
            }
            System.out.println();
            startCount++;
        }

        startCount-=2;
        rows--;
        for(int i=rows;rows >0;rows--){
            for (int j = 0; j <startCount ; j++) {
                System.out.print("*");
            }
            System.out.println();
            startCount--;
        }


    }

}
