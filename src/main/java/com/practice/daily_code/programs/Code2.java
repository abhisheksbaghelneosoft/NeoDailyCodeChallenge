package com.practice.daily_code.programs;

import java.util.HashMap;
import java.util.Map;

public class Code2 {

    public static void main(String[] args) {

        int arr[]={2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};
        int l=1;

        HashMap<Integer,Integer> hash= new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i]))
            {
                hash.put(arr[i],hash.get(arr[i])+1);
            }
            else
            {
                hash.put(arr[i],1);
            }
        }
        int max=0;
        int val=0;

        for(Map.Entry<Integer,Integer> entry: hash.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
            if(entry.getValue()>max) {
                max = entry.getValue();
                val= entry.getKey();
            }
        }
        int newArr[]= new int[max];
        for (int i = 0; i < max; i++) {

            newArr[i]=val;
            
        }
        for (int i:newArr
             ) {
            System.out.println(i);
        }


    }

}
