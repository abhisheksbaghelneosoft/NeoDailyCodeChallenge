package com.practice.daily_code.programs;

import java.util.HashSet;
import java.util.Set;

public class Code11 {

    public static void main(String[] args) {

        int arr[] = { 3, 1, 2, 6, 9, 4 };
        int k=5;

        Set<Integer> hSet= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(((arr[i]+arr[j])%5)==0)
                {
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }

    }

}
