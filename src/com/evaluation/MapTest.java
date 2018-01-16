package com.evaluation;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest {

    public static void main(String[] args) {
        new MapTest().go();
    }

    private void go() {

        Map<String, Integer> map = new TreeMap<>();

        List<String> collect = Stream.of("one", "two", "three", "one").collect(Collectors.toList());

        for (String s : collect) {
            Integer integer = map.putIfAbsent(s, 1);
            if(integer != null) {
                map.put(s, integer+1);
            }
        }

        System.out.println(map);

    }
}
