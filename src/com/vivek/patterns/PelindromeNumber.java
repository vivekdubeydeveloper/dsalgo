package com.vivek.patterns;

public class PelindromeNumber {
    public static void main(String[] args) {
        PelindromeNumber pn = new PelindromeNumber();
        System.out.println(pn.isPelindromNumber(121));
    }

    public boolean isPelindromNumber(int num){
        int input = num;
        int reverse = 0;
        while (num!=0){
            int rem = num % 10;
            num = num / 10;
            reverse = reverse * 10 + rem;

        }

        return input==reverse;
    }
}
