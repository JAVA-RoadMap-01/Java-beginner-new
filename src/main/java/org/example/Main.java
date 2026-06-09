package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

//STREAM API

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,6,7);

        //Stream<Integer> data = nums.stream().map(n -> n*2);
        //Predicate<Integer> test = n -> n%2==1;

//        nums.stream()
//                .filter(test)
//                .map(n -> n*2)
//                .forEach(n-> System.out.println(n));

        nums.parallelStream()
                .forEach(n -> System.out.println(n));

        //other way :  nums.stream().parallel();
       // Stream<Integer> mappedData = data.map(n -> n*2);
        //mappedData.forEach(n -> System.out.println(n));
        //Streams can be only used once.
//        data.forEach(n -> System.out.println(n));
//        data.forEach(System.out::println);

        //Traditional way
//        for(int n : nums){
//            System.out.println(n*2);
//        }

    }
}