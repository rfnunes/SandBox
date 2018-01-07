package com.ossnms.sandbox;

import java.util.EnumSet;
import java.util.stream.Stream;

public class EnumSetMergeTest {

    enum MyEnum {
        INVALID, A, B, C, D
    }

    public static void main(String[] args) {
        new EnumSetMergeTest().go();
    }

    private void go() {

        EnumSet<MyEnum> one = EnumSet.of(MyEnum.B);
        EnumSet<MyEnum> two = EnumSet.of(MyEnum.A, MyEnum.B);
        EnumSet<MyEnum> three = EnumSet.of(MyEnum.B, MyEnum.C, MyEnum.INVALID);

        Stream.of(one, two, three)
              .reduce((s1, s2) -> { s1.retainAll(s2); return s1;}).orElse(EnumSet.noneOf(MyEnum.class))
              .forEach(System.out::println);

    }
}
