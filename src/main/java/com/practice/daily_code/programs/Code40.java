package com.practice.daily_code.programs;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.stream.Stream;

@Slf4j
public class Code40 {
    private static final Random random = new Random();
    public static int generateNumber()
    {
        return random.nextInt(10,20);
    }

    public static void main(String[] args) {
        Stream.generate(Code40::generateNumber).limit(50).distinct().forEach(
                integer -> {if(integer<20)log.info(" :: "+integer);}
        );
    }
}
