package com.vivek.patterns;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber rn = new ReverseNumber();
        System.out.println(rn.reverseDigit(12));
    }

    public int reverseDigit(int num){
        int result = 0;

        while(num!=0){
            int rem = num % 10;
            num /= 10;
            result = result * 10 + rem;
        }

        return result;
    }
}
