package com.practice.daily_code.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class Code7 {

    public static void main(String[] args) {

        int input[]= {5, 4, 5, 5, 3, 1, 2, 2, 4};
        Map<Integer,Integer> hMap= new LinkedHashMap<>();
        for (int i = 0; i<input.length ; i++) {
            if(hMap.containsKey(input[i]))
            {
                hMap.put(input[i], hMap.get(input[i])+1);
            }
            else
            {
                hMap.put(input[i],1);
            }
        }

        int output[]= new int[input.length];

        int j=0;

        for(Map.Entry<Integer,Integer> entry: hMap.entrySet())
        {
            for(int i=0;i<entry.getValue();i++)
            {
                output[j]= entry.getKey();
                j++;
            }

//            System.out.println(entry.getKey()+" :: "+entry.getValue());
        }

        for(int x: output)
        {
            System.out.print(x+" ");
        }


    }

}
