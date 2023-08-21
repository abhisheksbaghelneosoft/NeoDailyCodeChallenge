package com.practice.daily_code.programs;

public class Code18 {
    public static boolean pallindrome(String str)
    {
        String temp="";
        for (int i = str.length()-1; i >= 0; i--) {
            temp=temp+str.charAt(i);
        }
        return temp.equals(str);
    }

    public static void main(String[] args) {

        String str= "aabcddcbabcxddcbcaa";
//        String str= "malayalam";
        String temp="";
        int greatest=Integer.MIN_VALUE;
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                if (pallindrome(str.substring(i, j))) {
                    if (str.substring(i, j).length() >= greatest) {
                        greatest = str.substring(i, j).length();
                        temp= str.substring(i, j);
                    }
                }
            }
        }
        System.out.println(greatest+" : : "+temp);
    }

}
