package com.practice.daily_code.programs;

import java.util.Arrays;

public class Code19 {

    public static void main(String[] args) {

        int[] red = {6, 3, 2, 8, 7, 9, 1};
        int[] blue = {8, 6, 7, 2, 3, 1, 9};

//        logic 1 maintaining the order
        for (int i = 0; i < red.length; i++) {
            for (int j = 0; j < red.length; j++) {
                if(red[i]==blue[j]&&(red[i]!=blue[i]))
                {
                    blue[i]=blue[i]+blue[j];
                    blue[j]=blue[i]-blue[j];
                    blue[i]=blue[i]-blue[j];
                }
            }
        }
//        logic 2 sorting both array
//        Arrays.sort(red);
//        Arrays.sort(blue);


        System.out.println(Arrays.toString(red));
        System.out.println(Arrays.toString(blue));
    }

}
