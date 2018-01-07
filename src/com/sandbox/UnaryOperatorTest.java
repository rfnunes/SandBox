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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Stream;

/**
 * Created by pt102933 on 5/10/2016.
 */
public class UnaryOperatorTest {

    public static void main(String[] args) {
        new UnaryOperatorTest().go();
    }

    private void go() {

        Function<Integer, Integer> doubleVal = x -> x * 2;
        Function<MyClass, Integer> mf = MyClass::getI;

        AtomicInteger index = new AtomicInteger(0);

        Stream.generate(MyClass::new)
              .limit(10)
              .peek(m -> m.setI(index.getAndIncrement()))
              .map(mf.andThen(doubleVal))
              .forEach(System.out::println);

        AtomicInteger atomicInteger = new AtomicInteger(0);
        List<Integer> collect = Stream.generate(atomicInteger::getAndIncrement).limit(10).collect(new Collector<Integer, Object, List<Integer>>() {
            @Override
            public Supplier<Object> supplier() {
                return MyList::new;
            }

            @Override
            public BiConsumer<Object, Integer> accumulator() {
                return null;
            }

            @Override
            public BinaryOperator<Object> combiner() {
                return null;
            }

            @Override
            public Function<Object, List<Integer>> finisher() {
                return null;
            }

            @Override
            public Set<Characteristics> characteristics() {
                return null;
            }
        });
        MyList<Integer> myList = new MyList<>();
        myList.addAll(collect);
        myList.replaceAll(x -> x * 10);
        System.out.println(myList);
    }

    private class MyList<T> extends ArrayList<T> {

        @Override
        public void replaceAll(UnaryOperator<T> operator) {
            this.forEach(operator::apply);
        }
    }

    private class MyClass {
        Integer i;

        public void setI(Integer i) {
            this.i = i;
        }

        public Integer getI() {
            return i;
        }
    }
}
