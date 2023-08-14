package com.practice.daily_code.programs;

import java.util.ArrayList;
import java.util.List;

public class Code12 {
    public static void main(String[] args) {
        int input[]= {1, 2, 3, 4};
        int k=3;

        if(k==1)
        {
            for (int i = 0; i < input.length; i++) {
                System.out.println(input[i]);
            }
        } else if (k==2) {
            for (int i = 0; i <input.length; i++) {
                for (int j = i; j < input.length; j++) {
                    System.out.println("{ "+input[i]+","+input[j]+" }  ");
                }
            }
        } else if(k>2 && k<=input.length) {
            List<ArrayList<Integer>> list= new ArrayList<>();
            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input.length; j++) {
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(input[i]);
                    int count = k;
                    while (count > 1) {
                        arrayList.add(input[j]);
                        count--;
                    }
                    list.add(arrayList);
                }
            }


            for (ArrayList<Integer> arList : list) {
                for (Integer i : arList) {
                    System.out.print(i + "  ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Can't make the set of numbers greater than the length of input array!!");
        }
    }

}