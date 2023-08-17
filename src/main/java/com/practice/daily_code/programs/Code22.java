package com.practice.daily_code.programs;

import java.util.Arrays;

public class Code22 {
    static long getCurrentTime(){
        return System.currentTimeMillis();
    }

    public static void main(String[] args) {

        Integer arr[]= {9,7,5,4,8,3,1};

        int n=8;
//        Arrays.sort(arr, Comparator.reverseOrder());
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                double d= i+1;
                System.out.println((d/arr.length)*100);
                break;
            }
        }

    }

}
