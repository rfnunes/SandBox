package com.evaluation;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaRandom {

    public static void main(String[] args) {
        new LambdaRandom().go();
    }

    private void go() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(getRandomSubset(list));
        System.out.println(getRandomSubset(list));
        System.out.println(getRandomSubset(list));
        System.out.println(getRandomSubset(list));
        System.out.println(getRandomSubset(list));
        System.out.println(getRandomSubset(list));
    }

    private List<Integer> getRandomSubset(List<Integer> list) {
        Random randomSize = new Random();
        Random randomIndex = new Random();

        return
        IntStream.range(0, randomIndex.nextInt(list.size()))
                 .limit(randomSize.nextInt(list.size()))
                 .map(list::get)
                 .boxed()
                 .collect(Collectors.toList());
    }
}
