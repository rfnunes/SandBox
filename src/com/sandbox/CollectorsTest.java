/*
 * Copyright (C) Coriant
 * The reproduction, transmission or use of this document or its contents 
 * is not permitted without express written authorization.
 * Offenders will be liable for damages.
 * All rights, including rights created by patent grant or 
 * registration of a utility model or design, are reserved.
 * Modifications made to this document are restricted to authorized personnel only. 
 * Technical specifications and features are binding only when specifically 
 * and expressly agreed upon in a written contract.
 *
 */

package com.ossnms.sandbox;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by pt102933 on 27/3/2017.
 */
public class CollectorsTest {

    public static void main(String[] args) {
        new CollectorsTest().go();
    }

    public void go() {
        List<Integer> list = Arrays.asList(1, null);

        Predicate<Integer> p = i -> Objects.isNull(i) || Objects.nonNull(i);

        boolean resA = list.stream().allMatch(Objects::isNull);
        boolean resB = list.stream().allMatch(Objects::nonNull);

        if(!resA && !resB) {
            System.out.println("fail");
        }

        Stream.of(1, 2, 3, 4, 5)
                 .collect(Collector.of(
                                () -> new int[1],
                                (result, article) -> result[0] += article,
                                (result1, result2) -> {
                                            result1[0] += result2[0];
                                            return result1;
                                }
                 ));

        Person one = new Person("Ana", "PT", 35);
        Person two = new Person("Ana", "UK", 65);
        Person three = new Person("Ana", "PT", 25);

    }

    private class Person {
        private String name;

        private String country;

        private Integer age;

        public Person(String name, String country, Integer age) {
            this.name = name;
            this.country = country;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        public Integer getAge() {
            return age;
        }
    }
}
