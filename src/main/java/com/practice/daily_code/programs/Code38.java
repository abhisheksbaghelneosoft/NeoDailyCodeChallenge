package com.practice.daily_code.programs;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Code38 {
    public static void main(String[] args) {

//        linear space complexity

        int arr[] = {9, -3, 5, -2, -8, -6, 1, 3};
        int outArr[] = new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0)
            {
                outArr[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0)
            {
                outArr[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(outArr));
    }
}
