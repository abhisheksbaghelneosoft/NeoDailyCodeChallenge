package com.practice.daily_code.programs;

public class Code47 {
    public static void main(String[] args) {
        String str = "(al)G(al)()()G";
        str=str.replace("()","o");
        str=str.replace("(","");
        str=str.replace(")","");
        System.out.println(str);
    }
}
