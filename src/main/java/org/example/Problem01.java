package org.example;

public  class Problem01 {
    // getSumOfPrimes method

    public static long getSumOfPrimes(int n) {
        int sum = 0;
        for(int i = 2; i <= n; i++){ // outer loop runs n times
            boolean primeNum = true;
            for(int x = 2; x <= Math.sqrt(i); x++){ // inner loop runs sqrt of n times
                if (i % x == 0){
                    primeNum = false;
                }
            }
            if(primeNum == true){
                sum += i;
            }
        }
        return sum;
    }
    }
    // n * sqrt n
    // Time complexity of this algorithm is O(n * sqrt n)
    // Space complexity of this algorithm is O(1)

