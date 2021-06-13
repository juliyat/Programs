package com.company.algs;

public class BinarySearchIterative {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 4;
        System.out.println(iterativeSearch(arr, x));

    }

    private static boolean iterativeSearch(int[] arr, int x) {
       int left =0;
       int right = arr.length-1;
        if (left > right)
            return false;
        while (left <= right) {
            int mid = (left + right )/2 ;
            if(x == arr[mid]) {
                System.out.println(mid);
                return true;
            }
           else if (x < arr[mid]) {
               right = mid - 1 ;
            } else
               left = mid + 1 ;
        }
        return true;
    }

}

