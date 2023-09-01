package com.practice.daily_code.programs;

import java.util.Arrays;

public class Code39 {
    public static void main(String[] args) {

//        constant space complexity

        int arr[] = {9, -3, 5, -2, -8, -6, 1, 3};
        for (int i = 0,j=0; i < arr.length; i++) {
            if(arr[i]<0)
            {
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
