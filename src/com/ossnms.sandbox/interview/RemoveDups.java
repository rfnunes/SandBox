package com.ossnms.sandbox.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.util.LinkedList;

public class RemoveDups {

    public static void main(String[] args) {
        new RemoveDups().go();
    }

    private void go() {
        LinkedList<Integer> linkedList = LinkedList.fill(Arrays.asList(1, 1, 2, 3, 3, 5, 6, 7, 7));
        System.out.println(linkedList);
        LinkedList<Integer> noDups = removeDups(linkedList);
        System.out.println(noDups);
    }

    private <T> LinkedList<T> removeDups(LinkedList<T> linkedList) {
        Set<T> foundSet = new HashSet<>();

        LinkedList.LinkedListNode<T> node = linkedList.getHead();

        while(node != null) {
            if(!foundSet.add(node.getObject())) {
                LinkedList.LinkedListNode<T> previous = node.getPrevious();
                LinkedList.LinkedListNode<T> next = node.getNext();

                if (previous != null) {
                    previous.setNext(next);
                }

                if (next != null) {
                    next.setPrevious(previous);
                }
            }
            node = node.getNext();
        }

        return linkedList;
    }

}
