package com.practice.daily_code.programs;

import org.apache.el.lang.FunctionMapperImpl;
import org.w3c.dom.css.Counter;

import javax.lang.model.element.Element;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

    private static final Random random = new Random();

    public static int randomGenerate() {
        return random.nextInt(10000, 99999);
    }

    public static boolean startsWithOne(int number) {
        while (number / 10 > 0) {
            number /= 10;
        }
        return number == 1;
    }

    public static void main(String[] args) {

//        Stream.generate(Code41::randomGenerate)
//                .limit(20)
//                .filter(integer -> integer%2==0)
//                .forEach(integer ->
//                System.out.println(integer)
//        );

//        Stream.generate(Code41::randomGenerate)
//                .limit(20)
//                .filter(Code41::startsWithOne)
//                .forEach(System.out::println);

//        Set<Integer> set = new LinkedHashSet<>();
//        Stream.generate(Code41::randomGenerate)
//                .limit(20)
//                .filter(integer -> !(set.add(integer)))
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

//        Optional<Integer> opt=Stream.generate(Code41::randomGenerate)
//        Optional<Object> opt=Stream.of()
//                .limit(20)
//                .findFirst();
//        System.out.println(opt.isPresent()?opt.get():opt.orElse(-1));

//        Stream.generate(Code41::randomGenerate)
//                .limit(20)
//                .findFirst()
//                .ifPresent(System.out::println);

//        System.out.println(
//                Stream.generate(Code41::randomGenerate)
//                        .limit(10)
//                        .distinct()
//                        .count()
//        );

//        Stream.generate(Code41::randomGenerate)
//                .limit(50)
//                .max(Comparator.naturalOrder())
//                .ifPresent(System.out::println);

//        Set<Integer> set = new LinkedHashSet<>();
//        Stream.generate(StreamPractice::randomGenerate)
//                .limit(10)
//                .peek(integer -> System.out.print(integer+" , "))
//                .filter(integer -> !(set.add(integer)))
//                .collect(Collectors.toSet())
//                .stream()
//                .findFirst()
//                .ifPresent(System.out::println);

//        Stream.of('v','b','m','v','b','a')
//                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(characterLongEntry -> characterLongEntry.getValue()==1)
//                .findFirst()
//                .ifPresent(System.out::println);

//        Stream.generate(StreamPractice::randomGenerate)
//                .limit(10)
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);

//        List<Integer> ls= Stream.generate(StreamPractice::randomGenerate)
//                .limit(10).toList();
//
//        List<String> ls1= Stream.of("hello", "world", "test").toList();
//
//        Stream.concat(ls.stream(),ls1.stream())
//                .forEach(System.out::println);

//        Stream.generate(StreamPractice::randomGenerate)
//                .limit(20)
//                .filter(integer -> integer*integer*integer<50)
//                .forEach(System.out::println);


//        IntStream.generate(StreamPractice::randomGenerate)
//                .limit(10)
//                .max()
//                .ifPresent(System.out::println);

//        Stream.of("hello","world","test","cases")
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .forEach((s, aLong) -> System.out.println(s+" : : "+s.length()));

//        Stream.generate(StreamPractice::randomGenerate)
//                .limit(200)
//                .filter(integer -> integer.toString().charAt(0)=='1')
//                .forEach(System.out::println);

//        String str = "Hi There";
//        str = str.toLowerCase();
//        str.chars().mapToObj(value -> (char)value)
//                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//                .entrySet().stream()
//                .filter(characterLongEntry -> characterLongEntry.getKey() != ' ' && characterLongEntry.getValue() == 1)
//                .reduce((characterLongEntry, characterLongEntry2) ->  characterLongEntry2) //to get last non-repeating
////                .reduce((characterLongEntry, characterLongEntry2) -> characterLongEntry) //to get first non-repeating
//                .ifPresent(System.out::println);

        int[] arr = {1,10,100,1000,10000};
        int[] newArr = new int[arr.length];
        int len;
        for (int i = 0; i < arr.length; i++) {
            len=0;
            if(arr[i]<10)
            {
                newArr[i]=1;
            }
            else {
                int temp = arr[i];
                while(temp!=0)
                {
                    temp/=10;
                    len++;
                }
                if(len%2==0)
                    System.out.println(arr[len-1]);
            }
        }

//        String str = "welcome";
////        str.chars().mapToObj(value -> (char)value)
////                .sorted().forEach(System.out::print);
//        char arr[] = str.toCharArray();
//        char c;
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                c= arr[i];
//                if(arr[i]>arr[j])
//                {
//                    arr[i]=arr[j];
//                    arr[j]=c;
//                }
//            }
//        }
//        System.out.println(arr);
    }

}
