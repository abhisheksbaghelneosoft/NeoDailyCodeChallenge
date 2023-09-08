package com.practice.daily_code.programs;

import java.util.Random;
import java.util.stream.Stream;

public class Code56 {

    private static Random random = new Random();

    public static int generateStream()
    {
        return random.nextInt(1,100);
    }

    public static void main(String[] args) {
        Stream.generate(Code56::generateStream).limit(10).peek(System.out::println).sorted().reduce((integer, integer2) -> integer2).ifPresent(System.out::println);
    }
}
