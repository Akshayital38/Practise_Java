package com.self.practise;

// A Java program to generate palindromic
// numbers less than n.
public class example1 {

    // A utility for creating palindrome
    static int createPalindrome(int input, int b, int isOdd) {
        int n = input;
        int palin = input;

        // checks if number of digits is odd or even
        // if odd then neglect the last digit of input in
        // finding reverse as in case of odd number of
        // digits middle element occur once
        if (isOdd == 1)
            n /= b;

        // Creates palindrome by just appending reverse
        // of number to itself
        while (n > 0) {
            palin = palin * b + (n % b);
            n /= b;
        }
        return palin;
    }

    // Function to print decimal palindromic number

    static void generatePalindromes(int n) {
        int number;

        // Run two times for odd and even
        // length palindromes
        for (int j = 0; j < 2; j++) {

            // Creates palindrome numbers with first
            // half as i. Value of j decided whether
            // we need an odd length of even length palindrome.

            int i = 1;
            while ((number = createPalindrome(i, 10, j % 2)) < n) {
                System.out.print(number + " ");
                i++;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        int n = 104;
        generatePalindromes(n);
    }
}

