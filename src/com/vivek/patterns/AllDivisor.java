package com.vivek.patterns;

import java.util.function.Predicate;

public class AllDivisor {
    public static void main(String[] args) {
        AllDivisor ad = new AllDivisor();
        ad.printAllDivisor(97);

    }

    public void printAllDivisor(int num){
        Predicate<Integer> isDivisble = x -> num % x == 0;
        int divisor = 1;
        while(divisor<=num){
            if(isDivisble.test(divisor))
                System.out.println(divisor);

            divisor++;
        }
    }
}
