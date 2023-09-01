package com.practice.daily_code.programs;

import lombok.*;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee
{
    private Integer id;
    private String name;
    private Long salary;
}

public class Code44 {

    private static final Random random = new Random();
    public static Employee generateStream()
    {
        byte[] array = new byte[7]; // length is bounded by 7
        random.nextBytes(array);
        String name = new String(array, StandardCharsets.UTF_8);
        Long salary = random.nextLong(1,20)*10000;
        Integer id = random.nextInt(1,100);
        return new Employee(id,name,salary);
    }

    public static void main1(String[] args) {
        Stream.generate(Code44::generateStream)
                .limit(5)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .peek(System.out::println)
                .toList().stream()
                .skip(1).limit(1)//.max(Comparator.comparing(Employee::getSalary))
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static void main2(String[] args) {
        Stream.generate(Code44::generateStream)
                .limit(20)
                .filter(employee -> employee.getSalary()>110000)
                .forEach(employee->System.out.println(employee.getId()+" : : "+employee.getName()+" : : "+ employee.getSalary()));
    }

    public static void main3(String[] args) {
        Stream.generate(Code44::generateStream)
                .dropWhile(employee -> employee.getId()==25)
                .toList().forEach(System.out::println);
    }

    public static void main(String[] args) {

    }
}
