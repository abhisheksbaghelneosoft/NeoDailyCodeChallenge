package com.practice.daily_code.programs;

import java.util.ArrayList;
import java.util.List;

public class Code12 {

    //trying recursion

//    public static List<ArrayList<Integer>> findCombination(List<ArrayList<Integer>> list,int arr[],int k,int count){
//        if(count==0)
//        {
//            return list;
//        }
//        else {
//            int i = k;
//            for (int j = 0; j < arr.length; j++) {
//                ArrayList<Integer> arrList = new ArrayList<>();
//                while (i > 0) {
//                    arrList.add(arr[j]);
//                    i--;
//                }
//                list.add(arrList);
//            }
//            return findCombination(list, arr, k, count - 1);
//        }
//    }

    public static void main(String[] args) {

        int input[]= {1, 2, 3, 4};
        int k=4;
        List<ArrayList<Integer>> list= new ArrayList<>();

//        on k=2 expected output= {1, 1}, {1, 2}, {1, 3}, {1, 4}, {2, 2}, {2, 3}, {2, 4}, {3, 3}, {3, 4}, {4, 4}

        if(k==2)
        {
            for (int i = 0; i <input.length; i++) {
                for (int j = i; j < input.length; j++) {
                    System.out.println("{ "+input[i]+","+input[j]+" }  ");
                }
            }
        }

        else {
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


    }

}