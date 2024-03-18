package com.vivek.patterns;

public class CheckPrime {
    public static void main(String[] args) {
        CheckPrime cp = new CheckPrime();
        System.out.println(cp.isPrime(37));
    }

    public boolean isPrime(int num){
        for(int i=2;i<num-1;i++){
            if(num%i==0)
                return false;
        }

        return true;
    }
}
