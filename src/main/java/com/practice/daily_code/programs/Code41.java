package com.practice.daily_code.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class Code41 {
    public static void main(String[] args) {
        String str = "thequickbr*ow#nfox?jumpsoverthelazydg";
//        String str = "leetcode";
        str= str.toLowerCase();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>=97 && str.charAt(i)<=122)
                set.add(str.charAt(i));
        }
        System.out.println((set.size()==26)?"Pangram":"Not a pangram");
        System.out.println(set);
    }
}
