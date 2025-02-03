package com.self.Recursion;

public class recursionExamples {

    // number of digits in a number
    static int countDigit(int n){
        if (n / 10 == 0)
            return 1;
        return 1 + countDigit(n / 10);

    }
    public static void main(String[] args) {

        System.out.print(countDigit(62347823));

    }
}
