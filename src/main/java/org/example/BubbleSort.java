package org.example;

public  class BubbleSort {
    // bubble sort method
    public static void bubbleSort(int [] a, int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down // outer loop runs n times
            for (inner = 0; inner < outer; inner++) { // bubbling up // inner loop runs n times
                if (a[inner] > a[inner + 1]) { // if out of order...
                    temp = a[inner]; // ...then swap
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }
}
// n * n = n^2
// Time complexity of this algorithm is O(n^2)
