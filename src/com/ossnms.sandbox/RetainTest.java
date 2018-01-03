package com.ossnms.sandbox;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by pt102933 on 21/4/2017.
 */
public class RetainTest {

    public static void main(String[] args) {
        new RetainTest().go();
    }

    private void go() {

        Set<Integer> s1 = Collections.emptySet();

        final Set<Integer> set2 = Stream.of(1, 2, 3).collect(Collectors.toSet());

        s1.retainAll(set2);

        System.out.println(s1);

    }
}
