package com.practice.daily_code.programs;

public class Code11 {

    public static void main(String[] args) {

        int arr[] = { 3, 1, 2, 6, 9, 4 };
        int k=5;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(((arr[i]+arr[j])%5)==0)
                {
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }

    }

}
