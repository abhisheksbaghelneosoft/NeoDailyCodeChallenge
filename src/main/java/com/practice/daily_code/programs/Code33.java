package com.practice.daily_code.programs;

public class Code33 {
    public static void main(String[] args) {
        int arr[][]={{1,2},{1,2,3},{1,2,3,4}};
//        System.out.println(arr.length);
        for (int i = 0,j = 0; i < arr.length;) {
            if(j >= arr[i].length)
            {
                j=0;
                i++;
            }
            else {
                System.out.println(arr[i][j++]);
            }
        }
    }
}
