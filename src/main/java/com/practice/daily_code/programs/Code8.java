package com.practice.daily_code.programs;

import java.util.*;

public class Code8 {

//    	  T's   DL  Profit
//        1	    9	15
//        2	    2	2
//        3	    5	18
//        4	    7	1
//        5	    4	25
//        6	    2	20
//        7	    5	8
//        8	    7	10
//        9	    4	12
//        10	3	5

    public static void main(String[] args) {

        Integer taskArr[][]= {{15,9},{2,2},{18,5},{1,7},{25,4},{20,2},{8,5},{10,7},{12,4},{5,3}};

        Arrays.sort(taskArr, Comparator.comparing(o->o[0]));

        int output[]= new int[taskArr.length];

        int j=0;
        for(int i=(taskArr.length-1);i>=0;i--)
        {
            j=taskArr[i][1];
            boolean flag= false;
//            System.out.println(taskArr[i][0]+"  : : "+j);

            for(int k=j;k!=0;k--) {
                if (output[k] == 0) {
                    output[k] = taskArr[i][0];
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                System.out.println("No match found for task with profit :: "+taskArr[i][0]);
            }
        }
//        for(Integer i[]: taskArr)
//        {
//            for (Integer x:i)
//            {
//                System.out.print(x+"  ");
//            }
//            System.out.println();
//        }

        int sum=0;
        for(Integer i : output)
        {
            sum=sum+i;
//            System.out.println(i);
        }
        System.out.println("Maximum profit :: "+sum);




    }

}
