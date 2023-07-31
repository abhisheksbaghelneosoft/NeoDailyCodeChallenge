package com.practice.daily_code.programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Code6 {

    public static void main(String[] args) {
        int input[]= {5, 4, 5, 5, 3, 1, 2, 2, 4};
        int output[]= new int[input.length];
//        expected output = { 1, 1, 1, 2, 2, 3 }
//        expected output = {5, 5, 5, 4, 4, 3, 1, 2, 2 } 5, 4, 5, 5, 3, 1, 2, 2, 4
        HashSet<Integer> hSet= new LinkedHashSet<>();
        for(int x: input)
        {
            hSet.add(x);
        }
        int temp=0;
        int j=0;
        if(input.length==hSet.size())
        {
            output=input;
            System.out.println("all unique");
        }
        else {
            Iterator it = hSet.iterator();
            while (it.hasNext()) {
                temp = (int) it.next();
                for (int i = 0; i < input.length; i++) {
                    if (temp == (input[i])) {
                        output[j] = input[i];
                        j++;
                    }
                }
            }
        }

        for(int x : output)
        {
            System.out.print(x+" ");
        }


    }

}
