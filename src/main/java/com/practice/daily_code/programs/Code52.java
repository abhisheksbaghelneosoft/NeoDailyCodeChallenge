package com.practice.daily_code.programs;

import java.util.*;

public class Code52 {
    public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length()!=str2.length())
             return false;
        Map<Character,Character> map = new LinkedHashMap<>();
        boolean flag = false;
        for (int i = 0; i < str1.length(); i++) {
            if(map.containsKey(str1.charAt(i)))
            {
                flag = map.get(str1.charAt(i))==str2.charAt(i);
                if(!flag)
                    return flag;
            }
            else {
                if(map.containsValue(str2.charAt(i)))
                    return false;
                map.put(str1.charAt(i),str2.charAt(i));
                flag = true;
            }
        }
        System.out.println(map);
        return flag;
    }
    public static void main(String[] args) {
        String str1 = "rfkqyuqf";
        String str2 = "jkxyqvnr";
        System.out.println(areIsomorphic(str1,str2));
    }
}
