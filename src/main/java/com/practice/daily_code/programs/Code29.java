package com.practice.daily_code.programs;

public class Code29 {

    public static void main(String[] args) {

        String str = "samplecase";

//        way1
        String result="";
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='A'
                    ||str.charAt(i)=='e'||str.charAt(i)=='E'
                    ||str.charAt(i)=='i'||str.charAt(i)=='I'
                    ||str.charAt(i)=='o'||str.charAt(i)=='O'
                    ||str.charAt(i)=='u'||str.charAt(i)=='U'){
                result=result + str.charAt(i);
                counter++;
            }
        }
        System.out.println("Total vowels : : "+counter+" and Result : : "+result    );



//        way2
        String vow= "aeiouAEIOU";
        int count=0;
        String temp="";
        for (int i = 0; i < str.length(); i++) {
            if(vow.contains(String.valueOf(str.charAt(i)))){
                temp= temp+str.charAt(i);
                count++;
            }
        }
        System.out.println("Total vowels : : "+count+" and Result : : "+temp);
    }

}
