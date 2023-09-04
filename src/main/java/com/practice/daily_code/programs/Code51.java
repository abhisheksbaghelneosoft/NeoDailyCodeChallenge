package com.practice.daily_code.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code51 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        int k = 3;
        int n = arr.size();
        int low = 0;
        int high = (low+k)-1;
        int rounds = (n/k);
        ArrayList<Integer> res1= new ArrayList<>();
        while(rounds!=0){
            for (int j = high; j >= low ; j--) {
                if(j< arr.size())
                    res1.add(arr.get(j));
            }
            low = high+1;
            if((low+k)-1 < arr.size())
                high = (low+k)-1;
            else
                high= arr.size();
            rounds++;
        }
        arr=res1;
        System.out.println(arr);
    }
}
