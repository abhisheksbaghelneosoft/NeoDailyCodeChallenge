package com.practice.daily_code.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code13 {

    public static void main(String[] args) {

        Integer input[]={4, 6, 1, 7, 5, 9, 2};
        List<Integer> list= new ArrayList<>();
        Arrays.asList(input).stream().peek(integer -> list.add(integer)).collect(Collectors.toList());
        for(Integer i : list)
        {
            System.out.println(i);
        }

        //incomplete




    }

}
