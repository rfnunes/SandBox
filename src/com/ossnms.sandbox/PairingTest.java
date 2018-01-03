package com.ossnms.sandbox;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by pt102933 on 6/7/2017.
 */
public class PairingTest {

    public static void main(String[] args) {
        new PairingTest().go();
    }

    private void go() {
        List<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");
        collection.add("D");
        collection.add("E");
        collection.add("F");
        collection.add("G");

        IntStream.range(0, collection.size())
                 .mapToObj(i -> getPair(collection, i))
                 .forEach(System.out::println);
    }

    private Pair<String> getPair(List<String> collection, int i) {
        int j = (i + 1) % collection.size();
        return new Pair<>(collection.get(i), collection.get(j));
    }

    private class Pair<T> {
        private T first;

        private T second;

        Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "[" + first + ", " + second + "]";
        }
    }
}
