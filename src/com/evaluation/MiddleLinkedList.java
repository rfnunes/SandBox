package com.evaluation;

import com.util.LinkedList;

public class MiddleLinkedList {

    public static void main(String[] args) {
        new MiddleLinkedList().go();
    }

    private void go() {
        LinkedList<Integer> linkedList = getLinkedList();
        System.out.println(findMiddle(linkedList.getHead()));
    }

    private <T> T findMiddle(final LinkedList.LinkedListNode<T> head) {

        int length = 0;

        LinkedList.LinkedListNode<T> current = head;
        LinkedList.LinkedListNode<T> middle = head;

        while (current.getNext() != null) {
            length++;

            if(length % 2 == 0) {
                middle = middle.getNext();
            }

            current = current.getNext();
        }

        length++;

        if(length%2 == 0){
            middle = middle.getNext();
        }

        System.out.println("Linked List length is " + length);

        return middle.getObject();
    }

    private LinkedList<Integer> getLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>(null);
        linkedList.add(new LinkedList.LinkedListNode<>(1));
        linkedList.add(new LinkedList.LinkedListNode<>(2));
        linkedList.add(new LinkedList.LinkedListNode<>(3));
        linkedList.add(new LinkedList.LinkedListNode<>(4));
        //linkedList.add(new LinkedList.LinkedListNode<>(5));
        return linkedList;
    }
}
