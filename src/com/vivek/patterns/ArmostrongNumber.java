package com.vivek.patterns;

public class ArmostrongNumber {
    public static void main(String[] args) {
        ArmostrongNumber an = new ArmostrongNumber();
        System.out.println(an.isArmostrongNumber(1634));
    }

    public boolean isArmostrongNumber(int number){
        int copy = number;
        int digit = getNoOfDigit(number);
        int sum = 0;
        while(copy!=0){
            sum = sum + (int)Math.pow(copy % 10, digit);
            copy /= 10;
        }

        return sum == number;
    }

    private int getNoOfDigit(int num){
        int digit = 0;
        while(num!=0){
            num /= 10;
            digit++;
        }

        return digit;
    }
}
