package com.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    void reverse() {
        List<Integer> elements = Arrays.asList(1, 2, 3);
        List<Integer> expected = new ArrayList<>(elements);
        Collections.reverse(expected);
        LinkedList<Integer> linkedList = LinkedList.fill(elements);
        assertEquals(LinkedList.fill(expected), LinkedList.reverse(linkedList));
    }
}