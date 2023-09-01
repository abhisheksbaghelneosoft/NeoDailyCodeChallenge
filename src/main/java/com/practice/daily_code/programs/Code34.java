package com.practice.daily_code.programs;

import java.time.LocalDateTime;
import java.util.stream.Stream;

public class Code34 {
    public static LocalDateTime getCurrentDate()
    {
        return LocalDateTime.now();
    }
    public static void main(String[] args) {
        Stream.generate(Code34::getCurrentDate).limit(10).forEach(localDateTime -> System.out.println(localDateTime));

    }
}
