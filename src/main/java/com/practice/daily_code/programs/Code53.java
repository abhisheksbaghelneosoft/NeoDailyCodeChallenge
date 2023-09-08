package com.practice.daily_code.programs;

public class Code53 {
    public static void main(String[] args) {
//        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] arr = {0,1,0,2,1,0,1,1,2,1,2,1};
//        int[] arr = {4,2,0,3,2,5};
//        int[] arr = {4,2,3};
//        int[] arr = {5,4,1,2};
//        int[] arr = {2,0,2};
//        int[] arr = {0,1,2,0,3,0,1,2,0,0,4,2,1,2,5,0,1,2,0,2};
        int greatest = Integer.MIN_VALUE;
        int greatestIndex = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=greatest)
            {
                greatest=arr[i];
                greatestIndex= i;
            }
        }
        int count = 0;
        int temp=0;
        int tempIndex = 0;
        for (int i = 1; i < arr.length-1; i++) {
            temp = arr[i-1];
            tempIndex = i-1;
//            if((arr[i-1]>arr[i] && arr[i+1]>arr[i] )&& greatestIndex!=i-1)
//            {
//                count = count + (arr[i+1]-arr[i]);
//                arr[i]= arr[i]+(arr[i+1]-arr[i]);
//            }
            if(tempIndex==greatestIndex)
                continue;

            if((i!=greatestIndex && temp > arr[i]))
            {
                count = count + (temp-arr[i]);
                arr[i]= arr[i] + (temp-arr[i]);
            }
        }
        System.out.println(count);
    }
}
