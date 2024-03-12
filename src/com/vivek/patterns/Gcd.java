package com.vivek.patterns;

public class Gcd {
    public static void main(String[] args) {
        Gcd gcd = new Gcd();
        System.out.println(gcd.getGCD(32,60));
    }

    public int getGCD(int num1,int num2){
        int smaller = num1 > num2 ? num2 : num1;
        int greater = (num1 == smaller) ? num2 : num1;

        while(greater!=0){
            if(greater%smaller==0)
                return smaller;
            int rem = greater % smaller;
            greater = smaller;
            smaller = rem;
        }

        return smaller;
    }
}
