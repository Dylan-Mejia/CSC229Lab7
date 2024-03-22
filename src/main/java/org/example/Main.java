package org.example;

// importing each java class file
import static org.example.BinarySearch.runBinarySearchIteratively;
import static org.example.BubbleSort.bubbleSort;
import static org.example.LinearSearch.search;
import static org.example.Problem01.getSumOfPrimes;

// @author Dylan Mejia

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90}; // array declaration
        System.out.println(search(arr,60)); // testing linear search method (prints index of element)
        int [] sortedArray  = {2,4,6,8,10,12,14,16,18,20}; // array declaration
        System.out.println(runBinarySearchIteratively(sortedArray,8,1,10)); // testing binary search method (prints index of element)
        int [] a = {3,8,6,5,7,4}; // array declaration
        bubbleSort(a,6); // testing bubble sort method (no output)
        for(int i = 0; i < a.length; i++){ // For loop used to print out sorted elements in array
            System.out.println(a[i]); // testing bubble sort method (with output)
        }
        System.out.println(getSumOfPrimes(100)); // testing getSumOfPrimes method
        }
    }
