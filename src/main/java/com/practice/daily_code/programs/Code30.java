package com.practice.daily_code.programs;

import java.util.Arrays;

public class Code30 {

    public static void main(String[] args) {

        int arr[][]= {{5,3,4},{1,5,8},{6,4,2}};
        int sum=0;
        int sum1=0;
        for(int[] array:arr)
        {
            System.out.println(Arrays.toString(array));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <=i; j++) {
                sum = sum + arr[i][j];
            }
        }
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = i; j >= i; j--) {
                System.out.println(arr[i][j]);
                sum1 = sum1 + arr[i][j];
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
    }

}
