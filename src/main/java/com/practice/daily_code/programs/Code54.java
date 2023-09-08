package com.practice.daily_code.programs;

import java.util.ArrayList;
import java.util.List;

public class Code54 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int n = arr.length;
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrList.add(arr[i]);
        }
        for (int i = 0; i < arr.length+1; i++) {
            if(!(arrList.contains(i)))
                System.out.println(i);
        }
    }
}
