package org.example;

public class LinearSearch {
    // linear search method
    public static int search(int arr[], int x){
        int n = arr.length;
        int i = 0, location;
        while(i <=n && x!= arr[i]){
            i=i+1;
        }
        if(i <= n){
            return location = i;
        }
        else {
            return location = 0;
        }
        }

    }
    // The asymptotic analysis of this code is Big O(n).
