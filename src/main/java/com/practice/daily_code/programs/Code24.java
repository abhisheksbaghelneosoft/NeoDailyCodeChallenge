package com.practice.daily_code.programs;

import java.util.*;
import java.util.stream.Collectors;

public class Code24 {

    public static void main(String[] args) {

        List<String> ls= new ArrayList<>();
        ls.add("Abhishek");
        ls.add("Abhishek");
        ls.add("Abhishek");
        ls.add("Arbaaz");
        ls.add("Arbaaz");
        ls.add("Arbaaz");
        ls.add("Arbaaz");
        ls.add("Acchutam");
        ls.add("Acchutam");
        ls.add("Acchutam");
        ls.add("Acchutam");
        ls.add("Acchutam");

        ls.stream().collect(Collectors.groupingBy(name->name))
                .forEach((x,y)->{
                    System.out.println(x+" : : "+y.size());
                });
//        Set<String> set= ls.stream().collect(Collectors.toSet());
        Map mp=ls.stream().distinct().collect(Collectors.toMap(p->p, p->p.length()));
        System.out.println(mp);

//        ls.stream().collect(Collectors.joining(","));
    }

}
