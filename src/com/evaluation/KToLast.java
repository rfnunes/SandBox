package com.evaluation;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.util.LinkedList;

public class KToLast {

    public static void main(String[] args) {
        new KToLast().go();
    }

    private void go() {
        LinkedList<Integer> linkedList = LinkedList.fill(IntStream.rangeClosed(1, 10)
                                                                  .boxed()
                                                                  .collect(Collectors.toList()));

        System.out.println(getKtoLast(linkedList, 3));
        System.out.println(getKtoLastOnePass(linkedList, 3));
    }

    private <T> T getKtoLastOnePass(LinkedList<T> linkedList, int i) {
        LinkedList.LinkedListNode<T> it = linkedList.getHead();
        LinkedList.LinkedListNode<T> nBehind = linkedList.getHead();
        int count = 1;

        while(it.getNext() != null) {
            it = it.getNext();
            if(count >= i) {
                nBehind = nBehind.getNext();
            }
            count++;
        }

        return nBehind.getObject();
    }

    private <T> T getKtoLast(LinkedList<T> linkedList, int n) {
        LinkedList.LinkedListNode<T> node = linkedList.getHead();
        while(node.getNext() != null) {
            node = node.getNext();
        }

        for(int i = 1; i < n; i++) {
            node = node.getPrevious();
        }

        return node.getObject();
    }
}
