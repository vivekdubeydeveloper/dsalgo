package com.vivek.patterns;

public class CountDigit {
    public static void main(String[] args) {
        CountDigit cd = new CountDigit();
        System.out.println(cd.countDigit(123456));
    }

    public int countDigit(int num){
        int digitCount = 0;
        while (num>0){
            num = num / 10;
            digitCount++;
        }

        return digitCount;
    }
}
