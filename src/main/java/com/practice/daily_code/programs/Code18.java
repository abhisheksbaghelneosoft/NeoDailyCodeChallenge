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

        String str= "abcdcbabcddcba";
        String temp="";
        int greatest=Integer.MIN_VALUE;
        for (int i = 0; i <= str.length(); i++) {
            if(pallindrome(str.substring(0,i))){
                if(str.substring(0,i).length()>=greatest)
                {
                    greatest=str.substring(0,i).length();
                }
            }
        }
        for (int i = str.length(); i >= 0 ; i--) {
            if(pallindrome(str.substring(i))){
                if(str.substring(i).length()>=greatest)
                {
                    greatest=str.substring(i).length();
                }
            }
        }
//        int j=0;
//        for (int i = 0; i < str.length(); i++) {
//            if(pallindrome(str.substring(j,i))){
//                if(greatest<=str.substring(j,i).length()){
//                    greatest=str.substring(j,i).length();
//                }
//            }
//            if(i!=0&&i!=str.length())
//            {
//                if(pallindrome(str.substring(j+1,i-1))){
//                    if(greatest<=str.substring(j+1,i-1).length()){
//                        greatest=str.substring(j+1,i-1).length();
//                    }
//                }
//            }
//        }
        System.out.println(greatest);
    }

}
