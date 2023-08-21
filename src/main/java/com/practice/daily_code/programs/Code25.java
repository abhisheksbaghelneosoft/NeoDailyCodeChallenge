package com.practice.daily_code.programs;

import java.util.Arrays;

public class Code25 {

    public static void main(String[] args) {

        int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]= {{1,2,3},{4,5,6},{7,8,9}};
        if(arr2[0].length==arr1.length) {
            int output[][] = new int[arr2[0].length][arr1.length];

            for (int i = 0; i < output.length; i++) {
                for (int j = 0; j < output.length; j++) {
                    int sum = 0;
                    for (int k = 0; k < arr2.length; k++) {
                        sum += (arr1[i][k] * arr2[k][j]);
                    }
                    output[i][j] = sum;
                }
            }
            for (int i = 0; i < output.length; i++) {
                System.out.println(Arrays.toString(output[i]));
            }
        }
        else{
            System.out.println("Not eligible for product");
        }

    }
}
