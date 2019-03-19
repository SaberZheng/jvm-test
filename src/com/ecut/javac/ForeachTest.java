package com.ecut.javac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForeachTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        // JDK1.8
        List<Integer> list2 = Stream.of(1, 2, 3, 4).collect(Collectors.toList());
        // JDK1.9
        //List<Integer> list3 = Lists.newArrayList(1, 2, 3, 4);
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println(sum);


    }
}
