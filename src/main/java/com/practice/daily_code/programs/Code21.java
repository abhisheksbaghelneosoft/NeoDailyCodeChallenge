package com.practice.daily_code.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class Code21 {
    public static void main(String[] args) {
        String str="abihvkjbvoiwnnvlkkw";
        Map<Character,Integer> map= new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),1);
            }
            else
            {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }
//        for(Map.Entry<Character,Integer> entry: map.entrySet())
//        {
//            if( entry.getValue() == 1 )
//                System.out.println(entry.getKey()+" : : "+entry.getValue());
//        }
        System.out.println(map);
    }
}
