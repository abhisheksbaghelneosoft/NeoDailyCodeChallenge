package com.practice.daily_code.programs;

public class Code48 {
    public static void main(String[] args) {
        String s = "bcadeh";
        String s1 = "hea";

        String longest = s;
        String smallest= s1;
        if(s1.length()==Math.max(s1.length(),s.length()))
        {
            longest=s1;
            smallest=s;
        }
        int count=0;

        for (int i = 0; i < longest.length(); i++) {
            if(smallest.contains(String.valueOf(longest.charAt(i))))
            {
                count++;
                smallest= smallest.replaceFirst(String.valueOf(longest.charAt(i)),"");
            }
        }
        System.out.println((longest.length()+smallest.length())-count);
    }
}