package com.company.algs;

public class BinarySearchRecursive {

    public static void main(String[] args){
        int[] arr  = {1,2,3,4,5,6,7,8,9};
        binarySearch(arr,4,0,arr.length-1);

    }
    private static boolean binarySearch(int[] arr, int x, int left, int right){
        System.out.println("Im here");
        if(left > right)
            return false;
       int mid = (left + right) / 2 ;
        System.out.println("Im here1"+mid);
        if (arr[mid] == x) {
            System.out.println(mid);
            return true;
        }
        else if (x <= arr[mid] ){
            return binarySearch(arr, x, left, mid-1);
        }
          else
              return binarySearch(arr, x, mid+1, right);

    }
}
